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
  public static void main(String args[]) {
    int a = 0;
    int b = 1;
    int n = 8;
    System.out.print(a+" "+b+" ");
    printFibo(a, b, n-2);
  }
}