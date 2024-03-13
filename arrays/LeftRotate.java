package arrays;

import java.util.Arrays;

public class LeftRotate {

    public static void leftRotate(int arr[]) {

        int element = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = element;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };

        leftRotate(arr);
        System.out.println("Left rotated array : " + Arrays.toString(arr));

    }

}
