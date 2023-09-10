package DataStructure.CharArrAndString;

public class ReverseVowel {

    public static void reverseVowel(String str) {

        char arr[] = str.toCharArray();

        int lastVowelIndex = -1;

        // looping str -- getting swapped vowels
        for (int i = 0; i < arr.length; i++) {

            if (isVowel(arr[i]) && lastVowelIndex != -1) {

                // swap vowels
                char temp = arr[lastVowelIndex];
                arr[lastVowelIndex] = arr[i];
                arr[i] = temp;

                lastVowelIndex = i;

            } else if (isVowel(arr[i])) {
                lastVowelIndex = i;
            }
        }

        print(arr);

    }

    public static boolean isVowel(char c) {

        char ch = Character.toLowerCase(c);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }

        return false;
    }

    public static void print(char arr[]) {

        for (char ch : arr) {
            System.out.print(ch);
        }
    }

    public static void main(String args[]) {

        reverseVowel("racecar");

    }

}
