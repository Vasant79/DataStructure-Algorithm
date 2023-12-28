package LeetCodeContest;

import java.util.*;

/**
 * contest 375
 * You are given an integer array nums and a positive integer k.
 * 
 * Return the number of subarrays where the maximum element of nums appears at
 * least k times in that subarray.
 * 
 * A subarray is a contiguous sequence of elements within an array.
 * 
 * Input: nums = [1,3,2,3,3], k = 2
 * Output: 6
 * Explanation: The subarrays that contain the element 3 at least 2 times are:
 * [1,3,2,3], [1,3,2,3,3], [3,2,3], [3,2,3,3], [2,3,3] and [3,3].
 * 
 * 
 */

public class MaxApperenceKTimes {

    public static void maxElementSubarrayGreaterThanK(int arr[], int no) {

        int max = Integer.MIN_VALUE;
        int count = 0;

        List<Integer> list = new ArrayList<>();

        // get max from arr
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // algo for sub arr
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                // making sub arra
                for (int k = i; k <= j; k++) {
                    // System.out.print(arr[k] + " ");
                    list.add(arr[k]);
                }

                // check if it contains max no no times
                // issue -- was not correctly incrementing was doing maxOcc=maxOcc++;
                int maxOcc = 0;

                for (int m = 0; m < list.size(); m++) {
                    if (list.get(m) == max) {
                        maxOcc++;
                    }

                }
                if (maxOcc >= no) {
                    count++;
                }

                list.clear();

            }
        }
        System.out.println("Count is : " + count);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 2, 3, 3 };
        int no = 2;

        // int arr[] = { 1, 4, 2, 1 };
        // int no = 3;

        maxElementSubarrayGreaterThanK(arr, no);
    }

}
