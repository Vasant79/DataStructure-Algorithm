package TufBasic;

import java.util.*;

public class RepeatingAndMissing {

    // condition integer appears exactly once tc--> O(nlogn);
    public static void repeatingAndMissing(int arr[]) {

        int n = arr.length;
        int duplicate = 0;
        int arrSum = 0;

        // duplicate
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            arrSum = arrSum + arr[i];

            if (i + 1 < arr.length) {
                if (arr[i] == arr[i + 1]) {
                    // duplicate
                    duplicate = arr[i];
                }
            }

        }

        // missing no
        int actualSum = n * (n + 1) / 2;
        int missingNo = actualSum - (arrSum - duplicate);

        System.out.println("Repeating ele :" + duplicate);
        System.out.println("Repeating ele : " + missingNo);

    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2, 5, 3 };

        repeatingAndMissing(arr);
    }

}
