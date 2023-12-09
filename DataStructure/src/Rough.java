import java.util.*;

public class Rough {

    public static void nextGreater(int arr[]) {

        // it takes o(n^2) tc
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    arr[i] = arr[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    // optimize sol using stack to optimize next greater
    /**
     * algo -- itr from back
     * if stacknempty push arr[i]
     * if stack !empty check peek -- if peek > arr[i] = peek & push arr[i]
     * "" "" if peekn< arr[i] pop till peek > or empty stack
     */
    public static void optimizedSol(int arr[]) {
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (arr[i] < stack.peek()) {

                int top = stack.peek();
                int current = arr[i];

                arr[i] = top;
                stack.push(current);
            } else if (arr[i] > stack.peek()) {

                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    // pop
                    stack.pop();
                }

                if (stack.isEmpty()) {
                    stack.push(arr[i]);
                } else {
                    int current = arr[i];
                    int top = stack.peek();
                    arr[i] = top;
                    stack.push(current);

                }

            }

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void optimizedSol2(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        int result[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                stack.push(arr[i]);
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String args[]) {

        // print next greater element for this arr
        int arr[] = { 2, 1, 6, 9, 3, 5 };

        // nextGreater(arr);
        optimizedSol2(arr);

    }

}
