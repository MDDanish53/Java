
import java.util.ArrayList;

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

  // Place tiles of size 1xm in a floor of size nxm
  public static int placeTiles(int n, int m) {
    if (n == m) {
      return 2;
    }
    if(n < m) {
      return 1;
    }
    // vertically
    int vertPlacements = placeTiles(n-m, m);
    // hroizontally
    int horPlacements = placeTiles(n-1, m);
    return vertPlacements + horPlacements;
  }

  // Find the number of ways in which you can invite n people to your party, single or in pairs
  public static int callGuests(int n) {
    if(n <= 1) {
      return 1;
    }
    // single
    int ways1 = callGuests(n-1);
    // pair
    int ways2 = (n-1) * callGuests(n-2);
    return ways1 + ways2;
  }

  // Print all the subsets of a set of first n natural numbers - TC = O(2^n)
  public static void printSubset(ArrayList<Integer> subset) {
    for(int i = 0; i < subset.size(); i++) {
      System.out.print(subset.get(i)+" ");
    }
    System.out.println();
  }
  public static void findSubsets(int n, ArrayList<Integer> subset) {
    if(n == 0) {
      printSubset(subset);
      return;
    }
    // add in subset
    subset.add(n);
    findSubsets(n-1, subset);

    // don't add in subset
    subset.remove(subset.size()-1);
    findSubsets(n-1, subset);
  }
  public static void main(String args[]) {
    int n = 3;
    ArrayList<Integer> subset = new ArrayList<>();
    findSubsets(n, subset);
  }
}