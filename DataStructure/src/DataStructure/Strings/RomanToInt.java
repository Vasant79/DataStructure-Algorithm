package DataStructure.Strings;

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.

public class RomanToInt {

    public static void romanToInt(String str) {

        int no = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'I') {
                // checking conditions
                if (i + 1 < str.length() && str.charAt(i + 1) == 'V') {
                    no = no + 4;
                    i++;
                } else if (i + 1 < str.length() && str.charAt(i + 1) == 'X') {
                    no = no + 9;
                    i++;
                } else {
                    no = no + 1;
                }
            } else if (str.charAt(i) == 'X') {
                if (i + 1 < str.length() && str.charAt(i + 1) == 'L') {
                    no = no + 40;
                    i++;
                } else if (i + 1 < str.length() && str.charAt(i + 1) == 'C') {
                    no = no + 90;
                    i++;
                } else {
                    no = no + 10;
                }
            } else if (str.charAt(i) == 'C') {
                if (i + 1 < str.length() && str.charAt(i + 1) == 'D') {
                    no = no + 400;
                    i++;
                } else if (i + 1 < str.length() && str.charAt(i + 1) == 'M') {
                    no = no + 900;
                    i++;
                } else {
                    no = no + 100;
                }

            } else if (str.charAt(i) == 'V') {
                no = no + 5;
            } else if (str.charAt(i) == 'L') {
                no = no + 50;
            } else if (str.charAt(i) == 'D') {
                no = no + 500;
            } else if (str.charAt(i) == 'M') {
                no = no + 1000;
            }
        }

        System.out.println(no);
    }

    public static void main(String args[]) {
        String str2 = "MCMXCIV";

        romanToInt(str2);
    }

}
