package arrays;

import java.util.Arrays;

public class RearangeElementsBySign {

    public static void reArrangeElements(int arr[]) {

        int result[] = new int[arr.length];
        int positive = 0;
        int negative = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                result[positive] = arr[i];
                positive = positive + 2;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                result[negative] = arr[i];
                negative = negative + 2;
            }
        }

        System.out.println("ReArranged array is : " + Arrays.toString(result));

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, -3, -1, -2, 3 };
        reArrangeElements(arr);

    }

}
