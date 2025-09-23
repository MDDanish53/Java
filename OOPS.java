class Pen {
  // properties of class
  String color;
  String type;
  // method of class
  public void write() {
    System.out.println("Writing Something");
  }
  public void printColor() {
    System.out.println(this.color);
  }
}

class Student {
  String name;
  int age;
  int standard;

  public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
    System.out.println(this.standard);
  }

  Student(Student s1) {
    this.name = s1.name;
    this.age = s1.age;
    this.standard = s1.standard;
  }

  Student() {
    System.out.println("Object created successfully");
  }
}

// ----------------------------------------------------------------------------------------

// Polymorphism in Java's OOPS
class Polymorphism {
  String name;
  int marks;
  String city;

  Polymorphism(String name, int marks, String city) {
    this.name = name;
    this.marks = marks;
    this.city = city;
    System.out.println("Object created successfully");
  }

  public void printInfo(String name) {
    System.out.println(name);
  }

  public void printInfo(String city, String name) {
    System.out.println(city+" "+name);
  }

  public void printInfo(int marks) {
    System.out.println(marks);
  }

  public void printInfo(String name, int marks, String city) {
    System.out.println(name+" "+marks+" "+city);
  }
}

// --------------------------------------------------------------------------------------------

// Inheritance in Java's OOPS
// Base (Parent) class
class Parent {
  String behaviour;
  String appearance;
  String mentality;
}

// Sub (Child) class
class Child extends Parent {
  public void printInfo() {
    System.out.println(this.behaviour+" "+this.appearance+" "+this.mentality);
  }
}

// Types of Inheritance
// 1. Single Level Inheritance
class Shape {
  public void area() {
    System.out.println("displays area");
  }
}

class Triangle extends Shape {
  public void area(int l, int h) {
    System.out.println(1/2 * l * h);
  }
}

// 2. Multi Level Inheritance
// Level 1
class GrandFather {
  public void manners() {
    System.out.println("Respect and Help Everyone");
  }
}

// Level 2
class Father extends GrandFather {
  public void manners() {
    System.out.println("Respect Everyone and help them when needed");
  }
}

// Level 3
class Me extends Father {
  public void manners() {
    System.out.println("Help everyone and treat them kindly");
  }
}

// 3. Hierarchical Inheritance
class Fruit {
  public void taste() {
    System.out.println("The taste is good");
  }
}

class Mango extends Fruit {
  public void taste() {
    System.out.println("Sweet");
  }
}

class Orange extends Fruit {
  public void taste() {
    System.out.println("Sweet and Sour");
  }
}

// 4. Hybrid Inheritance (Includes all types of inheritance)

// ------------------------------------------------------------------------------------------

// Abstraction
abstract class Animal {
  Animal() {
    System.out.println("You are creating a new animal");
  }
  abstract void walk();
  public void eat() {
    System.out.println("Animal eats");
  }
}

class Horse extends Animal {
  public void walk() {
    System.out.println("Walks on 4 legs");
  }
}

class Chicken extends Animal {
  Chicken() {
    System.out.println("You have created chicken");
  }
  public void walk() {
    System.out.println("Walks on 2 legs");
  }
}

// Pure Abstraction using interfaces

interface Car {
  void start();
  void drift();
}

class Lamborghini implements Car {
  public void start() {
    System.out.println("Car is started");
  }
  public void drift() {
    System.out.println("Car drifts smoothly");
  }
}

// Multiple inheritance using interface
interface ProgrammingLanguage {
  void code();
}

interface Compiler {
  void output();
}

class Output implements ProgrammingLanguage, Compiler {
  public void code() {
    String code = "System.out.println('Hello World')";
  }
  public void output() {
    System.out.println("Code compiled successfully");
  }
}

// -----------------------------------------------------------------------------------------------------------

// static keyword in java

class Vidyalay {
  String name;
  static String school;
  static void changeSchool() {
    school = "newSchool";
  }
}

public class OOPS {
  public static void main(String args[]) {
    Vidyalay.school = "Dilasagram";
    Vidyalay s1 = new Vidyalay();
    s1.name = "Danish";
    System.out.println(Vidyalay.school); 
  }
}
