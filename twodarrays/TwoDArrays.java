package twodarrays;



public class TwoDArrays {
  public static void main(String args[]) {
    // try(Scanner sc = new Scanner(System.in)) {
    //   System.out.println("We are going to create a 2D-Array so - ");
    //   System.out.print("Enter the rows of 2D Array = ");
    //   int rows = sc.nextInt();
    //   System.out.print("Enter the columns of 2D Array = ");
    //   int columns = sc.nextInt();
    //   int numbers[][] = new int[rows][columns];
    //   // Input from user
    //   // Rows
    //   for(int i = 0; i < rows; i++) {
    //     // Columns
    //     for(int j = 0; j < columns; j++) {
    //       System.out.print("Enter the value of "+i+" row and "+j+" column = ");
    //       numbers[i][j] = sc.nextInt();
    //     }
    //   }
    //   System.out.println("Here is your created 2D Array:");
    //   // Output
    //   // Rows
    //   for(int i = 0; i < rows; i++) {
    //     // Columns
    //     for(int j = 0; j < columns; j++) {
    //       System.out.print("| "+numbers[i][j]+" ");
    //     }
    //     System.out.println();
    //   }
    // }


   // Take 2D Array as input from user and find position of an element entered by user in that array and print its indices


  //  try(Scanner sc = new Scanner(System.in)) {
  //   System.out.print("Enter the Rows of 2D Array = ");
  //   int rows = sc.nextInt();
  //   System.out.print("Enter the columns of 2D Array = ");
  //   int columns = sc.nextInt();
  //   int array[][] = new int[rows][columns];
  //   for(int i = 0; i < rows; i++) {
  //     for(int j = 0; j < columns; j++) {
  //       System.out.print("Enter value of "+i+"x"+j+" position = ");
  //       array[i][j] = sc.nextInt();
  //     }
  //   }
  //   System.out.print("Enter the value you want to find from the created array = ");
  //   int find = sc.nextInt();
  //   for(int i = 0; i < rows; i++) {
  //     for(int j = 0; j < columns; j++) {
  //       if(array[i][j] == find) {
  //         System.out.print(find+" value is obtained at position "+i+"x"+j);
  //       }
  //     }
  //   }
  //  } 



  // Print the spiral order matrix as output from a given matrix of numbers


  // try(Scanner sc = new Scanner(System.in)) {
  //   System.out.print("Enter the Rows of 2D Array = ");
  //   int rows = sc.nextInt();
  //   System.out.print("Enter the columns of 2D Array = ");
  //   int cols = sc.nextInt();
  //   int [][] array = new int[rows][cols];
  //   for(int i = 0; i < rows; i++) {
  //     for(int j = 0; j < cols; j++) {
  //       System.out.print("Enter value of (" +i+" , "+j+" ) = ");
  //       array[i][j] = sc.nextInt();
  //     }
  //   }
  //   System.out.print("This is your created 2D Array :");
  //   for(int i = 0; i < rows; i++) {
  //     for(int j = 0; j < cols; j++) {
  //       System.out.print("| "+array[i][j]+" ");
  //     }
  //     System.out.println();
  //   }

  //   System.out.print("Spiral Version of your array :");
  //    int rowStart = 0;
  //    int rowEnd = rows - 1;
  //    int colStart = 0;
  //    int colEnd = cols - 1;
  //    while(rowStart <= rowEnd && colStart <= colEnd) {
  //     // Top
  //     for(int top=colStart; top <= colEnd; top++) {
  //       System.out.print(array[rowStart][top]);
  //     }
  //     rowStart++;
  //     // Right
  //     for(int right = rowStart; right <= rowEnd; right++) {
  //       System.out.print(array[right][colEnd]);
  //     }
  //     colEnd--;
  //     // Bottom
  //     for(int bottom = colEnd; bottom >= colStart; bottom--) {
  //       System.out.print(array[rowEnd][bottom]);
  //     }
  //     rowEnd--;
  //     // Left 
  //     for(int left = rowEnd; left >= rowStart; left--) {
  //       System.out.print(array[left][colStart]);
  //     }
  //     System.out.println();
  //    }
   // }


   // Print the transpose of given matrix


  //  try(Scanner sc = new Scanner(System.in)) {
  //   System.out.print("Enter the rows of 2D Array = ");
  //   int rows = sc.nextInt();
  //   System.out.print("Enter the columns of 2D Array = ");
  //   int cols = sc.nextInt();
  //   int array[][] = new int[rows][cols];
  //   for(int i = 0; i < rows; i++) {
  //     for(int j = 0; j < cols; j++) {
  //       System.out.print("Enter the value of position "+i+" , "+j+" = ");
  //       array[i][j] = sc.nextInt();
  //     }
  //   }
  //   // Printing the transpose
  //   for(int j = 0; j < cols; j++) {
  //     for(int i = 0; i < rows; i++) {
  //       System.out.print("| "+array[i][j]+" ");
  //     }
  //     System.out.println();
  //   }
  //  }
  }
}
