package datastructures.Queue.Problems;

import java.util.Stack;

// Problem 1 - Implementing Queue(FIFO) using 2 Stacks(LIFO)
public class QProblem1 {
  static class Queue {
    static Stack<Integer> s1 = new Stack<>(); // main Stack
    static Stack<Integer> s2 = new Stack<>(); // helper Stack

    // checking if our stack s1(main stack) is empty or not
    public static boolean isEmpty() {
      return s1.isEmpty();
    }

    // Enqueue - Adding element in stack s1 with the help of stack s2 to implement
    // Queue simulation in stack
    public static void add(int data) {
      // shifting elements from s1 to s2 to push new element in s1
      while (!s1.isEmpty()) {
        s2.push(s1.pop());
      }
      // now, adding the new element in the s1 stack as it is now empty
      s1.push(data);

      // pushing elements of s2 stack back in s1 as we have added new element in s1
      // stack
      while (!s2.isEmpty()) {
        s1.push(s2.pop());
      }
    }

    // Dequeue - Removing element from top of the s1 stack
    public static int remove() {
      if (s1.isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      return s1.pop();
    }

    // Peek - Getting the top element of s1 stack which is Front element of Queue
    public static int peek() {
      if (s1.isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      return s1.peek();
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue();
    q.add(53);
    q.add(22);
    q.add(13);
    q.add(89);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
