package arrays;

import java.util.Arrays;

public class Sort012 {

    public static void dutchNationalFlagAlgo(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                start = i;
                break;
            }
        }

        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] != 2) {
                end = i;
                break;
            }
        }

        for (int i = start; i < end; i++) {

            if (arr[i] == 1) {
                continue;
            } else if (arr[i] == 0) {
                // swap with start
                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;

                start++;

            } else {
                // swap with end
                int temp = arr[end];
                arr[end] = arr[i];
                arr[i] = temp;

                end--;
            }

        }

        System.out.println("Sorted 0 , 1 , 2 : " + Arrays.toString(arr));
    }

    public static void main(String args[]) {

        int arr[] = { 0, 0, 2, 0, 2, 1, 1, 0, 2 };
        dutchNationalFlagAlgo(arr);

    }

}
