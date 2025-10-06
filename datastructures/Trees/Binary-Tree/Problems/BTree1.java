public class BTree1 {

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
      if (nodes[idx] == -1) {
        return null;
      }
      Node newNode = new Node(nodes[idx]);
      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }
  }

  // Count number of nodes in binary tree - TC = O(n)
  public static int countOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftNodes = countOfNodes(root.left);
    int rightNodes = countOfNodes(root.right);
    return leftNodes + rightNodes + 1;
  }

  // Calculate the sum of all nodes data of binary tree - TC = O(n)
  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int leftSum = sumOfNodes(root.left);
    int rightSum = sumOfNodes(root.right);
    return leftSum + rightSum + root.data;
  }

  // Find the Height of binary tree - TC = O(n)
  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int leftHeight = height(root.left);
    int rightHeight = height(root.right);
    int myHeight = Math.max(leftHeight, rightHeight) + 1;
    return myHeight;
  }

  // Approach 1 - Calculate the diameter of binary tree - TC = O(n^2)
  public static int diameter(Node root) {
    if (root == null) {
      return 0;
    }
    int diam1 = diameter(root.left); // left Node diameter
    int diam2 = diameter(root.right); // right Node diameter
    int diam3 = height(root.left) + height(root.right) + 1; // diameter passing through root node
    return Math.max(diam3, Math.max(diam1, diam2));
  }

  // Approach 2 - Calculate the diameter of binary tree - TC = O(n)
  static class TreeInfo {
    int ht;
    int diam;

    TreeInfo(int ht, int diam) {
      this.ht = ht;
      this.diam = diam;
    }
  }

  public static TreeInfo diameter2(Node root) {
    if (root == null) {
      return new TreeInfo(0, 0);
    }

    TreeInfo left = diameter2(root.left);
    TreeInfo right = diameter2(root.right);

    int myHeight = Math.max(left.ht, right.ht) + 1;

    int diam1 = left.diam;
    int diam2 = right.diam;
    int diam3 = left.ht + right.ht + 1;

    int myDiam = Math.max(Math.max(diam1, diam2), diam3);

    TreeInfo myInfo = new TreeInfo(myHeight, myDiam);
    return myInfo;
  }

  public static void main(String args[]) {
    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    BinaryTree tree = new BinaryTree();
    Node rootNode = tree.buildTree(nodes);
    System.out.println(diameter2(rootNode).diam);
  }
}
