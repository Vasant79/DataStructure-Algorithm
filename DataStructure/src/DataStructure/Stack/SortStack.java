package DataStructure.Stack;

import java.util.*;

public class SortStack {

    public static void sortDescending(Stack<Integer> stack) {

        // base case
        if (stack.isEmpty()) {
            // System.out.println(stack);
            return;
        }

        // processing & call
        int ele = stack.peek();
        // System.out.println(ele);
        stack.pop();

        sortDescending(stack);

        // insert in sorted manner
        sortedInsert(stack, ele);

    }

    // see again this fn -- that recursivly add in sorted manner
    public static void sortedInsert(Stack<Integer> stack, int ele) {

        // base case
        if (stack.isEmpty() || (!stack.isEmpty() && stack.peek() > ele)) {
            stack.push(ele);
            return;
        }

        // processing & call
        int val = stack.peek();
        stack.pop();

        sortedInsert(stack, ele);
        stack.push(val);

    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(7);
        stack.push(2);
        stack.push(71);
        stack.push(1);
        stack.push(9);

        sortDescending(stack);

        System.out.println(stack);

    }

}
