package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class ArrayIntersection {

    public static void intersection(int[] nums1, int[] nums2) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j] && result.contains(nums2[j]) == false) {
                    result.add(nums2[j]);
                    break;
                }
            }
        }

        // return in arr form
        System.out.println(result);
    }

    public static void print(Object arr[]) {
        for (Object obj : arr) {
            System.out.print(obj + " ");
        }
    }

    public static void main(String args[]) {

        int nums1[] = { 1, 2, 2, 3, 5, 6, 7, 8, 9, 1 };
        int nums2[] = { 2, 2, 4, 1, 9 };

        intersection(nums1, nums2);
    }
}
