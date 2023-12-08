package DataStructure.Queue;

import java.util.*;

public class FirstNegativeInWindow {

    public static int[] firstNegative(int arr[], int k) {

        int result[] = new int[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {

            if (i + k - 1 < arr.length) {
                for (int j = i; j < i + k; j++) {

                    if (arr[j] < 0) {
                        result[i] = arr[j];
                        break;
                    }
                }
            }
        }

        System.out.println("result arr : " + Arrays.toString(result));
        return result;
    }

    public static void main(String args[]) {

        int arr[] = { -8, 2, 3, -6, 10 };
        int k = 4;

        firstNegative(arr, k);
    }

}
