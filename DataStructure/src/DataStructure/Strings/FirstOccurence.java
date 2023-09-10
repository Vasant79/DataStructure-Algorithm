package DataStructure.Strings;

//Note -  always use .equals when comapring string

public class FirstOccurence {

    public static void firstOccurence(String s1, String s2) {

        int j = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            } else {
                j = 0;
            }

            if (j == s2.length()) {
                System.out.println(i - (j - 1));
                return;
            }
        }

        System.out.println("Not present");
    }

    // pass all test case --
    public static void firstOccurence2(String str1, String str2) {

        int j = 0;

        // mistake in sign <= should be there
        for (int i = 0; i <= (str1.length() - str2.length()); i++) {

            if (str1.charAt(i) == str2.charAt(j)) {
                if (str1.substring(i, (i + str2.length())).equalsIgnoreCase(str2)) {
                    System.out.println("first occurence index : " + i);
                    return;
                }
            }

        }

    }

    public static void main(String args[]) {
        String str1 = "mississipi";
        String str2 = "issip";

        // firstOccurence(s1, s2);
        firstOccurence2(str1, str2);
    }

}
