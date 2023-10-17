package DataStructure.Stack;

import java.util.Stack;

public class RedundentBracket {

    public static boolean redundentBracket(Stack<Character> stack, String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '('
                    || str.charAt(i) == '+'
                    || str.charAt(i) == '-'
                    || str.charAt(i) == '*'
                    || str.charAt(i) == '/') {

                // push in stack
                stack.push(str.charAt(i));

            } else {

                boolean redundent = true;

                // when char is ) or small case
                if (str.charAt(i) == ')') {

                    // understand why loop needed -- why not just see peek ele if onpy taking
                    // operators
                    while (stack.peek() != '(') {

                        if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/') {
                            redundent = false;
                        }

                        stack.pop();
                    }

                    if (redundent) {
                        return true;
                    }
                }

            }
        }
        return false;
    }

    public static void main(String args[]) {

        Stack<Character> stack = new Stack<>();

        String str = "(a+b)";

        boolean result = redundentBracket(stack, str);

        System.out.println("str has redundent brackets : " + result);
    }

}
