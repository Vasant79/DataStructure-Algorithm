package DataStructure.Stack;

import java.util.*;

/**
 * intitution -- stcak is empty store it with -1;
 * itr arr from back and compare if peek smaller or not if smaller add it new
 * answerArr
 * else -- pop till peek < arr[i] and then add it to new answerArr
 */

public class NextSmallerElement {

    public static void nextSmallest(Stack<Integer> stack, int arr[]) {

        int length = arr.length;
        stack.push(-1);

        int newArr[] = new int[length];
        int lastIndex = length - 1;

        for (int i = length - 1; i >= 0; i--) {

            if (arr[i] > stack.peek()) {
                newArr[lastIndex] = stack.peek();
                lastIndex--;
                stack.push(arr[i]);
            } else {

                while (stack.peek() > arr[i]) {
                    stack.pop();
                }

                newArr[lastIndex] = stack.peek();
                lastIndex--;
                stack.push(arr[i]);
            }
        }
        System.out.println(stack);
        System.out.println(Arrays.toString(newArr));
    }

    // clean code for nexrt smaller ele -- no need to exclusovely define last index
    public static void nextSmallestCleanCode(Stack<Integer> stack, int arr[]) {

        int length = arr.length;
        stack.push(-1);

        int newArr[] = new int[length];

        for (int i = length - 1; i >= 0; i--) {

            while (stack.peek() > arr[i]) {
                stack.pop();
            }

            newArr[i] = stack.peek();
            stack.push(arr[i]);
        }
        System.out.println(stack);
        System.out.println(Arrays.toString(newArr));

    }

    public static void main(String args[]) {

        int arr[] = { 2, 1, 4, 3 };
        Stack<Integer> stack = new Stack<>();

        // nextSmallest(stack, arr);
        nextSmallestCleanCode(stack, arr);
    }

}
