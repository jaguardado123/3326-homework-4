# Homework 4

In this homework you will practice working with **Polymorphism** topics: **Overload**, **Override**, and **Polymorphic Variables**.

## Before you start

### Overload

Almost all programming languages allow us to have multiple methods with the same name, as long as they're overloading. Overloading is when we have methods with the same name but different **signatures**.

What is a Signature?

A signature is the assembly code translation of a method name and is composed of the following:
1. The method's name.
2. The method's parameter types.
3. The method's parameter order.

**Example:**

```java
public class Poly {
    
    public void sameName() {
        System.out.println("hello world");
    }
    
    // The method's type is not part of the signature.
    public String sameName(String name) {
        return "hello " + name;
    }
    
    public void sameName(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    
    // Methods can have the same parameter types as long as they're in different order.
    public void sameName(int number, String name) {
        System.out.println(name + ", their favorite number is " + number);
    }
}
```

To learn more, visit: https://www.w3schools.com/Java/java_methods_overloading.asp 

### Override

Can we have methods with the same name and signature? 

Yes, this is known as overriding.

Overriding, is when we have multiple methods with the same name, type, and signature. However, **overriding can only occur with Inheritance**. This happens when the *parent-class* and *child-class* have a method with the same name, type, and signature and the *child-class* method re-defines the *parent-class* method. 

When overrding a method from a *parent-class*, it's important to add an `@Override` annotation above the *child-class* method. This annotation is not required for overriding, but it ensures that overriding is done correctly.

After a method is overriden is it gone forever? No, there is one way to still use the original *parent-class* method and that's by using **super** within the *child-class*. 

**Example:**

```java
class Pet {
    public void about() {
        System.out.println("This is a pet.");
    }
}

class Dog extends Pet {
    // This about() method will redefine Pet's about() method.
    @Override // <- This is good practice!
    public void about() {
        System.out.println("This is a dog.");
    }

    public void pet_about() {
        // Pet's about() method isn't entirely gone.
        // It can still be used from within the Dog class using super.
        super.about();
    }
}

public class Main {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.about(); // This is a dog
        spot.pet_about(); // This is a pet.
    }
}
```

To learn more, visit: https://www.programiz.com/java-programming/method-overriding

### Polymorphic Variables

When a *child-class* extends to a *parent-class* it now has an *"is a"* relationship with the *parent-class*.

Now, let's assume we have a class **SportsCar** that extends to a class **Car**, and we then create a standard SportsCar object `SportsCar mustang = new SportsCar();`. The variable `mustang` can access class members from both **SportsCar and Car**. <ins>This is because the object it's referencing is both a SportsCar and Car thanks to *Inheritance*</ins>
 
Variables that can access class members from multiple classes are called **Polymorphic Variables**.

Polymorphic Variables give us the ability to declare variables using the type of the *parent-class*, for example: `Car charger = new SportsCar();`, because a **SportsCar *"is a"* Car**. Now, the variable `charger` can only access class members from **Car**, however it can access class members from **SportsCar** by simply using typecasting: `((SportsCar) charger)`.

**Example:**
```java
class Animal {
    public void habitat() { 
        System.out.print("Lives on Earth."); 
    }
}

// Pet "is an" Animal
class Pet extends Animal {
    public void domestic() {
        System.out.print("Has an owner.");
    }
}

// Dog "is a" Pet & "is an" Animal
class Dog extends Pet {
    public void speak() {
        System.out.print("Bark! Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Dog variable referencing a Dog object
        Dog spot = new Dog();
        // spot can access all members of Dog, Pet, & Animal
        spot.speak(); 
        spot.domestic(); 
        spot.habitat();

        // Pet variable referencing a Dog object
        Pet poodle = new Dog();
        // poodle can only access members of Pet & Animal
        poodle.domestic(); 
        poodle.habitat();
        // poodle can still access Dog members with typecasting
        ((Dog) poodle).speak();

        // Animal variable referencing a Dog object
        Animal canine = new Dog();
        // canine can only access members of Animal
        canine.habitat();
        // canine can still access Pet & Dog members with typecasting
        ((Pet) canine).domestic();
        ((Dog) canine).speak();
    }
}
```

