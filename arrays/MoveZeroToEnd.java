package arrays;

import java.util.Arrays;

public class MoveZeroToEnd {

    public static int[] zeroToEnd(int arr[]) {

        int resultarr[] = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                resultarr[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(resultarr));

        return resultarr;
    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, 2, 3, 0, 4, 0, 1 };

        zeroToEnd(arr);

    }

}
