package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static void maxFrequency(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        Arrays.sort(nums); // Onlogn

        // itr
        for (int i = 0; i < nums.length; i++) {

            int frequency = 1;

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + k >= nums[j]) {
                    frequency++;

                    // storing frequency with no
                    hm.put(i, frequency);
                } else {
                    break;
                }
            }

        }

        // System.out.println(hm);
        int result = max(hm);
        System.out.println("Maximum frequency : " + result);

    }

    public static int max(HashMap<Integer, Integer> hm) {
        int max = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {
            if (max < m.getValue()) {
                max = m.getValue();
            }
        }

        return max;

    }

    public static void main(String args[]) {

        int nums[] = { 1, 2, 4 };
        int k = 5;

        maxFrequency(nums, k);

    }

}
