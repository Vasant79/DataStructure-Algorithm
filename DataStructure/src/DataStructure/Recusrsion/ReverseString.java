package DataStructure.Recusrsion;

public class ReverseString {

    public static void reverse(String str, int lastIndex, StringBuffer sb) {

        // base
        if (lastIndex < 0) {

            return;
        }

        // processing and call
        sb.append(str.charAt(lastIndex));
        reverse(str, lastIndex - 1, sb);

    }

    public static void main(String args[]) {

        String str = "vasant";
        int lastIndex = str.length() - 1;

        StringBuffer sb = new StringBuffer();

        reverse(str, lastIndex, sb);
        System.out.println(sb);
    }

}
