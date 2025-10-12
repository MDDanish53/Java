
import java.util.HashSet;

// Problem 2 - Perform Intersection of Two arrays and return the size of Intersection

public class HSProblem2 {

  public static int intersection(int arr1[], int arr2[]) {
    // 1. Create a HashSet
    HashSet<Integer> set = new HashSet<>();

    // 2. Count to count number of intersection values
    int count = 0;

    // 2. Store all the unique values of arr1 in HashSet
    for (int i = 0; i < arr1.length; i++) {
      set.add(arr1[i]);
    }

    // 3. Compare the values of arr2 with set of arr1 values to get the
    // intersection(common values)
    for (int j = 0; j < arr2.length; j++) {
      // if set has the arr2[j] value
      if (set.contains(arr2[j])) {
        count++;
        set.remove(arr2[j]); // to prevent further matching (as we need count of intersection only of unique
                             // elements)
      }
    }

    // 4. return the count
    return count;
  }

  public static void main(String args[]) {
    int arr1[] = { 7, 3, 9 };
    int arr2[] = { 6, 3, 9, 2, 9, 4 };
    System.out.println(intersection(arr1, arr2)); // 2
  }
}
