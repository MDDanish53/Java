// Problem 4 - Longest Word with all Prefixes

public class TProblem4 {

  public static class Node {
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

  public static boolean search(String key) {
    Node curr = root;
    for (int i = 0; i < 26; i++) {
      int idx = key.charAt(i) - 'a';
      if (curr.children[idx] == null) {
        return false;
      }
      if (i == key.length() - 1 && curr.children[idx].eow == false) {
        return false;
      }
    }
    return true;
  }

  public static String ans = ""; // to store longest word with all prefixes

  // Function to find longest word with all prefixes
  public static void longestWord(Node root, StringBuilder temp) {
    if (root == null) {
      return;
    }
    // checking for all possible character combinations
    for (int i = 0; i < 26; i++) {
      // if root's child node exists with eow = true
      if (root.children[i] != null && root.children[i].eow == true) {
        temp.append((char) (i + 'a')); // add that charater in temp
        if (temp.length() > ans.length()) { // if temp length is greater thann ans
          ans = temp.toString(); // assign temp to answer
        }
        longestWord(root.children[i], temp); // check for current root's child
        temp.deleteCharAt(temp.length() - 1); // remove the character while backtracking from its node
      }
    }
  }

  public static void main(String args[]) {
    String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
    for (String word : words) {
      insert(word);
    }
    longestWord(root, new StringBuilder(""));
    System.out.println(ans);
  }
}
