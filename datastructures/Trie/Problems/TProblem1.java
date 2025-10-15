// Problem 1 - Word Break Problem
// Given an input string and a dictionary of words, find out if the input string can be broken into a space-separated sequence of dictionary words

public class TProblem1 {

  static class Node {
    Node children[];
    boolean eow;

    public Node() {
      children = new Node[26];
      for (int i = 0; i < 26; i++) {
        children[i] = null;
      }
      eow = false;
    }
  }

  static Node root = new Node();

  // Insert function
  public static void insert(String word) {
    Node curr = root;
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';

      if (curr.children[idx] == null) {
        curr.children[idx] = new Node();
      }

      if (i == word.length() - 1) {
        curr.children[idx].eow = true;
      }

      curr = curr.children[idx];
    }
  }

  // Search Function
  public static boolean search(String key) {
    Node curr = root;
    for (int i = 0; i < key.length(); i++) {
      int idx = key.charAt(i) - 'a';
      Node node = curr.children[idx];

      if (node == null) {
        return false;
      }

      if (i == key.length() - 1 && node.eow == false) {
        return false;
      }

      curr = node;
    }
    return true;
  }

  // WordBreak Function
  public static boolean wordBreak(String key) {
    // as the root node is empty and it is in the trie
    if (key.length() == 0) {
      return true;
    }

    // dividing the key into parts
    for (int i = 1; i <= key.length(); i++) {
      String firstPart = key.substring(0, i); // first part upto i-1
      String secondPart = key.substring(i); // second part from i to length
      if (search(firstPart) && wordBreak(secondPart)) {
        return true;
      }
    }
    return false;
  }

  public static void main(String args[]) {
    String words[] = { "mohammad", "danish", "imtiyaz", "siddique" }; // Dictionary of words
    String key = "mohammaddanish"; // input string
    for (String word : words) {
      insert(word);
    }
    System.out.println(wordBreak(key));
  }
}