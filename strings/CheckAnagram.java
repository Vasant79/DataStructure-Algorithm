package strings;

import java.util.*;

public class CheckAnagram {

    public static boolean checkAnagram(String s1, String s2) {

        Map<Character, Integer> map = new HashMap<>();

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), 1);
        }

        for (int i = 0; i < s2.length(); i++) {
            if (!map.containsKey(s2.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]) {

        String s1 = "act";
        String s2 = "tac";

        boolean result = checkAnagram(s1, s2);

        System.out.println("Anagram : " + result);

    }

}
