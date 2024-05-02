package arrays;

import java.util.*;

public class RepeatingAndMissingNumber {

    public static int repeatingNo(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                // duplicate
                return arr[i];
            } else {
                map.put(arr[i], 1);
            }
        }
        return -1;
    }

    public static void missingNo(int arr[]) {

        int arrSum = 0;
        int n = arr.length;
        int originalSum = (n * (n + 1)) / 2;

        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];
        }

        int result = originalSum - (arrSum - repeatingNo(arr));
        System.out.println("Missing no is : " + result);
    }

    public static void missingAndRepeatingNo(int arr[]) {

        int repeatRes = repeatingNo(arr);
        System.out.println("Repeating no is : " + repeatRes);
        missingNo(arr);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2, 5, 4, 6, 7, 5 };
        missingAndRepeatingNo(arr);

    }

}
