package arrays;

import java.util.*;

/**
 * majority element n/3 -- max possible element can be 1
 */

public class MajorityElementNByThree {

    public static void majorityElementNby3(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {

            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() >= (float) n / 3) {

                System.out.println("Element with occ > than n/3 : " + entry.getKey());
                return;
            }

        }

        System.out.println(-1);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 2, 3, 2 };

        majorityElementNby3(arr);

    }

}
