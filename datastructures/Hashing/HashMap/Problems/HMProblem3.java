
import java.util.HashMap;

// Problem 3 - Subarray sum equal to K

public class HMProblem3 {
  public static void main(String args[]) {
    int arr[] = { 10, 2, -2, -20, 10 };
    int k = -10;
    HashMap<Integer, Integer> map = new HashMap<>(); // <Sum, Frequency>

    map.put(0, 1); // empty subarray
    int ans = 0; // number of subarray whose sum is equal to k
    int sum = 0; // sum of array elements

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];

      if (map.containsKey(sum - k)) {
        ans += map.get(sum - k); // adding frequency of sum - k element from map
      }

      if (map.containsKey(sum)) { // if map has the sum as key
        map.put(sum, map.get(sum) + 1); // increase its frequency by 1
      } else {
        map.put(sum, 1); // add new pair with sum and its frequency as 1
      }
    }

    System.out.println(ans); // number of subarray whose sum is equal to k
  }
}
