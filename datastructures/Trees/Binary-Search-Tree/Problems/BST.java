import java.util.ArrayList;

public class BST {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  // Insert a node in BST
  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      root.left = insert(root.left, val);
    } else {
      root.right = insert(root.right, val);
    }
    return root;
  }

  // inorder traversal
  public static void inorder(Node root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  // Problem 1 - Print Nodes in Range
  public static void printInRange(Node root, int X, int Y) {
    if (root == null) {
      return;
    }
    // if root node comes in the range then find its inclusive child too
    if (root.data >= X && root.data <= Y) {
      printInRange(root.left, X, Y);
      System.out.print(root.data + " ");
      printInRange(root.right, X, Y);
    } else if (root.data < X) {
      printInRange(root.right, X, Y);
    } else { // if(root.data > Y)
      printInRange(root.left, X, Y);
    }
  }

  public static void printPath(ArrayList<Integer> path) {
    for (int i = 0; i < path.size(); i++) {
      System.out.print(path.get(i) + "->");
    }
    System.out.println();
  }

  // Problem 2 - Print root to leaf paths
  public static void printRoot2Leaf(Node root, ArrayList<Integer> path) {
    if (root == null) {
      return;
    }
    path.add(root.data);
    // if we are at leaf node
    if (root.left == null && root.right == null) {
      printPath(path);
    } else { // if we are at non-leaf node
      printRoot2Leaf(root.left, path); // find paths in left subtree
      printRoot2Leaf(root.right, path); // find paths in right subtree
    }
    path.remove(path.size() - 1); // remove the last node as we backtrack to find other paths
  }

  public static void main(String args[]) {
    int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
    Node root = null;
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]);
    }
    inorder(root);
    System.out.println();
    printRoot2Leaf(root, new ArrayList<>());
  }
}
