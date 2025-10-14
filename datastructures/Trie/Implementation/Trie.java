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

    // Time Complexity = O(L) , L = length of word
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a'; // getting index of each letter in word

      // if root's children array does not have a node at the letter index
      if (root.children[idx] == null) {
        root.children[idx] = new Node(); // then add a new node there
      }

      // if loop is at the last letter of word
      if (i == word.length() - 1) {
        root.children[idx].eow = true; // then make its end of word (eow) = true to mark the word as ended
      }

      root = root.children[idx]; // making the current letter after root as root
    }
  }

  // Function to Search a word in Trie
  public static boolean search(String word) {
    for (int i = 0; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a'; // getting index of each letter of word

      // if there is no node at the letter index in children array of root
      if (root.children[idx] == null) {
        return false; // word not found
      }

      // if we are at last letter of word && that letter's node's eow = false in root
      // node children array
      if (i == word.length() - 1 && root.children[idx].eow == false) {
        return false; // word not found
      }

      root = root.children[idx]; // updating root to next letter in the word
    }
    return true;
  }

  public static void main(String args[]) {
    String words[] = { "the", "a", "there", "their", "any" };

    // inserting each word in trie
    for (int i = 0; i < words.length; i++) {
      insert(words[i]);
    }

    if (search("any")) {
      System.out.println("Word Found");
    } else {
      System.out.println("Word Not Found");
    }
  }
}