package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Array sorted using bubble sort " + Arrays.toString(arr));
    }

    public static void main(String args[]) {

        int arr[] = { 9, 8, 1, 2, 0, 5 };

        sort(arr);

    }

}
