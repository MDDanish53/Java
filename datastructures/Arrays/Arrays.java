package datastructures;

import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    // int[] marks = new int[3]; // one way of declaration
    // String subjects[] = new String[3]; // another way of declaration
    // boolean passed[] = {true, false, true};  // another way of declaration
    // marks[0] = 45;
    // marks[1] = 32;
    // marks[2] = 89;
    // subjects[0] = "English";
    // subjects[1] = "Hindi";
    // subjects[2] = "Marathi";
    // System.out.println("Subject | Marks | Passed");
    // for(int i = 0; i < 3; i++) {
    //   System.out.print(subjects[i]+"    ");
    //   System.out.print(marks[i]+"     ");
    //   System.out.println(passed[i]+"    ");
    // }

    // declaring an array of size speicified by the user without intialization and printing its values
      // try(Scanner sc = new Scanner(System.in)) {
      //   System.out.print("Enter the size of the array = ");
      //   int size = sc.nextInt();
      //   int numbers[] = new int[size];
      //   for(int i = 0; i < size; i++) {
      //     System.out.print(numbers[i]+" "); // here if we do not initialize the array with values then 0 will se stored in each index as the type of array is int
      //   }
      // }

  // taking size, values of array from user and printing its elements
  // try(Scanner sc = new Scanner(System.in)) {
  //   System.out.print("Enter size of array = ");
  //   int size = sc.nextInt();
  //   int values[] = new int[size];
  //   // index values input
  //   for(int i = 0; i < size; i++) {
  //     System.out.print("Enter the "+i+" index element = ");
  //     values[i] = sc.nextInt();
  //   }
  //   // printing the index values
  //   for(int i = 0; i < size; i++) {
  //     System.out.println(i+" index element = "+values[i]);
  //   }
  // }

  // taking size, values of an array from user also taking the value to search in the created array
  try(Scanner sc = new Scanner(System.in)) {
    System.out.print("Enter size of array = ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    // taking values of array from user
    for(int i = 0; i < size; i++) {
      System.out.print("Enter "+i+" index value = ");
      numbers[i] = sc.nextInt();
    }
    // taking the value to search in the array
    System.out.print("Enter the value to be searched = ");
    int value = sc.nextInt();

    // searching the value
    for(int i = 0; i < size; i++) {
      if(numbers[i] == value) {
        System.out.print(value+" found at index "+i);
      }
    }
  }
  }
}
