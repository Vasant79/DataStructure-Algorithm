package strings;

public class ReverseString {

    public static void reverseString(String str) {

        String arr[] = str.split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {

        String str = "this is an amazing program";

        reverseString(str);

    }

}
