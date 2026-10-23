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

Remember *Inheritance* and *Chain Inheritance*?

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


You can test your solution by running `Test_Problem1.java`.

<br>

## Problem 2

### Number Lists - Override


You can test your solution by running `Test_Problem2.java`.

<br>

## Problem 3

### Multi-Database Inventory System - Polymorphic Variables


You can test your solution by running `Test_Problem3.java`.

<br>

## Grading Criteria
| Criteria | Points |
|---|---|
| Problem 1 Node class is not inside Node.java | -10 |
| Problem 1 LinkedList class does not pass the tests | -20 |
| Problem 2 House class is not inside House.java | -10 |
| Problem 2 Condo, Duplex, and Townhouse do not pass tests | -20 |
| Problem 2 There is duplicate attributes | -10 |
| Problem 3 Employee, Manager, RegionalManager don't pass tests | -20 |
| Problem 3 There is duplicate attributes | -10 |

[How to Submit Assignments to GitHub](https://joselitoguardado.dev/3326/How_to_Submit_Assignments_to_GitHub.pdf)
