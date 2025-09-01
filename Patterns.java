public class Patterns {
  public static void main(String[] args) {

    // print 4x5 rectangle

    // outer loop
    //for(int i = 1; i <= 4; i++) {
      // inner loop
      //for(int j = 1; j <= 5; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}


    // print 4x5 hollow rectangle

    // outer loop
    //for(int i = 1; i <= 4; i++) {
      // inner loop
      //for(int j = 1; j <= 5; j++) {
        //if(i==1 || j==1 || i==4 || j==5) {
          //System.out.print("*");
        //} else {
          //System.out.print(" ");
        //}
      //}
      //System.out.println();
    //}

    // Print half pyramid
    //for(int i = 1; i <= 4; i++) {
      //for(int j = 1; j <= i; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}

    // Print inverted half pyramid

    //for(int i = 4; i >= 1; i--) {
      //for(int j = 1; j <= i; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}

    //Print inverted half pyramid (rotated by 180 deg)

    // outer loop
    //for(int i = 1; i <= 4; i++) {
      // inner loop -> space print
      //for(int j = 1; j <= 4-i; j++) {
        //System.out.print(" ");
      //}
      //for(int j = 1; j <= i; j++) {
        //System.out.print("*");
      //}
      //System.out.println();
    //}

    // Print half pyramid with numbers

    //for(int i = 1; i <= 5; i++) {
      //for(int j = 1; j <= i; j++) {
        //System.out.print(j);
      //}
      //System.out.println();
    //}

    // Print inverted half pyramid with numbers (one way)
    
    // for(int i = 5; i >= 1; i--) {
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // other way

    // for(int i = 1; i <= 5; i++) {
    //   for(int j = 1; j <= 5-i+1; j++) {
    //     System.out.print(j);
    //   }
    //   System.out.println();
    // }

    // Print Floyd's Triangle
    // int num = 1;
    // for(int i = 1; i <= 5; i++) {
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print(num+" ");
    //     num++;
    //   }
    //   System.out.println(); 
    // }

    // Print 0-1 Triangle

    //for(int i = 1; i <= 5; i++) {
      //for(int j = 1; j <= i; j++) {
        //if((i+j) % 2 == 0) {
         // System.out.print(1+" ");
        //} else {
          //System.out.print(0+" ");
        //}
      //}
      //System.out.println();
    //}

    // Print Butterfly Pattern

    //upper half
    // for(int i = 1; i <= 4; i++) {
    //   //1st Part
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   //spaces
    //   int spaces = 2 * (4 - i);
    //   for(int j = 1; j <= spaces; j++) {
    //     System.out.print(" ");
    //   }
    //   //2nd Part
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }
    
    // // lower half
    // for(int i = 4; i >= 1; i--) {
    //   //1st Part
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   //spaces
    //   int spaces = 2 * (4 - i);
    //   for(int j = 1; j <= spaces; j++) {
    //     System.out.print(" ");
    //   }
    //   //2nd Part
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print("*");
    //   }
    //   System.out.println();
    // }

    // Print Solid Rhombus

    //for(int i = 1; i <= 5; i++) {
      //spaces
      //int spaces = 5 - i;
      //for(int j = 1; j <= spaces; j++) {
        //System.out.print(" ");
      //}
      //for(int j = 1; j <= 5; j++) {
      //System.out.print("*");
      //}
      //System.out.println();
    //} 

    // Print Number Pyramid

    // for(int i = 1; i <= 5; i++) {
    //   int spaces = 5 - i;
    //   for(int j = 1; j <= spaces; j++) {
    //     System.out.print(" ");
    //   }
    //   for(int j = 1; j <= i; j++) {
    //     System.out.print(i+" ");
    //   }
    //   System.out.println();
    // }

    // Print Palindromic Pattern

    //for(int i = 1; i <= 5; i++) {
      //spaces
      //int spaces = 5 - i;
      //for(int j = 1; j <= spaces; j++) {
        //System.out.print(" ");
      //}
      //first half
      //for(int j = i; j >= 1; j--) {
        //System.out.print(j);
      //}
      //second half
      //for(int j = 2; j <= i; j++) {
        //System.out.print(j);
      //}
      //System.out.println();
    //}

    // Diamond Pattern

    // upper half
    for(int i = 1; i <= 4; i++) {
      // spaces
      for(int j = 1; j <= 4-i; j++) {
        System.out.print(" ");
      }
      // left half
      for(int j = 1; j <= 2*i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //lower half
    for(int i = 4; i >= 1; i--) {
      // spaces
      for(int j = 1; j <= 4-i; j++) {
        System.out.print(" ");
      }
      // left half
      for(int j = 1; j <= 2*i-1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
