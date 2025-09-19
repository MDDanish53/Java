// TC = O(n.logn)
public class MergeSort {

  public static void conquer(int arr[], int si, int mid, int ei) {
    // merged array
    int merged[] = new int[ei - si + 1];
    // index to track the first division of array
    int idx1 = si;
    // index to track the second division of array
    int idx2 = mid+1;
    // index to track the merged array
    int x = 0;

    // TC = O(n)
    // sorting both the divisions of array
    while(idx1 <= mid && idx2 <= ei) {
      if(arr[idx1] <= arr[idx2]) {
        merged[x++] = arr[idx1++];
      } else {
        merged[x++] = arr[idx2++];
      }
    }

    // if 1st division contains remaining values then add them in the merged array
    while(idx1 <= mid) {
      merged[x++] = arr[idx1++];
    }

    // if 2nd division contains remaining values then add them in the merged array
    while(idx2 <= ei) {
      merged[x++] = arr[idx2++];
    }

    // copying the merged array elements into the original array
    for(int i = 0, j = si; i < merged.length; i++, j++) {
      arr[j] = merged[i];
    }
  }

  public static void divide(int arr[], int si, int ei) {
    if(si >= ei) {
      return;
    }
    // TC = O(logn)
    int mid = si + (ei - si) / 2;
    divide(arr, si, mid);
    divide(arr, mid+1, ei);
    conquer(arr, si, mid, ei);
  }
  public static void main(String args[]) {
    int arr[] = {6, 3, 9, 5, 2, 8};
    int n = arr.length;
    divide(arr, 0, n-1);
    // printing the sorted array
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
   } 
}
