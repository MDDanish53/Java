package strings;


import java.util.Scanner;

public class Strings {
  public static void main(String args[]) {

    // String Declaration - (Strings are immutable in Java)

    String goodName = "Mohammad Danish";
    System.out.println(goodName);

    // Taking string as input and printing it

    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your name = ");
      String name = sc.nextLine();
      System.out.print("Your name is = "+name);
  }

  // String concatenation

  String firstName = "Danish";
  String lastName = "Siddique";
  String fullName = firstName + " " + lastName;
  System.out.println(fullName);
  System.out.println(fullName.length()); // printing the length of the string

  // printing each character of the string

  for(int i = 0; i < fullName.length(); i++) {
   System.out.print(" " +fullName.charAt(i));
  }

  // Comparing two strings

  String str1 = "Danish";
  String str2 = "Danish2";

  // 1. Using compareTo method (Most Preferred)
  // str > str2 then compare function returns +ve value
  // str == str2 then compare function returns 0 value
  // str < str2 then compare function returns -ve value

  if(str1.compareTo(str2) == 0) {
    System.out.println("Both strings are equal");
  } else {
    System.out.print("Both strings are not equal");
  }

  //2. Using == comparison operator (May fail in some cases, not preferred)
  if(str1 == str2) {
    System.out.print("Strings are equal");
  } else {
    System.out.print("Strings are not equal");
  }

  // Creating string object using String class and comparing the strings

  if(new String("Danish") == new String("Danish")) {
    System.out.print("Strings are equal");
  } else {
    System.out.print("Strings are not equal");
  }

  // Substring - extracting a part of a string
  String status = "I am playing with Java";
  String language = status.substring(18, status.length());
  System.out.println(language);

  String name = "mohammadDanish";
  String part1 = name.substring(0, 8);
  System.out.println(part1);
  String part2 = name.substring(8);
  System.out.print(part2);

  // Parsing string into int i.e. Converting a string into integer data type using parseInt

  String str = "456";
  int num = Integer.parseInt(str);
  System.out.print(num);

  // Parsing int into string i.e. Converting an int into String data type using toString

  int nums = 12345;
  String numString = Integer.toString(nums);
  System.out.print(numString);

  // Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

  try(Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter the size of the array = ");
    int size = sc.nextInt();
    String names[] = new String[size];
    for(int i = 0; i < size; i++) {
      System.out.print("Enter name "+i+" = ");
      names[i] = sc.next();
    }
    int totalLength = 0;
    for(int j = 0; j < size; j++) {
      totalLength += names[j].length();
    }
    System.out.print("The total length of all strings is = "+totalLength);
  }

  // Input a string from user, create another string where we will replace the occurence of "e" in the user input with "i"

  try(Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter you hobby buddy = ");
    String hobby = sc.nextLine();
    String result = "";
    for(int i = 0; i < hobby.length(); i++) {
      if(hobby.charAt(i) == 'e') {
        result += 'i';
      } else {
        result += hobby.charAt(i);
      }
    }
    System.out.print(result);
  }

  // take email from user, then create username by deleting the further part from @ in the email and print the username

  try(Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter your E-mail = ");
    String email = sc.next();
    String userName = "";
    for(int i = 0; i < email.length(); i++) {
      if(email.charAt(i) != '@') {
        userName += email.charAt(i);
      } else {
        break;
      }
    }
    System.out.print("Username = "+userName);
  }
  }
 }
