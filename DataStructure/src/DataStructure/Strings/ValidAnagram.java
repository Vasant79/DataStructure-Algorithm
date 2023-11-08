package DataStructure.Strings;

import java.util.*;

public class ValidAnagram {

    // will fail 3 test case -- get the reason why & when
    public static void isAnagram(String s, String t) {

        // edge case
        if (s.length() != t.length()) {
            return;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < t.length(); i++) {

            char current = t.charAt(i);

            for (int j = 0; j < sb.length(); j++) {

                if (current == sb.charAt(j)) {
                    // deleting word from sb
                    sb.delete(j, j + 1);

                }
            }

        }

        if (sb.length() > 0) {
            System.out.println("NO");
        } else {
            System.out.println("Yes Anagram");
        }

        System.out.println(sb);

    }

    // solution passing all 42 test case
    public static void validAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return;
        }

        int[] charCount = new int[26]; // Assuming lowercase English alphabet

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        System.out.println(Arrays.toString(charCount));
        for (char c : t.toCharArray()) {
            if (charCount[c - 'a'] == 0) {
                System.out.println("NO Anagram");
                return;
            }
            charCount[c - 'a']--;
        }

        System.out.println("Yes Anagram");
    }

    public static void main(String arg[]) {

        String s = "anagram";
        String t = "nagaram";

        // isAnagram(s, t);
        validAnagram(s, t);

        // int arr[] = { 0, 1, 2, 3, 4 };

        // arr[0]++;// new thing -- you can implement in this way also
        // System.out.println(Arrays.toString(arr));

    }

}
