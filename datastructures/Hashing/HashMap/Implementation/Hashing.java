import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// HashMap implementation and its operations
public class Hashing {
  public static void main(String args[]) {
    // Creating HashMap - (Movie, rating) - (String, Integer)
    HashMap<String, Integer> map = new HashMap<>();

    // Inserting key-value pairs in HashMap
    map.put("Interstellar", 8); // (key, value)
    map.put("Meet Joe Black", 9);
    map.put("The Pursuit of Happiness", 8);
    // inserting a new pair with the same key inserted previously will update that key's value
    map.put("Interstellar", 9);

    // Printing the created map
    System.out.println(map);

    // Searching for a pair in the map
    if (map.containsKey("Meet Joe Black")) {
      System.out.println("key is present in the map");
    } else {
      System.out.println("key is not present in the map");
    }

    // Getting the value of a key from the map
    System.out.println(map.get("The Pursuit of Happiness")); // key exist
    System.out.println(map.get("Wizard of OZ")); // Key does not exist so value = null

    // Iterating on the map using for loop

    // 1. Iteration through entrySet()
    // type of e is pair of Key and value, map.entry() = creating a set of map in which all the key-value pairs will be stored
    for (Map.Entry<String, Integer> e : map.entrySet()) { // each pair will be stored in e and its key and value is printed in each iteration
      System.out.println(e.getKey() + " : " + e.getValue());
    }

    // 2. Iteration through keySet()
    Set<String> keys = map.keySet(); // creating set of keys of map
    for (String key : keys) {
      System.out.println(key + " -> " + map.get(key)); // map.get(key) to get the corresponding key value
    }

    // removing a pair from the map
    map.remove("The Pursuit of Happiness"); // pass the key name as the argument
    System.out.println(map);
  }
}
