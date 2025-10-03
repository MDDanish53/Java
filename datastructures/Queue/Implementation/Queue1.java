// Implementing Queue using Array
package datastructures.Queue.Implementation;

public class Queue1 {

  static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;

    Queue(int size) {
      arr = new int[size];
      this.size = size;
    }

    public static boolean isEmpty() {
      return rear == -1;
    }

    // Enqueue - add element from rear of Queue - TC = O(1)
    public static void add(int data) {
      if (rear == size - 1) {
        System.out.println("Queue is Full");
        return;
      }
      rear++;
      arr[rear] = data;
    }

    // dequeue - remove an element from front of Queue - TC = O(n)
    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      int front = arr[0];
      // Shifting all elements at left by 1 position
      for (int i = 0; i < rear; i++) {
        arr[i] = arr[i + 1];
      }
      rear--; // shifting rear at left by 1 position
      return front;
    }

    // Peek - Getting the front element's value from the Queue
    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[0]; // Front element's value
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
