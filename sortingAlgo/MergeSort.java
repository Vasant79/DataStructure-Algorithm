package sortingAlgo;

import java.util.*;

/**
 * Merge sort -> divide & merge
 * divide - half array
 */

public class MergeSort {

    public static void mergeSort(int arr[], int start, int end) {

        // base case
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {

        int left = start;
        int right = mid + 1;

        List<Integer> arrList = new ArrayList<>();

        while (left <= mid && right <= end) {

            if (arr[left] <= arr[right]) {
                arrList.add(arr[left]);
                left++;
            } else {
                arrList.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            arrList.add(arr[left]);
            left++;
        }
        while (right <= end) {
            arrList.add(arr[right]);
            right++;
        }

        // mistake here -- understand arrList.get(i-start)
        for (int i = start; i <= end; i++) {
            arr[i] = arrList.get(i - start);
        }

    }

    public static void main(String args[]) {

        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        int start = 0;
        int end = arr.length - 1;

        System.out.println("Before merge sort : " + Arrays.toString(arr));
        mergeSort(arr, start, end);
        System.out.println("After merge sort : " + Arrays.toString(arr));

    }

}
