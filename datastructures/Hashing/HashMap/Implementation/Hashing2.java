
import java.util.ArrayList;
import java.util.LinkedList;

// Implementing HashMap using Array of Linked List
public class Hashing2 {

  // <K, V> specify the type of Key and value of Linked list Node - through <K, V>
  // we can specify the types while object creation
  static class HashMap<K, V> {
    // Node structure of Linked List
    private class Node {
      K key;
      V value;

      public Node(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int n; // n = number of nodes
    private int N; // N = number of buckets(size of array)
    private LinkedList<Node> buckets[]; // array of type LinkedList(in which we store Nodes) of type Node i.e. HashMap

    @SuppressWarnings("unchecked") // to avoid warnings

    public HashMap() {
      this.N = 4; // Number of buckets = 4
      this.buckets = new LinkedList[4]; // initialization of array of size = 4
      for (int i = 0; i < 4; i++) {
        this.buckets[i] = new LinkedList<>(); // creating linked list at each index of the array
      }
    }

    private int hashFunction(K key) {
      int bi = key.hashCode(); // converting key into a random (-ve or +ve) value
      return Math.abs(bi) % N; // removing -ve sign (if exists) and assuring the bi lies between 0 to N-1
    }

    private int searchInLL(K key, int bi) {
      LinkedList<Node> ll = buckets[bi]; // getting the linked list to search for key

      for (int i = 0; i < ll.size(); i++) {
        if (ll.get(i).key == key) { // if we found the key in the LL
          return i; // di = index of Node(Key, value)
        }
      }
      return -1; // if the key is not found
    }

    @SuppressWarnings("unchecked") // to avoid warnings

    public void rehash() {
      LinkedList<Node> oldBucket[] = buckets; // creating new LL and storing current LL
      buckets = new LinkedList[N * 2]; // reassigning new LL with twice buckets int current LL

      // creating LL at each index of buckets
      for (int i = 0; i < N * 2; i++) {
        buckets[i] = new LinkedList<>();
      }

      // adding oldBuckets LL's nodes in buckets
      for (int i = 0; i < oldBucket.length; i++) {
        LinkedList<Node> ll = oldBucket[i]; // getting each idx's LL
        // iterating on that LL
        for (int j = 0; j < ll.size(); j++) {
          Node node = ll.get(j); // getting node of LL
          put(node.key, node.value); // inserting node in buckets array
        }
      }
    }

    // Function to put(insert) Node in HashMap(Array of LL) - Avg case TC =
    // O(lambda), WC TC = O(n)
    public void put(K key, V value) {
      int bi = hashFunction(key); // getting the bucket index to insert the new Node (Array Index)
      int di = searchInLL(key, bi); // searching the key exists in the LL of bi or not

      if (di == -1) { // key,value node does not exist in the LL
        buckets[bi].add(new Node(key, value)); // inserting a new Node in the bi LL
        n++; // adding the count of the new node
      } else { // key, value node exist in the LL
        Node node = buckets[bi].get(di); // getting the existing Node from the LL at the bi
        node.value = value; // updating the value of the node
      }

      double lambda = (double) n / N; // getting the threshold value to optimize put method
      if (lambda > 2.0) { // if threshold exceeds the K(Constant) then perform rehashing
        rehash();
      }
    }

    // Function to get the value of key
    public V get(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) { // if key does not exist
        return null;
      } else { // key exists
        Node node = buckets[bi].get(di); // getting the wanted node
        return node.value;
      }
    }

    // Function to remove a Node<Key, Value> from HashMap
    public V remove(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);

      if (di == -1) {
        System.out.println("Node Does not Exist");
        return null;
      } else {
        Node node = buckets[bi].remove(di); // removing the node from LL
        n--; // decrease number of nodes by 1
        return node.value;
      }
    }

    // Function to check hashMap contains a key or not
    public boolean containsKey(K key) {
      int bi = hashFunction(key);
      int di = searchInLL(key, bi);
      return di != -1;
    }

    // Function to get all the Keys of HashMap
    public ArrayList<K> getKeySet() {
      ArrayList<K> keys = new ArrayList<>();

      for (int bi = 0; bi < buckets.length; bi++) { // iterating on each index of buckets(HashMap)
        LinkedList<Node> ll = buckets[bi]; // getting the LL on each index
        // iterating on the LL
        for (int di = 0; di < ll.size(); di++) {
          Node node = ll.get(di); // getting each node of LL
          keys.add(node.key); // adding the key of node in Keys array
        }
      }

      return keys;
    }

    // Function to check HashMap is empty or not
    public boolean isEmpty() {
      return n == 0; // if number of nodes is 0 then the HashMap is empty
    }
  }

  public static void main(String args[]) {
    HashMap<String, Integer> map = new HashMap<>(); // Our created HashMap

    // Inserting Nodes
    map.put("Tiger", 45);
    map.put("Bear", 20);
    map.put("Panda", 10);

    // Getting all the added keys
    ArrayList<String> keys = map.getKeySet();

    // Getting all the <Key, Value> Pairs
    for (int i = 0; i < keys.size(); i++) {
      System.out.println(keys.get(i) + " : " + map.get(keys.get(i)));
    }

    // Removing a Node
    map.remove("Bear");

    // Accessing a deleted Node
    System.out.println(map.get("Bear")); // null

    // Checking if HashMap contains a key or not
    System.out.println(map.containsKey("Bear")); // false
    System.out.println(map.containsKey("Tiger")); // true

    // Checking the HashMap is Empty or not
    if (map.isEmpty()) {
      System.out.println("HashMap is Empty");
    } else {
      System.out.println("HashMap is not Empty");
    }
  }
}