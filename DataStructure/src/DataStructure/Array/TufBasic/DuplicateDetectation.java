package TufBasic;

import java.util.Arrays;

public class DuplicateDetectation {

    // O(nlogn) -- look for optimised ans
    public static void duplicate(int arr[], int n) {

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] == arr[i + 1]) {
                    System.out.print(arr[i] + " ");
                    return;
                }
            }
        }

    }

    // array printing
    public static void print(int arr[]) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 3, 4, 2 };
        int n = 5;

        duplicate(arr, n);
    }

}
