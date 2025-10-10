import java.util.HashSet;
import java.util.Iterator;

// HashSet Implementation and its operations
public class Hashing {
  public static void main(String args[]) {
    // Creating a HashSet
    HashSet<Integer> set = new HashSet<>();

    // Inserting elements in HashSet - TC = O(1)
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(2); // it will not be added again as hash set can store unique values

    // Searching elements in HashSet - TC = O(1)
    if (set.contains(3)) {
      System.out.println("Set contains 3");
    }
    if (!set.contains(7)) {
      System.out.println("Set does not contain 7");
    }

    // Deleting element from HashSet - TC = O(1)
    set.remove(2);
    // verifying that the element is deleted from the set or not
    if (set.contains(2)) {
      System.out.println("Set contains 2");
    } else {
      System.out.println("2 was deleted");
    }

    // Printing the size of HashSet
    System.out.println("Size of HashSet is = " + set.size());

    // Print all elements of HashSet
    System.out.println("Elements of HashSet are = " + set);

    // Iterating on HashSet using iterator
    Iterator it = set.iterator();

    while (it.hasNext()) {
      System.out.println(it.next() + " ");
    }
  }
}