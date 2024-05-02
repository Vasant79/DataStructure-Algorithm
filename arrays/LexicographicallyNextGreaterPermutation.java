package arrays;

import java.util.Arrays;

/**
 * see how to make it clean
 */

public class LexicographicallyNextGreaterPermutation {

    public static void nextGreaterPermutation(int arr[]) {

        int bp = breakPoint(arr);

        if (bp == -1) {
            reverse(arr);
            return;
        }

        System.out.println("breakpoint " + bp + " value " + arr[bp]);

        int justGreater = Integer.MAX_VALUE;
        int index = -1;

        for (int i = bp; i < arr.length; i++) {

            if (arr[i] > arr[bp - 1]) {
                justGreater = Math.min(justGreater, arr[i]);
                index = i;

            }
        }

        // swap just greater with bp-1

        int temp = arr[bp - 1];
        arr[bp - 1] = justGreater;
        arr[index] = temp;

        // sort array from bp to end
        int arrTobeSorted[] = new int[arr.length - bp];
        int start = 0;
        for (int i = bp; i < arr.length; i++) {
            arrTobeSorted[start] = arr[i];
            start++;
        }
        Arrays.sort(arrTobeSorted);

        // sorting sort array int original
        int elementIndex = 0;
        for (int i = bp; i < arr.length; i++) {
            arr[i] = arrTobeSorted[elementIndex];
            elementIndex++;
        }

    }

    public static int breakPoint(int arr[]) {

        for (int i = arr.length - 1; i > 0; i--) {

            if (arr[i - 1] < arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        int arr[] = { 3, 2, 1 };
        nextGreaterPermutation(arr);

        System.out.println(Arrays.toString(arr));

    }

}
