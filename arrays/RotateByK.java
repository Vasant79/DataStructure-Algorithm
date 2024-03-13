package arrays;

import java.util.Arrays;

public class RotateByK {

    public static void rotateToRight(int arr[], int n, int k) {

        int resultArr[] = new int[n];
        int start = 0;
        int last = n - 1;

        for (int i = arr.length - 1 - k; i >= 0; i--) {

            resultArr[last] = arr[i];
            last--;
        }

        for (int i = arr.length - k; i < arr.length; i++) {
            resultArr[start] = arr[i];
            start++;
        }

        System.out.println(Arrays.toString(resultArr));
    }

    public static void rotateToLeft(int arr[], int n, int k) {

        int resultArr[] = new int[n];
        int start = 0;
        int last = n - k;

        for (int i = k; i < arr.length; i++) {

            resultArr[start] = arr[i];
            start++;
        }

        for (int i = 0; i < k; i++) {
            resultArr[last] = arr[i];
            last++;
        }

        System.out.println(Arrays.toString(resultArr));
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 7;
        rotateToRight(arr, 7, 2);
        rotateToLeft(arr, n, 3);

    }

}