To learn more, visit: https://www.w3schools.com/java/java_polymorphism.asp and https://www.programiz.com/java-programming/polymorphism#polymorphic-variable

<br>

### Let's begin!

## Problem 1

### Cinemark Products - Overloading

Assume you are hired by Cinemark to update their pricing software for their products such as popcorn and movie tickets.

However, during your hiring interview you told the CEO of Cinemark Sean Gamble that you are an expert in OOP. Now it's time to show-off your skills.

**Your task:**

Overload the `cost()` method inside the **Product** class, such that it can accept arguments for the following scenarios.

- `cost(price)`
- `cost(price, discount_percent)`
- `cost(price, promo_code)`

Next, make the classes **Popcorn** and **MovieTicket** inherit the Product class, since they are both Cinemark products. Overload the `cost()` method such that they accept arguments for the scenarios below.

- `cost(price, size, seasoned)`
- `cost(showtime, price, quantity)`

Make sure your methods follow the instructions in the comments.

You can test your solution by running `Test_Problem1.java`.

<br>

## Problem 2

### Number Lists - Override

The following classes have been provided to you: **Math**, **Largest**, **Smallest**, and **Average**.

The **Math** class has a `list()` method that receives an array of numbers, but simply returns `0`. Your task is to redefine this method in various *sub-classes* to perform an actual task.

**Your task:**

Make classes **Largest**, **Smallest**, and **Average** inherit the **Math** class, then do the following:

- Override the `list()` method inside **Largest** to return the largest number in the array.
- Override the `list()` method inside **Smallest** to return the smallest number in the array.
- Override the `list()` method inside **Average** to return the average of the numbers in the array.

You can test your solution by running `Test_Problem2.java`.

<br>

## Problem 3

### Multi-Database Inventory System - Polymorphic Variables

Assume you are a software engineer hired by a new start up company StoreAnywhere Inc that prides itself in being compatible with all database managing systems including: SQLite, Microsoft SQL, Firebase, and Supabase.

As an OOP expert you decide write an **Inventory** class that uses *composition* with the class **Database**.

```java
// Inside problem3/Database.java
public class Database {
    public String connect() { ... }
}
// Inside problem3/Inventory.java
public class Inventory {
    private Database db; 
    public void connectionType(String type) { ... }
    public void connectionStatus() { ... }
}
```

Next, you create classes for **SQLiteDB**, **MicrosoftSQL_DB**, **FirebaseDB**, and **SupabaseDB**. 

Then the CEO stops by your office and asks you *"Why do you only have one variable db of type Database? Shouldn't you have multipe for SQLite, Firebase, and the rest?"*. You of course explain to him what polymorphic variables are and continue coding.

**Your task:**

- Make classes **SQLiteDB**, **MicrosoftSQL_DB**, **FirebaseDB**, and **SupabaseDB** inherit the **Database** class to establish an "is a" relationship.

- Override the `connect()` method inside **SQLiteDB**, **MicrosoftSQL_DB**, **FirebaseDB**, and **SupabaseDB** to return the correct String.

- Update the `connectionStatus(type)` method inside **Inventory** to instantiate the correct class according to the value of `type`.

Make sure to follow the instructions in the comments.

You can test your solution by running `Test_Problem3.java`.

<br>

## Grading Criteria
| Criteria | Points |
|---|---|
| Problem 1 MovieTicket and Popcorn don't inherit Product. | -10 |
| Problem 1 The cost() method isn't overloaded as instructed. | -15 |
| Problem 2 Average, Largest, and Smallest don't inherit Math. | -10 |
| Problem 2 The list() method isn't overriden as instructed. | -15 |
| Problem 2 @Override isn't used. | -5 |
| Problem 3 FirebaseDB, SupabaseDB, SQLiteDB, and MicrosoftSQL_DB don't inherit Database. | -10 |
| Problem 3 The connect() method isn't overriden as instructed and doesn't use @Override. | -15 |
| Problem 3 The connectionStatus() method isn't implemented as instructed. | -20 |

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
