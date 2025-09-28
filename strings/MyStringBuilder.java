package strings;


import java.util.Scanner;


public class MyStringBuilder {
  public static void main(String args[]) {
    StringBuilder name = new StringBuilder("Danish");// Creating string object using StringBuilder class
    System.out.println(name);

    System.out.println(name.charAt(2)); // Printing a particular character of name string
    
    name.setCharAt(0, 'M'); // Changing character of a particular index 
    System.out.println(name); 
    
    name.insert(0, "Mr. "); // Inserting character/characters at a particular index
    System.out.println(name);

    name.insert(7, " is a f"); // Inserting a string
    System.out.println(name);

    name.delete(7, 14); // deleting that inserted string
    System.out.println(name);

    StringBuilder greeting = new StringBuilder("h");
    greeting.append("e"); //appending character/characters at the end of the string builder object
    greeting.append("l");
    greeting.append("l");
    greeting.append("o");
    System.out.println(greeting);
    System.out.println(greeting.length()); // printing the length of stringBuilder object

    // Reversing a string

    StringBuilder mood = new StringBuilder("Casual");
    for(int i = 0; i < mood.length()/2; i++) {
      int front = i;
      int back = mood.length() - 1 - i;

      char frontChar = mood.charAt(front);
      char backChar = mood.charAt(back);

      mood.setCharAt(front, backChar);
      mood.setCharAt(back, frontChar);
    }
    System.out.print(mood);

    // Take an array of Strings as input from the user & find the cumulative (combined) length of all those strings.

    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the length of the array = ");
      int size = sc.nextInt();
      String data[] = new String[size];
      int totalLength = 0;
      for(int i = 0; i < size; i++) {
        System.out.print("Enter value of "+i+" index = ");
        data[i] = sc.next();
        totalLength += data[i].length();
      }
      System.out.print("Total Length = "+totalLength);
    }

    // Input a string from user, create another string where we will replace the occurence of "e" in the user input with "i"

    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter your hobby = ");
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
      System.out.print("Enter your email = ");
      String email = sc.next();
      String userName = "";
      for(int i = 0; i < email.length(); i++) {
        if(email.charAt(i) != '@') {
          userName += email.charAt(i);
        } else {
          break;
        }
      }
      System.out.print(userName);
    }
  }
}
