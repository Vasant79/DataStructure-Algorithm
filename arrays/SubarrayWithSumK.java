package arrays;

import java.util.*;

public class SubarrayWithSumK {

    public static void getSubArray(int arr[], int target) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                int sum = 0;
                List<Integer> list = new ArrayList<>();

                for (int k = i; k <= j; k++) {
                    list.add(arr[k]);
                    sum = sum + arr[k];

                }
                // System.out.println(list);
                // System.out.println("Sum " + sum);

                if (sum == target) {
                    // store that list
                    if (result.size() < list.size()) {
                        result.clear();
                        result.addAll(list);
                    } else if (result.isEmpty()) {
                        result.addAll(list);
                    }

                }

            }
        }
        System.out.println(result);
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 5, 1, 9 };
        int target = 10;

        // int arr[] = { -1, 1, 1 };
        // int target = 1;

        getSubArray(arr, target);

    }

}
