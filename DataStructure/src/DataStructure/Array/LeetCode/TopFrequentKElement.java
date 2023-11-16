package LeetCode;

import java.util.*;

public class TopFrequentKElement {

    public static void topKFrequent(int[] nums, int k) {

        int ans[] = new int[k];

        Map<Integer, Integer> hm = new HashMap<>();
        int count = 1;

        for (int i = 0; i < nums.length; i++) {

            if (hm.isEmpty() || !hm.containsKey(nums[i])) {
                count = 1;
                hm.put(nums[i], count);
            } else if (hm.containsKey(nums[i])) {
                count++;
                hm.put(nums[i], count);
            }
        }

        System.out.println("hashmap : " + hm);

        // need k max element
        for (int i = 0; i < k; i++) {
            ans[i] = max(hm);
            hm.remove(ans[i]);
        }
        System.out.println(Arrays.toString(ans));

    }

    // finding max
    public static int max(Map<Integer, Integer> hm) {

        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {

            if (max < e.getValue()) {
                max = e.getValue();
            }

        }

        // setting max to key
        max = hm.get(max);
        // System.out.println(max);
        return max;

    }

    public static void main(String args[]) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        // resolve it for {-1,-1} case
        // int nums[] = { -1, -1 };
        int k = 2;
        topKFrequent(nums, k);
    }

}
