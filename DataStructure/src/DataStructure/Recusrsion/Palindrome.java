package DataStructure.Recusrsion;

public class Palindrome {

    public static boolean check(String str, int starting, int ending) {

        // base
        if (starting > ending) {
            return true;
        }

        // processing and call
        if (str.charAt(starting) != str.charAt(ending)) {
            return false;
        }

        return check(str, starting + 1, ending - 1);

    }

    public static void main(String args[]) {

        String str = "abba";
        int starting = 0;
        int ending = str.length() - 1;
        boolean result = check(str, starting, ending);

        if (result) {
            System.out.println("String is Panlindrome");
        } else {
            System.out.println("String is not Panlindrome");
        }
    }

}
