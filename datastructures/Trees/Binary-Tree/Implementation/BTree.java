
import java.util.LinkedList;
import java.util.Queue;

public class BTree {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class BinaryTree {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;
      // if there is no child node node of a node
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode; // returning the the root node
    }
  }

  // Preorder Traversal of Binary Tree - TC = O(n)
  public static void preOrder(Node root) {
    if (root == null) {
      System.out.print(-1 + " ");
      return;
    }
    System.out.print(root.data + " "); // 1. print the root
    preOrder(root.left); // 2. print the left subtree
    preOrder(root.right); // 3. print the right subtree
  }

  // Inorder Traversal of Binary Tree - TC = O(n)
  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left); // 1. print the left subtree
    System.out.print(root.data + " "); // 2. print the root
    inOrder(root.right); // 3. print the right subtree
  }

  // Postorder Traversal of Binary Tree - TC = O(n)
  public static void postOrder(Node root) {
    if (root == null) {
      return;
    }
    postOrder(root.left); // 1. Print the left subtree
    postOrder(root.right); // 2. Print the right subtree
    System.out.print(root.data + " "); // 3. Print the root
  }

  // Level Order Traversal of Binary Tree - TC = O(n)
  public static void levelOrder(Node root) {
    if (root == null) {
      return;
    }
    // Creating Queue to store the nodes of binary tree
    Queue<Node> q = new LinkedList<>();
    q.add(root); 
    q.add(null); // to track next line

    while (!q.isEmpty()) {
      Node currNode = q.remove();
      if (currNode == null) {
        System.out.println(); // next line if front is null
        // after null if the queue is empty then exit from loop otherwise add null from rear
        if (q.isEmpty()) {
          break;
        } else {
          q.add(null);
        }
      } else {
        System.out.print(currNode.data + " "); // if currNode is not null then print its value
        // add the child of currNode if they are not null
        if (currNode.left != null) {
          q.add(currNode.left);
        }
        if (currNode.right != null) {
          q.add(currNode.right);
        }
      }
    }
  }

  public static void main(String args[]) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node rootNode = tree.buildTree(nodes);
    levelOrder(rootNode);
  }

}