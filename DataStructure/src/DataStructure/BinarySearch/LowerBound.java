package DataStructure.BinarySearch;

public class LowerBound {

    // brute force -- linear
    public static int lowerBound(int arr[], int n) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= n) {
                return i;
            }
        }

        return -1;

    }

    // optimized binary
    public static void lowerBoundOptimized(int arr[], int n) {

        int start = 0;
        int end = arr.length - 1;

        int mid = (start + end) / 2;
        int result = -1;

        while (start <= end) {

            if (arr[mid] >= n) {
                // possible answer
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            // updating mid
            mid = (start + end) / 2;

        }

        System.out.println(result);
    }

    public static void main(String args[]) {

        // arr sorted
        int arr[] = { 3, 5, 8, 15 };
        int n = 9;

        // int result = lowerBound(arr, n);
        // System.out.println(result);

        lowerBoundOptimized(arr, n);
    }

}
