package datastructures.Queue.Implementation;
// Implementation 2 - Circular Queue using Array
public class Queue2 {

  static class Queue {
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;

    Queue(int size) {
      arr = new int[size];
      this.size = size;
    }

    // Checking the Queue is empty or not
    public static boolean isEmpty() {
      return rear == -1 && front == -1;
    }

    // Checking the Queue is full or not
    public static boolean isFull() {
      return (rear + 1) % size == front;
    }

    // Enqueue - Adding element from rear of the Circular Queue - TC = O(1)
    public static void add(int data) {
      if (isFull()) {
        System.out.println("Queue is Full");
        return;
      }
      // adding first element in the Queue
      if (front == -1) {
        front = 0;
      }
      rear = (rear + 1) % size; // useful if we are last index of array and we want to go to the first index
      arr[rear] = data;
    }

    // Dequeue - removing element from front of the Circular Queue
    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      int result = arr[front]; // getting the front element
      // single element condition (rear = front = 0)
      if (rear == front) {
        rear = front = -1;
      } else {
        front = (front + 1) % size; // useful when we are at last index of Array and we want to go to the first
                                    // index of Array
      }
      return result;
    }

    // Peek - getting the value of the front element of the circular queue
    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return -1;
      }
      return arr[front];
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue(5);
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    System.out.println(q.remove()); // Front = 1 is removed
    q.add(6); // Rear is at the first index and 6 is added at the rear
    System.out.println(q.remove()); // Front = 2 is removed
    q.add(7); // Rear is at the second index and 7 is added at the rear
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}