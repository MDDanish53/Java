package datastructures;
import java.util.*;

public class Linkedlist {
  // manually creating linked list
  private int size;

  Linkedlist() {
    this.size = 0;
  }

  class Node {
    String data;
    Node next;
    
    Node(String data) {
      this.data = data;
      this.next = null;
      size += 1;
    }
  }

  Node head;

  // adding node at first position
  public void addFirst(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;
  }

  // adding node at last position
  public void addLast(String data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = newNode;
      return;
    }
    Node currNode = head;
    while (currNode.next != null) {
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  // deleting the head(first) node of linked list
  public void deleteFirst() {
    if (head == null) {
      System.out.println("The list is empty");
    }
    head = head.next;
    size -= 1;
  }

  // delete the last node of linked list
  public void deleteLast() {
    if (head == null) {
      System.out.println("The list is empty");
      return;
    }
    size -= 1;
    if (head.next == null) {
      head = null;
      return;
    }
    Node secondLast = head;
    Node lastNode = head.next;
    while (lastNode.next != null) {
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }
    secondLast.next = null;
  }

  // Printing the linked list
  public void printList() {
    if (head == null) {
      System.out.println("List is empty");
    }
    Node currNode = head;
    while (currNode != null) {
      System.out.print(currNode.data + " -> ");
      currNode = currNode.next;
    }
    System.out.println("NULL");
  }

  // Print size of linked list
  public int printSize() {
    return size;
  }

  public static void main(String args[]) {

    // manually creating linked list

    // Linkedlist list = new Linkedlist();
    // list.addFirst("Mohammad");
    // list.printList();
    // System.out.println(list.printSize());
    // list.addLast("Danish");
    // list.printList();
    // System.out.println(list.printSize());
    // list.addLast("Imtiyaz");
    // list.printList();
    // System.out.println(list.printSize());
    // list.addFirst("Mr.");
    // list.printList();
    // System.out.println(list.printSize());
    // list.addLast("Siddique");
    // list.printList();
    // System.out.println(list.printSize());
    // list.deleteFirst();
    // list.printList();
    // System.out.println(list.printSize());
    // list.deleteLast();
    // list.printList();
    // System.out.println(list.printSize());

    // Creating linked list using Collections Framework

    LinkedList<String> list = new LinkedList<>();
    // adding nodes at start
    list.addFirst("Danish");
    list.addFirst("Mohammad");
    // adding nodes at last
    list.addLast("Imtiyaz");
    list.add("Siddique");
    // printing the linked list
    System.out.println(list);
    // printing the size of linked list
    System.out.println("Size of Linked List is = "+list.size());
    // printing nodes of linked list
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+" -> ");
    }
    System.out.println("null");
    // removing the first node of linked list
    list.removeFirst();
    System.out.println(list);
    // removing the last node of linked list 
    list.removeLast();
    System.out.println(list);
    // removing a selected node of linked list
    list.remove(0); //passing the index as argument
    System.out.println(list);
  }
}
