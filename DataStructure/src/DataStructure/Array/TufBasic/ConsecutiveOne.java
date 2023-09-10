package TufBasic;

import java.util.HashSet;
import java.util.Set;

public class ConsecutiveOne {

    public static void consecutiveOne(int arr[]) {

        int count = 0;
        Set<Integer> set = new HashSet<>(arr.length);

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1 && i != arr.length - 1) {
                count++;
            }
            if (arr[i] == 0) {
                set.add(count);
                count = 0;
            }

            if (arr[i] == 1 && i == arr.length - 1) {
                count++;
                set.add(count);
            }
        }

        System.out.println(set);
        int max = Integer.MIN_VALUE;

        for (int x : set) {
            if (max < x) {
                max = x;
            }
        }

        System.out.println(max);
    }

    // approch 2
    public static void maxCountOfOne(int arr[]) {

        int count = 0;
        int maxCount = 0;

        // itr arr -- on the go compare
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }

            maxCount = max(count, maxCount);
        }

        System.out.println(maxCount);
    }

    // ------------------ program above -------------------

    public static int max(int a, int b) {

        if (a > b) {
            return a;
        } else {
            return b;
        }

    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, 1, 1, 0, 1 };

        // consecutiveOne(arr);
        maxCountOfOne(arr);
    }

}
