package DataStructure.Recusrsion;

public class BinarySearch {

    public static int binarySearch(int arr[], int start, int end, int key) {

        // base
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2; // error here

        if (arr[mid] == key) {
            return arr[mid];
        }

        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, end, key);
        } else {
            return binarySearch(arr, start, mid - 1, key);
        }

    }

    public static void main(String args[]) {
        // sorted array
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int start = 0;
        int end = arr.length - 1;
        int key = 7;

        System.out.println(binarySearch(arr, start, end, key));
    }

}
