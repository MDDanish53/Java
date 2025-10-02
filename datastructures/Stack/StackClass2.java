package datastructures.Stack;

import java.util.ArrayList;

// Implementation 2 - Implementing stack using Array List
public class StackClass2 {

  static class Stack {
    static ArrayList<Integer> list = new ArrayList<>();

    // Checking the ArrayList (stack) is empty or not
    public static boolean isEmpty() {
      return list.size() == 0;
    }

    // method to add (push) element at the top of the stack
    public static void push(int data) {
      list.add(data);
    }

    // method to delete (pop) element from the top of the stack and returning the
    // deleted element
    public static int pop() {
      int top = list.get(list.size() - 1);
      list.remove(list.size() - 1);
      return top;
    }

    // method to peek (get) the top element of the stack
    public static int peek() {
      if (isEmpty()) {
        return -1;
      }
      return list.get(list.size() - 1);
    }
  }

  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);

    while (!s.isEmpty()) {
      System.out.println(s.peek());
      s.pop();
    }
    System.out.println(s.peek());
  }
}
