package arrays;

import java.util.*;

public class LongestConsecutiveSebsequence {

    public static void longestSubsequence(int arr[]) {

        Arrays.sort(arr);

        int maxLen = 1;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] + 1 == arr[i + 1]) {
                maxLen++;
            }

        }

        System.out.println("Longest subsequence : " + maxLen);

    }

    public static void main(String args[]) {

        int arr[] = { 3, 8, 5, 7, 6 };
        longestSubsequence(arr);
    }

}
