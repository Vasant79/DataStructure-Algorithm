package TufBasic;

import java.util.Arrays;

//time complexity O(nlogn)- 10^6
public class SortZeroOneTwo {

    public static void sort(int arr[]) {

        Arrays.sort(arr);
        print(arr);
    }

    // better approch -- dutch national flog algo - when sorting 3 items
    public static void optimized(int arr[]) {

        // indexes
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {

            // if zero
            if (arr[mid] == 0) {
                // swap low with mid
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // 2 replace with high & high --
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }

        }

        print(arr);

    }

    public static void print(int arr[]) {

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 2, 0, 2, 1, 1, 0 };

        // sort(arr);
        optimized(arr);
    }

}
