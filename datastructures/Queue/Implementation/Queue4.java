package datastructures.Queue.Implementation;
// Implementation 4 - Implementing Queue through Java Collection Framework

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue4 {
  public static void main(String args[]) {
    // Using Queue interface through LinkedList class
    // Queue<Integer> q = new LinkedList<>();
    // Using Queue interface through ArrayDeque(Double Ended Queue) class
    Queue<Integer> q = new ArrayDeque<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(7);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
