package Algorithm;

import java.util.*;

/**
 * Merge sort -- use recursion , divide & merge
 */

public class MergeSort {

    public static void mergeSort(int arr[], int start, int end) {

        // base case
        if (start >= end) {
            return;
        }

        // processing & call
        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);// left half
        mergeSort(arr, mid + 1, end);// right half

        merge(arr, start, mid, end);// merging left and right
    }

    // had troble in merge fn -- see last loop copying to arr
    public static void merge(int arr[], int start, int mid, int end) {

        List<Integer> temp = new ArrayList<>();

        // left & right part
        int left = start;
        int right = mid + 1;

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {

                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // if some ele remaining in left
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right <= end) {
            temp.add(arr[right]);
            right++;
        }

        // coping temp value to arr
        for (int i = start; i <= end; i++) {
            arr[i] = temp.get(i - start);
        }
    }

    // ----------------- code above ---------------

    public static void main(String args[]) {

        int arr[] = { 4, 5, 8, 9, 10, 2, 3, 8 };
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);

        System.out.println(Arrays.toString(arr));
    }

}
