public class BST {

  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
    }
  }

  // Insert a node in BST - TC = O(H), H = Height of BST
  public static Node insert(Node root, int val) {
    if (root == null) {
      root = new Node(val);
      return root;
    }
    if (root.data > val) {
      // left-subtree
      root.left = insert(root.left, val);
    } else {
      // right-subtree
      root.right = insert(root.right, val);
    }
    return root;
  }

  // inorder traversal to verify the BST is correctly formed or not
  public static void inOrder(Node root) {
    if (root == null) {
      return;
    }
    inOrder(root.left);
    System.out.print(root.data + " ");
    inOrder(root.right);
  }

  // search a key in BST - TC = O(H)
  public static boolean search(Node root, int key) {
    // if we reach the leaf node and still not obtained the key node
    if (root == null) {
      return false;
    }
    // if the key is smaller than root then search for it in the left subtree of
    // root
    if (root.data > key) {
      return search(root.left, key);
    } else
    // if the key is equal to root then the key is found
    if (root.data == key) {
      return true;
    } else
    // if the key is greater than root then search for it in the right subtree of
    // root
    if (root.data < key) {
      return search(root.right, key);
    }
    return false;
  }

  // Delete a node in BST
  public static Node delete(Node root, int val) {
    if (root.data > val) {
      root.left = delete(root.left, val);
    } else if (root.data < val) {
      root.right = delete(root.right, val);
    } else { // root.data == val
      // case 1 - If the node to be deleted is a leaf node
      if (root.left == null && root.right == null) {
        return null;
      }

      // case 2 - If the node to be deleted has only one child
      if (root.left == null) {
        return root.right;
      } else if (root.right == null) {
        return root.left;
      }

      // case 3 - If the node to be deleted has 2 child
      Node IS = inorderSuccessor(root.right); // finding the leftmost node from the right subtree of the node to be
                                              // deleted
      root.data = IS.data; // assigning value of the inorderSuccessor in the node to be deleted
      root.right = delete(root.right, IS.data); // deleting the inorderSuccessor as we have assigned its value in the
                                                // node to be deleted
    }
    return root;
  }

  // finding the leftmost node of the right subtree of node to be deleted
  public static Node inorderSuccessor(Node root) {
    if (root.left != null) {
      root = root.left;
    }
    return root;
  }

  public static void main(String args[]) {
    int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
    Node root = null;
    // Inserting each value in BST
    for (int i = 0; i < values.length; i++) {
      root = insert(root, values[i]); // we get the root of final BST
    }
    inOrder(root);
    System.out.println();
    delete(root, 6);
    inOrder(root);
  }
}
