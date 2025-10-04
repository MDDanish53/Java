package datastructures;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {
  public static void main(String args[]) {
    ArrayList<Integer> list = new ArrayList<>();

    // add elements in ArrayList
    list.add(45);
    list.add(21);
    list.add(56);

    System.out.println(list);

    // get elements of ArrayList
    int element = list.get(1);
    System.out.println(element);

    // add elements in between the ArrayList
    list.add(2, 78); // (idx, newValue)
    System.out.println(list);

    // set element - update element of any index
    list.set(1, 786);
    System.out.println(list);

    // delete element at any index
    list.remove(2); // idx
    System.out.println(list);

    // getting the size(length) of ArrayList
    int size = list.size();
    System.out.println("Size of list = "+size);

    // using loops on ArrayList
    for(int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i)+", ");
    }
    System.out.println();

    // Sorting an ArrayList
    Collections.sort(list);
    System.out.println(list);
  }
}