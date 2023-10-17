package DataStructure.Stack;

import java.util.Stack;

public class InsertAtBottam {

    public static void inserAtBottom(Stack<Integer> stack, int no) {

        // base case
        if (stack.isEmpty()) {
            stack.push(no);
            return;
        }

        // processing and call
        int ele = stack.peek();
        stack.pop();

        inserAtBottom(stack, no);

        stack.push(ele);
    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();
        int no = 9;

        stack.push(7);
        stack.push(1);
        stack.push(4);
        stack.push(5);

        inserAtBottom(stack, no);
        System.out.println(stack);
    }

}
