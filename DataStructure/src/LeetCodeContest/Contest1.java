package LeetCodeContest;

public class Contest1 {

    public static void faultyKey(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (sb.length() > 0 && str.charAt(i) == 'i') {
                sb.reverse();
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String args[]) {

        faultyKey("qskyviiiii");
        faultyKey("viwik");

    }

}
