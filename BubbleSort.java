public class BubbleSort {
  public static void printArr(int arr[]) {
    for(int i =0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  } 
  public static void main(String args[]) {
    int arr[] = {45, 76, 6, 32, 65, 8, 9, 0, 2};

    // Bubble sort - Time Complexity = O(n^2)
    for(int i = 0; i < arr.length-1; i++) {
      for(int j = 0; j < arr.length-1-i; j++) {
        if(arr[j] > arr[j+1]) {
          // swapping
          int temp = arr[j+1];
          arr[j+1] = arr[j];
          arr[j] = temp;
        }
      }
    }
    printArr(arr);
  }
}
