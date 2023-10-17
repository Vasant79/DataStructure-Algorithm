package DataStructure.BinarySearch;

public class SortedArraySearch {

    // brutr force O(N)
    public static void search(int arr[], int target) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Target is at index : " + i);
                break;
            }
        }
    }

    // optimized O(logn)
    public static void optimized(int arr[], int target) {

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;

        while (start <= end) {

            if (arr[mid] == target) {
                System.out.println("Index of the target : " + mid);
                return;
            }

            // imp condition
            // check where does mid lies
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
    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 7;

        // search(arr, target);
        optimized(arr, target);
    }

}
