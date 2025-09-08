public class InsertionSort {
  public static void printArr(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String args[]) {
    int arr[] = {12, 1, 34, 65, 22};
    for(int i = 1; i < arr.length; i++) {
      int current = arr[i]; // curr element
      int j = i-1; // last index of sorted part
      while(j >= 0 && current < arr[j]) {
        arr[j+1] = arr[j];
        j--;
      }
      // placement
      arr[j+1] = current;
    }
    printArr(arr);
  }
}
