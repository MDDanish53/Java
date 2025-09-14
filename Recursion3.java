public class Recursion3 {
  // Print all permutations of a string - TC = O(n!)
  public static void printPerm(String str, String permutation) {
    if(str.length() == 0) {
      System.out.println(permutation);
      return;
    }
    for(int i = 0; i < str.length(); i++) {
      char currChar = str.charAt(i);
      String newStr = str.substring(0, i) + str.substring(i+1);
      printPerm(newStr, permutation+currChar);
    }
  }

  // Count total paths in a maze to move from (0, 0) to (n, m)
  public static int countPaths(int i, int j, int n, int m) {
    if(i == n || j == m) {
      return 0;
    }
    if(i == n-1 && j == m-1) {
      return 1;
    }
    // move down
    int downPaths = countPaths(i+1, j, n, m);
    // move right
    int rightPaths = countPaths(i, j+1, n, m);
    return downPaths + rightPaths;
  }
  public static void main(String args[]) {
    int n = 3, m = 3;
    int totalPaths = countPaths(0, 0, n, m);
    System.out.print(totalPaths);
  }
}