package DataStructure.BinarySearch;

public class PeakElement {

    // tc -- O(N)
    public static void peak(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Element : " + arr[i]);
                    System.out.println("index of peak Element : " + i);
                }
            }
        }
    }

    // optimized solution
    public static int peekOptimized(int arr[]) {

        int n = arr.length;

        // edge cases
        if (n == 1)
            return 0;

        if (arr[0] > arr[1]) {
            return 0;
        }
        if (arr[n - 1] > arr[n - 2]) {
            return arr[n - 1];
        }

        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                System.out.println("Peek Ele index : " + mid);
                return mid;
            }

            if (arr[mid] > arr[mid - 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };

        // peak(arr);
        peekOptimized(arr);
    }

}
