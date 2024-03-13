package arrays;

import java.util.*;

public class MaximumConsecutiveOne {

    public static int getMax(Set<Integer> set) {

        int max = 0;

        for (Integer element : set) {

            if (max < element) {
                max = element;
            }
        }

        return max;
    }

    public static void consecutiveOne(int arr[]) {

        Set<Integer> set = new HashSet<>();

        int consecutiveCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                consecutiveCount++;
            } else {
                if (arr[i - 1] >= 0 && arr[i - 1] != 0) {
                    set.add(consecutiveCount);
                }
                consecutiveCount = 0;
            }
        }

        int maxConsecutiveOne = getMax(set);

        System.out.println("Maximum consecutive one's are : " + maxConsecutiveOne);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1 };

        consecutiveOne(arr);

    }

}
