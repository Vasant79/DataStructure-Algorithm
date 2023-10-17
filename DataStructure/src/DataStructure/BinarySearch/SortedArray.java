package DataStructure.BinarySearch;

public class SortedArray {

    public static boolean search(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == target) {
                return true;
            }

            // checking where to go as per mid
            if (arr[mid] >= arr[start]) {

                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            mid = (start + end) / 2;
        }
        return false;
    }

    public static void main(String args[]) {

        int arr[] = { 7, 8, 10, 1, 2, 3, 3, 3, 4, 5, 6 };
        int target = 10;

        boolean result = search(arr, target);
        System.out.println(result);
    }

}
