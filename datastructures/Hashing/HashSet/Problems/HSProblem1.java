
import java.util.HashSet;

// Problem 1 - Perform Union of Two arrays and return the size of Union

public class HSProblem1 {

  // Time Complexity = O(n)
  public static int union(int arr1[], int arr2[]) {
    // 1. Creating a new HashSet
    HashSet<Integer> set = new HashSet<>();

    // 2. Adding elements af arr1 in set
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }

    // 3. Adding elements of arr2 in set
    for (int j = 0; j < arr2.length; j++) {
      set.add(arr2[j]);
    }

    return set.size();
  }

  public static void main(String args[]) {
    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };
    System.out.println(union(arr1, arr2)); // 6
  }
}
