import java.util.*;

public class Rough {

    /**
     * 
     * finding next greater using circular way -- modulas
     */
    public static void nextSmaller(int arr[]) {

        int result[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < 2 * arr.length; j++) {

                if (arr[j % arr.length] > arr[i]) {
                    result[i] = arr[j % arr.length];
                    break;
                }
            }
            if (result[i] == 0) {
                result[i] = -1;
            }
        }

        System.out.println("Finding next greater using modulas " + Arrays.toString(result));
    }

    /**
     * 
     * find next greater using stack
     */
    public static void nextGreaterUsingStack(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            if (!stack.isEmpty()) {

                if (stack.peek() > arr[i]) {
                    result[i] = stack.peek();
                    stack.push(arr[i]);

                } else {
                    while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                        stack.pop();
                    }

                    // in case all element are poped
                    if (stack.isEmpty()) {
                        result[i] = -1;
                        stack.push(arr[i]);

                    } else {
                        // in case peek > arr[i]
                        result[i] = stack.peek();
                        stack.push(arr[i]);

                    }
                }

            } else {
                result[i] = -1;
                stack.push(arr[i]);
            }

        }

        System.out.println("result of next greater : " + Arrays.toString(result));

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 3 };
        int arr2[] = { 5, 7, 1, 7, 6, 0 };

        // nextSmaller(arr);
        nextGreaterUsingStack(arr2);
    }

}
