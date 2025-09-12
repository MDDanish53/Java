
import java.util.HashSet;

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

  // Check if an array is sorted (Strictly Increasing) TC - O(n), n = arr.length
  public static boolean checkSorted(int arr[], int idx) {
    if(idx == arr.length-1) {
      return true;
    }
    if(arr[idx] < arr[idx+1]) {
      // array is sorted till now
      return checkSorted(arr, idx+1);
    } else {
      return false;
    }
  }

  // Check if an array is sorted (Strictly increasing) - Reversing the condition but acquiring the same output as above function
  public static boolean isSorted(int arr[], int idx) {
    if(idx == arr.length-1) {
      return true;
    }
    if(arr[idx] >= arr[idx+1]) {
      // array is unsorted
      return false;
    } else {
      return isSorted(arr, idx+1);
    }
  }

  // Move all 'x' to the end of the string - TC = O(n + count) = O(n + n) = O(2n) = O(n), n = str.length()
  public static void moveAllX(String str, int idx, int count, String newString) {
    if(idx == str.length()) {
      for(int i = 0; i < count; i++) {
        newString += 'x';
      }
      System.out.print(newString);
      return;
    }
    char currChar = str.charAt(idx);
    if(currChar == 'x') {
      count++;
      moveAllX(str, idx+1, count, newString);
    } else {
      newString += currChar;
      moveAllX(str, idx+1, count, newString);
    }
  }

  // Remove Duplicates in a string - TC = O(n)
  public static boolean map[] = new boolean[26];
  public static void removeDuplicates(String str, int idx, String newString) {
    if(idx == str.length()) {
      System.out.print(newString);
      return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a']) {
        removeDuplicates(str, idx+1, newString);
    } else {
      newString += currChar;
      map[currChar - 'a'] = true;
      removeDuplicates(str, idx+1, newString);
    }
  }

  // Print all the subsequences of a string - TC = O(2^n), 2 = number of choices, n = str.length()
  public static void subsequences(String str, int idx, String newString) {
    if(idx == str.length()) {
      System.out.println(newString);
      return;
    }
    char currChar = str.charAt(idx);
    // to be in newString
    subsequences(str, idx+1, newString+currChar);
    // not to be in newString
    subsequences(str, idx+1, newString);
  }

  // Print all the unique subsequences of a string
  public static void uniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
    if(idx == str.length()) {
      if(set.contains(newString)) {
        return;
      } else {
        System.out.println(newString);
        set.add(newString);
        return;
      }
    }
    char currChar = str.charAt(idx);
    uniqueSubsequences(str, idx+1, newString+currChar, set);
    uniqueSubsequences(str, idx+1, newString, set);
  }

  // Print keypad combination - TC = O(4^n), 4 = maximum number of choices, n = str.length()
  public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
  public static void printComb(String str, int idx, String combination) {
    if(idx == str.length()) {
      System.out.println(combination);
      return;
    }
    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];
    for(int i = 0; i < mapping.length(); i++) {
      printComb(str, idx+1, combination+mapping.charAt(i));
    }
  }

  public static void main(String args[]) {
   String str = "01";
   printComb(str, 0, "");
  }
}
