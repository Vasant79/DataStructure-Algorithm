package DataStructure.Stack;

import java.util.*;

/***
 * mistakes --
 * when comparing string use s1.equals(s2)
 * 
 * algo -- push operand to stack
 * when operater encountered -- pop and do the operateions as operand
 * 
 * 
 */

public class PostfixtoInfix {

    public static void convertToPrefix(String arr[]) {

        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals("+")) {

                stack.push(stack.pop() + stack.pop());

            } else if (arr[i].equals("-")) {

                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);

            } else if (arr[i].equals("*")) {
                stack.push(stack.pop() * stack.pop());

            } else if (arr[i].equals("/")) {
                int a = stack.pop();
                int b = stack.pop();

                stack.push(b / a);
            } else {
                stack.push(Integer.parseInt(arr[i]));
            }

        }
        result = stack.peek();
        System.out.println("Result of expression is : " + result);
    }

    public static void main(String[] args) {

        String arr[] = { "2", "1", "+", "3", "*" };
        convertToPrefix(arr);
    }

}
