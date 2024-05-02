package strings;

import java.util.*;

public class RemoveParanthesis {

    public static void removeParanthesis(String s) {

        // using stack & string builder
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                if (stack.size() > 0) {
                    sb.append(s.charAt(i));
                }

                stack.push(s.charAt(i));
            } else {

                stack.pop();
                if (stack.size() > 0) {
                    sb.append(s.charAt(i));
                }
            }

        }

        System.out.println(sb);

    }

    public static void main(String args[]) {

        // String s = "(()())(())";
        String s = "(()())(())(()(()))";

        removeParanthesis(s);
    }

}
