package DataStructure.Stack;

import java.util.*;

/**
 * imp question for stack
 * next smaller
 */

public class Rough {

    // nextsmaller bruteforce time complexity O(N^2)
    public static void nextSmaller(int arr[]) {

        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[i]) {
                    // add it new arr
                    newArr[i] = arr[j];
                }
            }
            if (newArr[i] == 0) {
                newArr[i] = -1;
            }
        }
        System.out.println("Brtue forced ans : " + Arrays.toString(newArr));
    }

    // next smaller using stack
    public static void optimizedNextSmaller(int arr[]) {

        int newArr[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        // looping arr from back
        for (int i = arr.length - 1; i >= 0; i--) {

            // popinf ele till peek smaller than arr[i]
            while (stack.peek() >= arr[i]) {
                stack.pop();
            }

            newArr[i] = stack.peek();
            stack.push(arr[i]);
        }

        System.out.println("Optimized Ans : " + Arrays.toString(newArr));
    }

    /**
     * 
     * Solution fro finding next bigger
     */

    // bruteforce
    public static void nextBigger(int arr[]) {

        int newArr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    newArr[i] = arr[j];
                    break;
                }
            }
            if (newArr[i] == 0) {
                newArr[i] = -1;
            }
        }

        System.out.println("Next Bigger bruteforce : " + Arrays.toString(newArr));

    }

    // optimized next bigger
    public static void optimizedNextBigger(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        int newArr[] = new int[arr.length];

        stack.push(-1);

        for (int i = arr.length - 1; i >= 0; i--) {

            // aim here is to remove smaller ele from stack
            while (stack.peek() != -1 && stack.peek() < arr[i]) {
                stack.pop();
            }

            newArr[i] = stack.peek();
            stack.push(arr[i]);

        }

        System.out.println("Optimized next Bigger : " + Arrays.toString(newArr));

    }

    public static void main(String args[]) {

        int arr[] = { 2, 1, 3, 4, 2 };
        nextSmaller(arr);
        optimizedNextSmaller(arr);
        nextBigger(arr);
        optimizedNextBigger(arr);
    }

}
