// Problem 2 - StartsWith Problem
// Create a function boolean startsWith(String prefix) for a trie. Returns true if there is a previously inserted string word that has the prefix prefix, and false otherwise

public class TProblem2 {

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

  // Insert Function
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

  // StartsWith Function
  public static boolean startsWith(String prefix) {
    Node curr = root;
    for (int i = 0; i < prefix.length(); i++) {
      int idx = prefix.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      curr = curr.children[idx];
    }
    return true;
  }

  public static void main(String args[]) {
    String words[] = { "app", "danish", "span", "dan", "application" };
    String prefix = "app";
    for (String word : words) {
      insert(word);
    }
    System.out.println(startsWith(prefix));
  }
}