package LeetCode;

import java.util.*;

public class ProductofArrayExceptSelf {

    public static void productExceptSelf(int[] nums) {

        // do brute force approch first

        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            // int current = nums[i];
            int product = 1;

            for (int j = 0; j < nums.length; j++) {

                if (i != j) {

                    // finding product
                    product = product * nums[j];

                }

            }
            ans[i] = product;
        }

        System.out.println(Arrays.toString(ans));
    }

    /**
     * 
     * loop 0 len -- store only prefix product
     * loop len-1 to 0 -- store post pix product * ans[i]
     */

    // code with O(n) time complexity
    public static void optomized(int nums[]) {

        int ans[] = new int[nums.length];

        int right = 1;
        int left = 1;

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                ans[i] = right;
            } else {
                right = right * nums[i - 1];
                ans[i] = right;

            }
        }
        // System.out.println(Arrays.toString(ans));

        for (int i = nums.length - 1; i >= 0; i--) {

            if (i == nums.length - 1) {
                ans[i] = ans[i] * left;
            } else {
                left = left * nums[i + 1];
                ans[i] = ans[i] * left;

            }
        }
        System.out.println("final ans :" + Arrays.toString(ans));

    }

    public static void main(String args[]) {

        // int nums[] = { 1, 2, 3, 4 };
        int nums[] = { -1, 1, 0, -3, 3 };

        productExceptSelf(nums);
        optomized(nums);

    }
}
