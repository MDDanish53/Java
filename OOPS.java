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

public class OOPS {
  public static void main(String args[]) {
    Child first = new Child();
    first.behaviour = "gentle";
    first.appearance = "ordinary";
    first.mentality = "focused";
    first.printInfo();
  }
}
