// Problem 1 - Majority Element : Given an integer array of size n, find all elements that appear more than n/3 times.

import java.util.HashMap;

public class HMProblem1 {

  // Time Complexity = O(n)
  public static void majorityElement(int nums[]) {
    // 1. Create a HashMap
    HashMap<Integer, Integer> map = new HashMap<>();

    // 2. Insert all the keys(numbers) and their frequency(occurences in array) as
    // <key, value> in map
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (map.containsKey(nums[i])) { // if map contains the key
        map.put(nums[i], map.get(nums[i]) + 1); // add the same key with +1 frequency to update its frequency
      } else { // if map does not contains key
        map.put(nums[i], 1); // add the key with frequency 1
      }
    }

    // 3. Check the frequency of each key is greater than n/3 or not
    for (int key : map.keySet()) { // getting all keys array from map
      if (map.get(key) > n / 3) {
        System.out.print(key + " ");
      }
    }
  }

  public static void main(String args[]) {
    int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
    majorityElement(nums);
  }
}
