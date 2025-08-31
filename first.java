
class First {
  public static void main(String[] args) {

    //output
    //System.out.print("Learning Java");

    //variables
    //int a = 10;
    //int b = 5;
    //int sum = a + b;
    //System.out.println(sum);
    //int ans = (a + b) / (a - b);
    //System.out.println(ans); 

    //input
    //try (Scanner sc = new Scanner(System.in);) { // input - Mohammad Danish
      //String name = sc.next(); // stores - Mohammad
      //String fullName = sc.nextLine(); // stores - Mohammad Danish
      //System.out.println(name); // Mohammad
      //System.out.println(fullName); // Mohammad Danish
    //} // Scanner auto close

    // take 2 variables 'a' and 'b' and print their sum
    // try(Scanner sc = new Scanner(System.in)) {
    //   int a = sc.nextInt();
    //   int b = sc.nextInt();
    //   int sum = a + b;
    //   System.out.println(sum);
    // }

    // Conditionals
    // take user age as input and print user is adult or not
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter your age = ");
    //   int age = sc.nextInt();
    //   if(age > 18) {
    //     System.out.println("Your are an adult");
    //   } else {
    //     System.out.println("You are not an adult");
    //   }
    // }

    // Check the user entered number is odd or even
  //   try(Scanner sc = new Scanner(System.in)) {
  //     System.out.print("Enter a number = ");
  //     int num = sc.nextInt();
  //     if(num%2 == 0) {
  //       System.out.println("Number is even");
  //     } else {
  //       System.out.println("Number is odd");
  //     }
  //   }

    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter the first number = ");
    //   int first = sc.nextInt();
    //   System.out.print("Enter the second number = ");
    //   int second = sc.nextInt();
    //   if(first == second) {
    //     System.out.println("Both numbers are equal");
    //   } else if(first < second) {
    //     System.out.println("First number is smaller than second number");
    //   } else {
    //     System.out.println("First number is greater than second number");
    //   }
    // }

  //  try(Scanner sc = new Scanner(System.in)) {
  //     System.out.print("Enter the button number = ");
  //     int button = sc.nextInt();
  //     if(button == 1) {
  //       System.out.println("Hello");
  //     } else if(button == 2) {
  //       System.out.println("Namaste");
  //     } else if(button == 3) {
  //       System.out.println("Bonjour");
  //     } else System.out.println("Invalid button");
  //  }

  // Switch Statement
  // try(Scanner sc = new Scanner(System.in)) {
  //   System.out.print("Enter the button number = ");
  //   int button = sc.nextInt();
  //   switch(button) {
  //     case 1: System.out.println("Hello");
  //             break;
  //     case 2: System.out.println("Namaste");
  //             break;
  //     case 3: System.out.println("Bonjour");
  //             break;
  //     default: System.out.println("Invalid button");
  //   }
  // }

  // rule switch (new switch syntax)
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter the button number = ");
    //   int button = sc.nextInt();
    //   switch (button) {
    //     case 1 -> System.out.println("Hello");
    //     case 2 -> System.out.println("Namaste");
    //     case 3 -> System.out.println("Bonjour");
    //     default -> System.out.println("Invalid Button");
    //   }
    // }

    // Multi label rules (provide multiple values in case to check)
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter the number from 1 to 10 = ");
    //   int number = sc.nextInt();
    //   switch(number) {
    //     case 1, 3, 5, 7, 9 -> System.out.println("odd number");
    //     case 2, 4, 6, 8, 10 -> System.out.println("even number");
    //     default -> System.out.println("the number is invalid");
    //   } 
    // }

    // Complex block rules in switch
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.print("Enter a number = ");
    //   int num = sc.nextInt();
    //   String result = switch(num) {
    //     case 1 -> {
    //       System.out.println("One is your number");
    //       System.out.println("Thanks for clicking the button");
    //       yield "One";
    //     }
    //     case 2 -> {
    //       System.out.println("Two is your number");
    //       System.out.println("Thanks for clicking the button");
    //       yield "Two";
    //     }
    //     case 3 -> {
    //       System.out.println("Three is your number");
    //       System.out.println("Thanks for clicking the button");
    //       yield "Three";
    //     }
    //     default -> {
    //       System.out.println("Your number is invalid");
    //       System.out.println("Please select number which are valid");
    //       yield "error";
    //     }
    //   };
    //   System.out.println("Result = " + result);
    // }
   }
}