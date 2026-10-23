#!/usr/bin/env bash

set -euo pipefail

repo_dir="$(cd -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd)"
junit_jar="$repo_dir/lib/junit-4.13.2.jar"
hamcrest_jar="$repo_dir/lib/hamcrest-core-1.3.jar"

for command in javac java sed; do
    if ! command -v "$command" >/dev/null 2>&1; then
        printf 'Error: required command not found: %s\n' "$command" >&2
        exit 1
    fi
done

for jar in "$junit_jar" "$hamcrest_jar"; do
    if [[ ! -f "$jar" ]]; then
        printf 'Error: required dependency not found: %s\n' "$jar" >&2
        exit 1
    fi
done

build_dir="$(mktemp -d)"
trap 'rm -rf "$build_dir"' EXIT
mkdir -p "$build_dir/tests" "$build_dir/classes"

cp "$repo_dir/src/Test_Problem1.java" "$build_dir/tests/"

sed 's/^import problem2\.\*;/import problem2.Math;\nimport problem2.*;/' \
    "$repo_dir/src/Test_Problem2.java" > "$build_dir/tests/Test_Problem2.java"
sed -i '$d' "$build_dir/tests/Test_Problem2.java"
printf '\n\tprivate static void expect(boolean actual, boolean expected) {\n\t\tassertEquals(expected, actual);\n\t}\n}\n' \
    >> "$build_dir/tests/Test_Problem2.java"

cp "$repo_dir/src/Test_Problem3.java" "$build_dir/tests/Test_Problem3.java"
sed -i '$d' "$build_dir/tests/Test_Problem3.java"
printf '\n\tprivate static void expect(String actual, String expected) {\n\t\tassertEquals(expected, actual);\n\t}\n}\n' \
    >> "$build_dir/tests/Test_Problem3.java"

mapfile -d '' source_files < <(find "$repo_dir/src/problem1" "$repo_dir/src/problem2" "$repo_dir/src/problem3" -name '*.java' -print0)

printf 'Compiling source and test files...\n'
javac -cp "$junit_jar:$hamcrest_jar" -d "$build_dir/classes" \
    "${source_files[@]}" "$build_dir/tests/Test_Problem1.java" \
    "$build_dir/tests/Test_Problem2.java" "$build_dir/tests/Test_Problem3.java"

printf 'Running JUnit tests...\n'
java -cp "$build_dir/classes:$junit_jar:$hamcrest_jar" \
    org.junit.runner.JUnitCore Test_Problem1 Test_Problem2 Test_Problem3
