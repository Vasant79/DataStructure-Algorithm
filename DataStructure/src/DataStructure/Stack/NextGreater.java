package DataStructure.Stack;

import java.util.*;

public class NextGreater {

    // using stack
    public static void nextGreater(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        // looping arr & storing stack
        for (int i = arr.length - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }

        getNext(stack, list);
    }

    public static void getNext(Stack<Integer> stack, List<Integer> list) {

        // base case
        if (stack.pop() < stack.peek()) {
            list.add(stack.peek());
            return;
        }

        // processing & call
        int ele = stack.peek();
        stack.pop();

        if (ele < stack.peek()) {
            list.add(stack.peek());
        }

        getNext(stack, list);

    }

    public static void main(String args[]) {
        int arr[] = { 3, 10, 4, 2, 1, 2, 6, 1, 7, 2, 9 };

        nextGreater(arr);
    }

}
