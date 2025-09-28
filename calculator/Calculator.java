package calculator;

import java.util.Scanner;

class Calculator {
  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the first number = ");
      int num1 = sc.nextInt();
      System.out.print("Enter the second number = ");
      int num2 = sc.nextInt();
      System.out.print("Enter operation ( +, -, *, / , % ) = ");
      String operator = sc.next();
      switch(operator) {
        case "+" -> System.out.println(num1+num2);
        case "-" -> System.out.println(num1-num2);
        case "*" -> System.out.println(num1*num2);
        case "/" -> System.out.println(num1/num2);
        case "%" -> System.out.println(num1%num2);
        default -> System.out.println("Invalid operation");
      }
  }
  }
  
}