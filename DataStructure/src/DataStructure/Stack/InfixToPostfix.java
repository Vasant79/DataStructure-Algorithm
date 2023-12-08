package DataStructure.Stack;

import java.util.*;

/**
 * convert infix to post fix -- post fix good for computers as only 1 scan
 * required
 * 
 * Example 1:
 * Input: a+b*(c^d-e)^(f+g*h)-i
 * Output: abcd^e-fgh*+^*+i-
 * Explanation: Infix to postfix
 * 
 */

public class InfixToPostfix {

    public static void convertToPostfix(String input) {

        Stack<Character> stack = new Stack<>();
        String result = "";

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            // printing non operands
            if (Character.isLetterOrDigit(c)) {
                result = result + c;
            }

            // incase we get '(''
            else if (c == '(') {
                stack.push(c);
            }

            // incase we get ')'
            else if (c == ')') {
                // pop till the peek ele is (
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result = result + stack.peek();
                    stack.pop();
                }

                // now the peek is (
                stack.pop();
            }

            // incase of operator
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {

                    result = result + stack.peek();
                    stack.pop();

                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {

            result = result + stack.peek();
            stack.pop();
        }

        System.out.println("post fix : " + result);
    }

    public static int precedence(char c) {

        switch (c) {
            case '+':
                return 1;

            case '-':
                return 1;

            case '*':
                return 2;

            case '/':
                return 2;

            case '^':
                return 3;

            default:
                return -1;
        }
    }

    public static void main(String[] args) {

        String input = "a+b*(c^d-e)^(f+g*h)-i";
        // abcd^e-fgh*+^*+i-

        convertToPostfix(input);
    }

}
