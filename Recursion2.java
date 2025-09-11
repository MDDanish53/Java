public class Recursion2 {
  // Tower of Hanoi Problem
  public static void towerOfHanoi(int n, String src, String helper, String dest) {
    if(n == 1) {
      System.out.println("transfer disk "+n+" from "+src+" to "+dest);
      return;
    }
    towerOfHanoi(n-1, src, dest, helper);
    System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    towerOfHanoi(n-1, helper, src, dest);
  }

  // Print String in reverse - TC = O(n), n = str.length()
  public static void prtStrRev(String str, int idx) {
    if(idx == 0) {
      System.out.print(str.charAt(idx));
      return;
    }
    System.out.print(str.charAt(idx));
    prtStrRev(str, idx-1);
  }

  // Find first and last occurance of a character in a string - TC = O(n), where n = str.length()
  public static int first = -1;
  public static int last = -1;
  public static void findOccurance(String str, int idx, char element) {
    if(idx == str.length()) {
      System.out.println(first);
      System.out.println(last);
      return;
    }
    char currChar = str.charAt(idx);
    if(currChar == element) {
      if(first == -1) {
        first = idx;
      } else {
        last = idx;
      }
    }
    findOccurance(str, idx+1, element);
  }

  public static void main(String args[]) {
    String name = "Mohammad";
    findOccurance(name, 0, 'a');
  }
}
