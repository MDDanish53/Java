package Recursion;
public class Recursion1 {
  // Print numbers from 5 to 1
  public static void printNumRev(int n) {
    if(n == 0) { // Base Case
      return;
    }
    System.out.println(n); // print
    printNumRev(n-1); // recursion
  }

  // Print numbers from 1 to 5
  public static void printNum(int n) {
    if(n == 6) {
      return;
    }
    System.out.println(n);
    printNum(n+1);
  }

  // Print sum of n natural numbers
  public static void printSum(int i, int n, int sum) {
    if(i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    printSum(i+1, n, sum);
    System.out.println(i);
  }

  // Print Factorial of a number n
  public static int calcFactorial(int n) {
    if(n == 1 || n == 0) {
      return 1;
    }
    int fact_nm1 = calcFactorial(n-1);
    int fact_n = n * fact_nm1;
    return fact_n;
  }

  // Print Fibonacci Series till n
  public static void printFibo(int a, int b, int n) {
    if(n == 0) {
      return;
    }
    int c = a + b;
    System.out.print(c+" ");
    printFibo(b, c, n-1);
  }

  // Calculate x^n (stack height = n)
  public static int calcPower(int x, int n) {
    if(n == 0) { // base case 1
      return 1;
    }
    if(x == 0) { // base case 2
      return 0;
    }
    int xPownm1 = calcPower(x, n-1);
    int xPown = x * xPownm1;
    return xPown;
  }

  // Calculate x^n (stack height = logn)
  public static int calcPow(int x, int n) {
    if(n == 0) {
      return 1;
    }
    if(x == 0) {
      return 0;
    }
    // if n is even
    if(n%2 == 0) {
      return calcPow(x, n/2) * calcPow(x, n/2);
    } else { // if n is odd
      return calcPow(x, n/2) * calcPow(x, n/2) * x;
    }
  }
  public static void main(String args[]) {
    int x = 2, n = 4;
    int ans = calcPow(x, n);
    System.out.print(ans);
  }
}