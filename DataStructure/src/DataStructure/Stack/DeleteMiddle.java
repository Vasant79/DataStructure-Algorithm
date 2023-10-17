package DataStructure.Stack;

import java.util.*;

public class DeleteMiddle {

    public static void removeMiddle(Stack<Integer> stack) {

        int middle = stack.size() / 2;
        List<Integer> list = new ArrayList<>();
        // System.out.println();

        while (stack.size() > middle) {

            list.add(stack.pop());
        }

        // adding list ele to stack from n-1
        for (int i = list.size() - 2; i >= 0; i--) {
            stack.push(list.get(i));

        }

        System.out.println(stack);

    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<>();
        // stack.push(3);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);

        removeMiddle(stack);
    }

}
