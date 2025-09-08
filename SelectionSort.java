public class SelectionSort {
  public static void printArr(int arr[]) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }
  public static void main(String args[]) {
    int arr[] = {23, 56, 32, 1, 7, 75, 78, 65, 43, 12, 34};
    // Selection Sort - Time Complexity = O(n^2)
    for(int i = 0; i < arr.length - 1; i++) {
      int smallest = i;
      for(int j = i+1; j < arr.length; j++) {
        if(arr[smallest] > arr[j]) {
          smallest = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest] = temp;
    }
    printArr(arr);
  }
}
