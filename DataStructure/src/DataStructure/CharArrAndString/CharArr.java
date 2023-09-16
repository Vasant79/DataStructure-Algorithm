package DataStructure.CharArrAndString;

import java.util.Arrays;

public class CharArr {

    // length of a string -- O(n)
    public static void lengthOfString(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count++;
        }

        System.out.println(count);
    }

    // length directly from char arr -- O(n)
    public static void length(char arr[]) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println(count);
    }

    // reverse a string
    public static void reverseString(String str) {

        // making arr of char
        char arr[] = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // swap at every itr
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }

        // printing new String
        for (char c : arr) {
            System.out.print(c);
        }

    }

    // basic palendrome
    public static void palindromeBasic(String str) {

        // convert str to char arr
        char arr[] = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            if (arr[start] != arr[end]) {
                System.out.println("Not a Palindrome");
                return;
            } else {

                start++;
                end--;
            }
        }

        System.out.println("Palindrome");
    }

    // string palindrom or not -- modified version takes only letters and no
    public static void palindromeAdvance(String str) {

        // to char arr
        char arr[] = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            if (isValid(arr[start]) && isValid(arr[end])) {
                if (lowercase(arr[start]) != lowercase(arr[end])) {
                    System.out.println("Not Palindrome");
                    return;
                } else {
                    start++;
                    end--;
                }
            } else if (isValid(arr[start])) {
                end--;
            } else {
                start++;
            }

        }

        System.out.println("Palindrome");
    }

    // fn for making lowercase --
    // Note there are buit in methods for lower case and checking if char is letter
    public static char lowercase(char ch) {

        // if ch in uppercase
        if (ch >= 'A' && ch <= 'Z') {
            char lowercaseCh = (char) (ch + 32);
            return lowercaseCh;
        }

        return ch;
    }

    // there was problem in is valid function
    public static boolean isValid(char c) {

        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
            return true;
        }

        return false;

    }

    // reverse words of string
    public static void stringReverse(String str) {

        String arr[] = str.split("\\s+");

        String reverseString = "";

        for (int i = arr.length - 1; i >= 0; i--) {

            reverseString = reverseString + arr[i];
            reverseString = reverseString + " ";

        }
        System.out.println(reverseString);
    }

    // counting alphabats
    public static void getMaxOccuringChar(String line) {
        int arr[] = new int[26];

        // loopinf str and updating occurence at respective index -- ignoring case
        char strArr[] = line.toCharArray();
        char a = 'a';

        for (int i = 0; i < strArr.length; i++) {

            // capturing in lower case
            char ch = Character.toLowerCase(strArr[i]);

            // mapped position wrt to alphabat
            int position = (int) ch - (int) a;

            // getting position of alphabat at 0 and increasing it.
            arr[position] = arr[position] + 1;

        }

        print(arr);
        System.out.println();
        System.out.println("max occuring alphabat index --> " + max(arr));

        // calling max fn
        char result = (char) ((int) a + max(arr));
        System.out.println(result);
    }

    public static void replaceSpaces(String str) {

        // str to arr on basis of 1 or more spaces
        String arr[] = str.trim().split("\\s+");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                result = result + "@40" + arr[i];
            } else {
                result = result + arr[i];
            }
        }

        System.out.println(result);
    }

    public static void replaceSubString(String str, String part) {

        // want to manuplate string -- go with string builder class
        StringBuilder sb = new StringBuilder(str);
        int subLen = part.length();

        while (sb.indexOf(part) != -1) {
            int index = sb.indexOf(part);
            sb.delete(index, index + subLen);
        }

        System.out.println(sb.toString());

    }

    // remove duplicates -- correct it
    public static void removeDuplicate(String str) {

        char arr[] = str.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {
                if (arr[i] == arr[i + 1]) {
                    sb.delete(i, i + 1);
                }
            }
        }

        System.out.println(sb.toString());

    }

    // remove adjucent duplicate
    public static String removeAdjucentDuplicate(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.append("k");

        for (int i = 0; i < sb.length(); i++) {

            for (int j = 0; j < sb.length() - 1; j++) {

                if (sb.charAt(j) == sb.charAt(j + 1)) {
                    sb.delete(j, j + 2);
                }
            }
        }

        // System.out.println(sb.toString());
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    // ------------------------ code above ------------------------

    // finding index with max int element
    public static int max(int arr[]) {
        int maxIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[maxIndex] < arr[i]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static void print(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String args[]) {

        // String str = "vasant";
        // char arr[] = { 'v', 'a', 's', 'u' };

        // lengthOfString(str);
        // length(arr);
        // reverseString("vasu");
        // palindromeAdvance("8V8K;G;K;V;");
        // stringReverse(" hello world ");

        // getMaxOccuringChar("abcdefabcdef");
        // replaceSpaces("Hi Vasant are you free");
        // replaceSubString("daabcbaabcbc", "abc");

        System.out.println(removeAdjucentDuplicate("aaaaaaaaaa"));
    }

}
