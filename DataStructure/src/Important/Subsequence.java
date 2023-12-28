package Important;

import java.util.*;

/**
 * subsequence can be solved using recursion
 */

public class Subsequence {

    public static void allSubSequence(int arr[], int index, List<Integer> list) {

        // base case
        if (index >= arr.length) {

            // in we just want to print subsequence
            if (list.size() > 0) {
                System.out.println(list);

                // in case we want sum of all sub sequence
                int sum = 0;
                for (int i = 0; i < list.size(); i++) {
                    sum = sum + list.get(i);
                }
                System.out.println("sum is : " + sum);
            }

            return;
        }

        // processing and call

        // taking current element
        list.add(arr[index]);
        allSubSequence(arr, index + 1, list);

        // not taking current element
        list.remove(list.size() - 1);
        allSubSequence(arr, index + 1, list);

        return;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 10 };
        int index = 0;
        List<Integer> list = new ArrayList<>();

        allSubSequence(arr, index, list);
    }

}
