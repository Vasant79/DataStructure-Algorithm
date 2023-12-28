package LeetCodeContest;

import java.util.*;

/**
 * You are given a 0-indexed integer array coins, representing the values of the
 * coins available, and an integer target.
 * 
 * An integer x is obtainable if there exists a subsequence of coins that sums
 * to x.
 * 
 * Return the minimum number of coins of any value that need to be added to the
 * array so that every integer in the range [1, target] is obtainable.
 * 
 * A subsequence of an array is a new non-empty array that is formed from the
 * original array by deleting some (possibly none) of the elements without
 * disturbing the relative positions of the remaining elements.
 * 
 * 
 * Input: coins = [1,1,1], target = 20
 * Output: 3
 * Explanation: We need to add coins 4, 8, and 16. The resulting array will be
 * [1,1,1,4,8,16].
 * It can be shown that all integers from 1 to 20 are obtainable from the
 * resulting array, and that 3 is the minimum number of coins that need to be
 * added to the array.
 * 
 * 
 * loop range 1 to target
 * loop coins to check if range i is aviable in coins - if yes break
 * check is range i present in subsequence sum
 * 
 * if still not present add the range [i]
 * 
 * logic take and not take to get subsequence
 */

public class CoinsToBeAdded {

    public static void coinsToBeAdded(int arr[], int target, int index, List<Integer> result) {

        // change req nested arr to be list as it updates subseq to be used after
        // conditions
        List<Integer> coins = new ArrayList<>();
        List<Integer> sumList = new ArrayList<>();

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            coins.add(arr[i]);
        }
        // checking coins list
        System.out.println("Coins list " + coins);
        int initialSize = coins.size();

        // getting subsequence of initial coins list
        subsequence(coins, index, result, sumList);

        // checking initial sums of subsequencies
        System.out.println("sumList : " + sumList);

        for (int i = 1; i <= target; i++) {

            if (coins.size() > initialSize) {
                sumList.clear();
                subsequence(coins, index, result, sumList);
            }

            for (int j = 0; j < coins.size(); j++) {

                if (i != coins.get(j)) {
                    // check if it comes int sumList
                    boolean flag = false;
                    for (int k = 0; k < sumList.size(); k++) {
                        if (i == sumList.get(k)) {
                            flag = true;
                        }

                        if (flag == false) {
                            // add the i in coins list
                            coins.add(i);
                        }

                    }
                }

            }

        }
        System.out.println("Coins list " + coins);

    }

    // code for subsequence
    public static void subsequence(List<Integer> coins, int index, List<Integer> result,
            List<Integer> sumList) {

        // base case
        if (index >= coins.size()) {

            if (result.size() > 0) {
                // System.out.println(result);
                // calculate sum
                int sum = 0;
                for (int i = 0; i < result.size(); i++) {
                    sum = sum + result.get(i);
                }
                // System.out.println("sum " + sum);
                sumList.add(sum);
                // System.out.println(sumList);
            }
            return;
        }

        // processing and call
        // taking current element
        result.add(coins.get(index));
        subsequence(coins, index + 1, result, sumList);

        // not taking current element
        result.remove(result.size() - 1);
        subsequence(coins, index + 1, result, sumList);

        return;
    }

    public static void main(String[] args) {

        int arr[] = { 1, 4, 10 };
        int index = 0;
        int target = 19;
        List<Integer> result = new ArrayList<>();

        coinsToBeAdded(arr, target, index, result);

    }

}
