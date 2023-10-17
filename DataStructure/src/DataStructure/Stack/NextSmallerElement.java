package DataStructure.Stack;

import java.util.*;

public class NextSmallerElement {

    public static void nextSmallest(Stack<Integer> stack, int arr[]) {

        int n = arr.length;
        int lastIndex = arr.length - 1;
        int newArr[] = new int[n];
        stack.push(-1);

        for (int i = n - 1; i >= 0; i--) {

            // if (stack.peek() < arr[i]) {
            // newArr[lastIndex] = stack.peek();
            // stack.push(arr[i]);

            // } else {
            // while (stack.peek() > arr[i]) {
            // stack.pop();
            // }
            // newArr[lastIndex] = stack.peek();
            // stack.push(arr[i]);
            // }
            // lastIndex--;

            // clean code -- both code performs same
            while (stack.peek() > arr[i]) {
                stack.pop();
            }

            newArr[lastIndex] = stack.peek();
            lastIndex--;
            stack.push(arr[i]);

        }

        System.out.println(stack);
        System.out.println("Next Smallest : " + Arrays.toString(newArr));
    }

    public static void main(String args[]) {

        int arr[] = { 2, 1, 4, 3 };
        Stack<Integer> stack = new Stack<>();

        nextSmallest(stack, arr);
    }

}
