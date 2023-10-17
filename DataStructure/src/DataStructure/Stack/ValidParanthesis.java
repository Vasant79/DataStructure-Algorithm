package DataStructure.Stack;

import java.util.*;

public class ValidParanthesis {

    public static void checkValidity(String str) {

        Stack<Character> stack = new Stack<>();

        // System.out.println(stack.size());

        for (int i = 0; i < str.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(str.charAt(i));
                continue;

            } else if ((stack.peek() == '[' && str.charAt(i) == ']')
                    || (stack.peek() == '{' && str.charAt(i) == '}')
                    || (stack.peek() == '(' && str.charAt(i) == ')')) {

                // problem here -- simple did peek elem == charAt()
                stack.pop();

            } else if (stack.peek() != str.charAt(i)) {

                stack.push(str.charAt(i));
            }
        }
        System.out.println(stack);

        if (stack.isEmpty()) {
            System.out.println("Balanced ");
        } else {
            System.out.println("Not balanced");
        }
    }

    public static void main(String args[]) {

        String str = "[()]{}";

        checkValidity(str);
    }

}
