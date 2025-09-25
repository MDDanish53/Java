public class Linkedlist {

  class Node {
    String data;
    Node next;

    Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  Node head;

  // adding node at first position
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // adding node at last position
  public void addLast(String data) {
    Node newNode = new Node(data);
    if(head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while(currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // Printing the linked list
  public void printList() {
    if(head == null) {
      System.out.println("List is empty");
    }
    Node currNode = head;
    while(currNode != null) {
      System.out.print(currNode.data+" -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  public static void main(String args[]) {
    Linkedlist list = new Linkedlist();
    list.addFirst("Mohammad");
    list.printList();
    list.addLast("Danish");
    list.printList();
    list.addLast("Imtiyaz");
    list.printList();
    list.addFirst("Mr.");
    list.printList();
    list.addLast("Siddique");
    list.printList();
  }
}
