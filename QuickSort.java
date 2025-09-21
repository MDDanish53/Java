// TC : O(n^2) - (Worst Case), O(n.logn) - (Average Case)
public class QuickSort {

  public static int partition(int arr[], int low, int high) {
    int pivot = arr[high]; // last element of array
    int i = low-1; // index to track smaller elements than pivot

    // placing smaller elements than pivot before the pivot element
    for(int j = low; j < high; j++) {
      if(arr[j] < pivot) {
        i++; // creating space for smaller element
        // swapping smaller element with ith position
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    // placing the pivot element at its correct position
    i++; // making place for pivot
    // swapping element at pivot position with pivot element i.e. element at the last index
    int temp = arr[i];
    arr[i] = pivot;
    arr[high] = temp;
    // returning the pivot element index
    return i;
  }

  public static void quickSort(int arr[], int low, int high) {
    if(low < high) {
      int pivIdx = partition(arr, low, high);
      // Partition for smaller than pivot elements
      quickSort(arr, low, pivIdx - 1);
      // Partition for bigger than pivot elements
      quickSort(arr, pivIdx + 1, high);
    }
  }
  public static void main(String args[]) {
    int arr[] = {4, 7, 2, 9, 1, 6, 3};
    int n = arr.length;
    quickSort(arr, 0, n-1);
    // printing the sorted array
    for(int i = 0; i < n; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
