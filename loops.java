import java.util.Scanner;

class loops {
  public static void main(String[] args) {
    // for(int i = 0; i < 100; i++) {
    //   System.out.println("Hello brother");
    // }

    // print numbers from 0 to 10 using loop
    // for(int i = 0; i <= 10; i++) {
    //   System.out.print(i+" ");
    // }

    // while loop
    // int i = 0;
    // while(i <= 10) {
    //   System.out.print(i + " ");
    //   i++;
    // }

    // do-while loop
    // int i = 0;
    // do {
    //   System.out.print(i + " ");
    //   i++;
    // } while(i <= 10);

    // int i = 11;
    // while(i <= 10) {
    //   System.out.println(i);
    // }

    // do { 
    //     System.out.print(i);
    // } while (i <= 10);

    // Print the sum of First n natural numbers 
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter the number = ");
    //   int num = sc.nextInt();
    //   int sum = 0;
    //   for(int i = 0; i <= num; i++) {
    //     sum = sum + i;
    //   }
    //   System.out.println("The sum is = " + sum);
    // }

    // Print the table of a number input by user
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter the number whose table you want = ");
    //   int num = sc.nextInt();
    //   int multiplier = 0;
    //   for(int i = num; i <= num*10; i = i + num) {
    //     multiplier++;
    //     System.out.println(num + " x " + multiplier + " = " + i);
    //   }
    // }

    // Print the table of a number input by user (easy version)
    try(Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the number whose table you want = ");
      int num = sc.nextInt();
      for(int i = 1; i <= 10; i++) {
        System.out.println(i*num);
      }
    }
  }
}