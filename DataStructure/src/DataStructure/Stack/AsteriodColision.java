package DataStructure.Stack;

import java.util.Stack;

/**
 * passed all the test case given 3
 * -- find how to return in arr.
 */

public class AsteriodColision {

    public static void asteroidCollision(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (stack.isEmpty() || stack.peek() > 0 && arr[i] > 0) {
                stack.push(arr[i]);

            } else if (arr[i] < 0) {
                while (!stack.isEmpty() && Math.abs(arr[i]) >= stack.peek()) {
                    stack.pop();
                }
            }

        }
        System.out.println(stack);

    }

    public static void main(String[] args) {
        // int arr[] = { 5, 10, -5 };
        // int arr[] = { 8, -8 };
        int arr[] = { 10, 2, -5 };
        asteroidCollision(arr);
    }
}
