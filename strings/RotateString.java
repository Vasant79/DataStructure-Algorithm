package strings;

public class RotateString {

    public static boolean rotateToGoal(String str, String goal) {

        String rotatedString = str;

        for (int i = 0; i < str.length(); i++) {

            rotatedString = rotateToLeft(rotatedString);
            if (rotatedString.equals(goal)) {
                return true;
            }
        }
        return false;

    }

    public static String rotateToLeft(String str) {

        char strArr[] = str.toCharArray();
        char temp = strArr[0];

        for (int i = 1; i < strArr.length; i++) {

            strArr[i - 1] = strArr[i];
        }
        strArr[strArr.length - 1] = temp;

        return new String(strArr);
    }

    public static void main(String args[]) {
        String str = "gcmbf";
        String goal = "fgcmb";
        boolean result = rotateToGoal(str, goal);

        System.out.println("Result : " + result);
    }
}
