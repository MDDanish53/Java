package datastructures.Stack.Implementation;
// Implementation 1 - Implementing stack using Linked List
public class StackClass1 {

  static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  static class Stack {
    public static Node head;

    // Checking the Linked List (Stack) is empty or not
    public static boolean isEmpty() {
      return head == null;
    }

    // method to push node at the top of the stack
    public static void push(int data) {
      Node newNode = new Node(data);
      if (isEmpty()) {
        head = newNode;
        return;
      }
      newNode.next = head;
      head = newNode;
    }

    // method to pop node from the top of the stack and returning the deleted node's
    // data
    public static int pop() {
      if (isEmpty()) {
        return -1; // Stack is empty
      }
      int top = head.data;
      head = head.next;
      return top;
    }

    // method to peek the top node of the stack
    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      int top = head.data;
      return top;
    }
  }

  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
    System.out.println(s.peek());
  }
}
