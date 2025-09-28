package basics;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Functions {

  // Function to print name given by user
  public static void printName(String name) {
    System.out.println("Your name is - "+name);
  }

  // Function to add 2 numbers and return their sum
  public static int calculateSum(int num1, int num2) {
    int sum = num1 + num2;
    return sum;
  }

  // Function to multiply 2 numbers and return their product
  public static int calculateProduct(int num1, int num2) {
    int product = num1 * num2;
    return product;
  }

  // Function to calculate factorial of a number
  public static int calculateFactorial(int num) {
    int factorial = 1;
    if(num < 0) {
      System.out.println("Invalid number");
      return 0;
    }
    for(int i = 1; i <= num; i++) {
      factorial = factorial * i;
    }
    return factorial;
  }

  // Function to print average of 3 numbers 
  public static double calculateAverage(int num1, int num2, int num3) {
   double average = (num1 + num2 + num3) / 3.0;
   return average;
  }

  // Function to print the sum of all odd numbers from 1 to n
  public static int calculateOddSum(int num) {
    int sum = 0;
    for(int i = 1; i <= num; i++) {
      if(i % 2 != 0) {
        sum = sum + i;
      }
    }
    return sum;
  }

  // Function to return the greater number amongst two numbers
  public static void greaterNum(int num1, int num2) {
    if(num1 == num2) {
      System.out.print("Both numbers are equal");
    } else if(num1 > num2) {
      System.out.print(num1+" is greater number");
    } else {
      System.out.print(num2+" is greater number");
    }
  }

  // Function which takes radius and returns the circumference of circle
  public static double calcCircumference(float radius) {
    double circumference = 2 * 3.14 * radius;
    return circumference;
  }

  // Function to identify a person is eligible to cast vote or not
  public static void eligibleToVote(int age) {
    if(age <= 0) {
      System.out.print("! Invalid age");
      return;
    }
    if(age >= 18) {
      System.out.print("Congratulations! you can vote.");
    } else {
      System.out.print("Sorry! you cannot vote");
    }
  }

  // Function to calculate power of a number with respect to another number
  public static double calculatePower(int num, int power) {
   double result = Math.pow(num, power);
   return result;
  }

  // Function to calculate GCD of two numbers 
  public static int calculateGCD(int num1,int num2) {
    List<Integer> num1List = new ArrayList<>();
    List<Integer> num2List = new ArrayList<>();
    List<Integer> commonDivisors = new ArrayList<>();
    // Common Divisor of num1
    for(int i = 1; i <= num1; i++) {
      if(num1 % i == 0) {
        num1List.add(i);
      }
    }
    // Common Divisor of num2
    for(int j = 1; j <= num2; j++) {
      if(num2 % j == 0) {
        num2List.add(j);
      }
    }
    // Common Divisor of num1 and num2
    for(int i = 0; i < num1List.size(); i++) {
        for(int j = 0; j < num2List.size(); j++) {
          if(num1List.get(i).equals(num2List.get(j))) {
            commonDivisors.add(num1List.get(i));
          }
        }
      }

    // Greatest Common Divisor
    int max = commonDivisors.get(0);
      for(int i = 0; i < commonDivisors.size(); i++) {
        if(commonDivisors.get(i) > max) {
          max = commonDivisors.get(i);
        }
      }
      return max;
  }

  // Function to print the Fibonacci Series
  public static void fibonacci(int n) {
    int a = 0;
    int b = 1;
    int next;
    if(n >= 1) System.out.print(a+" ");
    if(n >= 2) System.out.print(b+" ");
    for(int i = 3; i <= n; i++) {
      next = a + b;
      System.out.print(next+" ");
      a = b;
      b = next;
    }
  }

  public static void main(String[] args) {
    try(Scanner sc = new Scanner(System.in)) {
     System.out.print("Enter till how many digits you want to print fibonacci series = ");
     int n = sc.nextInt();
     fibonacci(n);
    }
  }
}
