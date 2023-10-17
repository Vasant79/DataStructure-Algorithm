package DataStructure.Stack;

import java.util.Stack;

public class ReverseStack {

    // normal approch tc --> O(N)
    public static void reverse(Stack<Integer> stack) {

        Stack<Integer> s2 = new Stack<>();

        while (!stack.isEmpty()) {

            s2.push(stack.pop());
        }

        System.out.println(s2);
    }

    // recursive approch
    public static void reverseStack(Stack<Integer> stack, Stack<Integer> s2) {

        // base case
        if (stack.isEmpty()) {
            return;
        }

        // processing & call
        int ele = stack.peek();
        s2.push(ele);

        stack.pop();
        reverseStack(stack, s2);

    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();

        Stack<Integer> s2 = new Stack<>();

        stack.push(1);

        stack.push(2);

        stack.push(3);

        stack.push(4);

        stack.push(5);

        System.out.println("reverse stack : " + stack);
        // reverse(stack);
        reverseStack(stack, s2);
        System.out.println(s2);
    }

}
