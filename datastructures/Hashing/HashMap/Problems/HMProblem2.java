
import java.util.HashMap;

// Problem 2 - Find Itinerary(path) from Tickets

public class HMProblem2 {

  public static String getStart(HashMap<String, String> tickets) {
    // Creating another HashMap to store tickets HashMap's Key as value and value as
    // key
    HashMap<String, String> revMap = new HashMap<>();

    // Putting tickets map's key as value and value as key in revMap
    for (String key : tickets.keySet()) {
      revMap.put(tickets.get(key), key);
    }

    // Checking if the all keys of tickets are in revMap keys, if the key of tickets
    // is not in revMap then it is the starting point
    for (String key : tickets.keySet()) {
      if (!revMap.containsKey(key)) { // if revMap does not contains that key
        return key; // return start point
      }
    }

    return null;
  }

  public static void main(String args[]) {
    // Original HashMap containing Key(From) and value(to) pairs
    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("Chennai", "Bengaluru");
    tickets.put("Mumbai", "Delhi");
    tickets.put("Goa", "Chennai");
    tickets.put("Delhi", "Goa");

    String start = getStart(tickets); // getting the start point

    // print the start and update it by its value if there is start in tickets as
    // key
    while (tickets.containsKey(start)) {
      System.out.print(start + " -> ");
      start = tickets.get(start); // assign value of start in start
    }
    System.out.print(start); // last start which is not a key in tickets
  }
}
