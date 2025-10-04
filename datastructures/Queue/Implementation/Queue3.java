package datastructures.Queue.Implementation;
// Implementation 3 - Implementing Queue using Linked List
public class Queue3 {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      next = null;
    }
  }

  static class Queue {
    static Node head = null; // Front of Queue
    static Node tail = null; // Rear of Queue

    // Checking the Queue is empty or not
    public static boolean isEmpty() {
      return head == null && tail == null;
    }

    // Enqueue - Adding element(Node) from tail(rear) of the Queue(Linked List)- TC = O(1)
    public static void add(int data) {
      Node newNode = new Node(data);
      // if queue is empty
      if (tail == null) {
        head = tail = newNode; // rear & front pointing to the newNode
        return;
      }
      tail.next = newNode; // adding newNode after the tail node
      tail = newNode; // newNode became the new tail
    }

    // Dequeue - removing element(Node) from head(front) of the Queue(Linked List) - TC = O(1)
    public static int remove() {
      if (isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      int front = head.data; // getting the front value
      // if there is single element(node) in the queue(Linked List)
      if (head == tail) {
        tail = null; // as we are removing the single available element
      }
      head = head.next;
      return front;
    }

    // Peek - getting the value of the front(head) element of the Queue(Linked List) - TC = O(1)
    public static int peek() {
      if (isEmpty()) {
        System.out.println("Queue is Empty");
        return -1;
      }
      return head.data;
    }
  }

  public static void main(String args[]) {
    Queue q = new Queue();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    while (!q.isEmpty()) {
      System.out.println(q.peek());
      q.remove();
    }
  }
}
