package DataStructure.BinarySearch;

public class NoOfRotation {

    // brute force -- tc -- O(N)
    public static void rotation(int arr[]) {

        int rotation = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    break;
                }
            }
            rotation++;

        }

        System.out.println("No of time arr rotated : " + (rotation + 1));
    }

    // optimizeed approch -- correct it
    public static void optimized(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        // If the array is not rotated, return 0
        if (arr[start] <= arr[end]) {
            System.out.println("The array is not rotated.");
            return;
        }

        int mid = (start + end) / 2;

        while (start <= end) {

            // Check if mid is 0 separately
            if (mid == 0) {
                System.out.println("pivot element index indicates no of rotation: 0");
                return;
            }

            if (arr[mid] < arr[mid - 1]) {
                System.out.println("pivot element index indicates no of rotation :" + mid);
                return;
            }

            if (arr[mid] >= arr[start]) {
                start = mid;
            } else {
                end = mid - 1;
            }

            mid = (start + end) / 2;
        }
    }

    public static void main(String args[]) {

        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
        rotation(arr);

        // optimized(arr);
    }

}
