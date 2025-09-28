package bitManipulation;
import java.util.Scanner;

public class Bits {
  public static void main(String args[]) {
    // Get Bit - Get the third bit (pos = 2) of num = 0101
      // Bit Mask : 1 << pos
      // Operation : AND (Bitwise AND)
    int num1 = 5; // 0101
    int pos1 = 2; // 0'1'01
    int bitMask1 = 1 << pos1; // 0100
    if((bitMask1 & num1) == 0) { // 0100 == 0 (false)
      System.out.println("Bit was zero");
    } else {
      System.out.println("Bit was one"); // true
    }

    // Set Bit - Set the 2nd bit (pos = 1) of num = 0101
      // Bit Mask : 1 << pos
      // Operation : OR (Bitwise OR)
    int num2 = 5; // 01'0'1(Binary)
    int pos2 = 1; // 0001(Binary)
    int bitMask2 = 1 << pos2; //0010
    int newNum2 = bitMask2 | num2;
    System.out.print(newNum2); // 7 = (01'1'1)

    // Clear Bit - Clear the 3rd bit (pos = 2) of num = 0101
      // Bit Mask : 1 << pos
      // Operation : !(Bit Mask) & num
      int num3 = 5; //0'1'01 
      int pos3 = 2;
      int bitMask3 = 1 << pos3; // 0100
      int newNum3 = ~(bitMask3) & num3; // !(0100) i.e. 1011 & 0101 = 0'0'01
      System.out.print(newNum3); // 0001 = 1

    // Update Bit - Update the 2nd bit (pos = 1) of num = 0101
    // Update to 1 - SET Bit :
      // Bit Mask : 1 << pos
      // Operation : Bit Mask | num
    // Update to 0 - CLEAR Bit :
      // Bit Mask : 1 << pos
      // Operation : ~(Bit Mask) & num
      try(Scanner sc = new Scanner(System.in)) {
        int num4 = 5;
        int pos4 = 1;
        int bitMask4 = 1 << pos4;
        int notBitMask = ~(bitMask4);
        System.out.print("Enter what you want to set on pos = 1 (0/1) = ");
        int bitToSet = sc.nextInt();
        switch(bitToSet){
           case 0 -> {
            int numToZero = notBitMask & num4; // set 0 on pos = 1
            System.out.print(numToZero);  
          }
          case 1 -> {
            int numToOne = bitMask4 | num4; // set 1 on pos = 1
            System.out.print(numToOne);
          }
          default -> {
            System.out.print("Invalid Input");
          }
        }
      }
  }
}
