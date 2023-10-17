package DataStructure.Stack;

import java.util.*;

public class ReverseString {

    // tc --> O(N) , sc-->O(1)
    public static void reverse(String str) {

        int len = str.length();

        Stack<Character> stack = new Stack<>();
        String newStr = "";

        for (int i = 0; i < len; i++) {

            stack.push(str.charAt(i));
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            newStr = newStr + stack.pop();

        }
        System.out.println(newStr);

    }

    public static void main(String args[]) {

        String str = "vasant";

        reverse(str);
    }

}
