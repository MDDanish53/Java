public class Trie {

  // Node of Trie
  static class Node {
    Node[] children; // to store next letter of word(a - z)
    boolean eow; // to mark end of word

    public Node() {
      children = new Node[26]; // defining size = 26
      for (int i = 0; i < 26; i++) {
        children[i] = null; // initializing children array with null values
      }
      eow = false;
    }
  }

  static Node root = new Node(); // root node

  // Function to insert a word in trie
  public static void insert(String word) {

    Node curr = root; // storing root in a variable as we dont want to change the actual root

    // Time Complexity = O(L) , L = length of word
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a'; // getting index of each letter in word

      // if root's children array does not have a node at the letter index
      if (curr.children[idx] == null) {
        curr.children[idx] = new Node(); // then add a new node there
      }

      // if loop is at the last letter of word
      if (i == word.length() - 1) {
        curr.children[idx].eow = true; // then make its end of word (eow) = true to mark the word as ended
      }

      curr = curr.children[idx]; // making the current letter after root as root
    }
  }

  // Function to Search a word in Trie
  public static boolean search(String word) {

    Node curr = root; // storing root in a variable as we dont want to change the actual root

    // Time Complexity = O(L) , L = length of word
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a'; // getting index of each letter of word
      Node node = curr.children[idx]; // getting the next letter node of curr(root) node

      // if there is no node at the letter index in children array of root
      if (node == null) {
        return false; // word not found
      }

      // if we are at last letter of word && that letter's node's eow = false in root
      // node children array
      if (i == word.length() - 1 && node.eow == false) {
        return false; // word not found
      }

      curr = node; // updating root to next letter in the word
    }
    return true;
  }

  public static void main(String args[]) {
    String words[] = { "the", "a", "there", "their", "any" };

    // inserting each word in trie
    for (String word : words) {
      insert(word);
    }

    if (search("their")) {
      System.out.println("Word Found");
    } else {
      System.out.println("Word Not Found");
    }
  }
}