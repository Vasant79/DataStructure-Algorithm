package DataStructure.Strings;

public class LengthOfLastWord {

    public static void lastWordLength(String str) {

        String arr[] = str.split(" ");
        // print(arr);

        String lastWord = arr[arr.length - 1];
        System.out.println("Length of last word : " + lastWord.length());

    }

    public static void print(String arr[]) {

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void main(String args[]) {

        String str = "luffy is still joyboy";

        lastWordLength(str);
    }

}
