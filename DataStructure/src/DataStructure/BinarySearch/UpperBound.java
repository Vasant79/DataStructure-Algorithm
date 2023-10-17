package DataStructure.BinarySearch;

public class UpperBound {

    // brtue -- O(n) -- linear
    public static int upperBound(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > n) {
                return i;
            }
        }

        return -1;
    }

    // optimized
    public static void upperBoundOptimized(int arr[], int n) {

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        int mid = (start + end) / 2;

        // mistak <= in while expression
        while (start <= end) {

            if (arr[mid] > n) {
                // possible answer
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            mid = (start + end) / 2;
        }

        System.out.println(result);
    }

    public static void main(String args[]) {

        // int arr[] = { 3, 5, 8, 9, 15, 19 };
        int arr[] = { 1, 2, 2, 3 };
        int n = 2;
        // int n = 9;

        // int result = upperBound(arr, n);
        // System.out.println(result);

        upperBoundOptimized(arr, n);
    }

}
