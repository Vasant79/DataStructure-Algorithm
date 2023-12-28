package DataStructure.NeetCode;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * 
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not
 * matter.
 */

public class ThreeSum {

    // brute force -- O(n^3)
    public static void threeSum(int arr[]) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = i + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == 0) {
                        // eleminate duplicate
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i]);
                        list.add(arr[j]);
                        list.add(arr[k]);

                        Collections.sort(list);

                        set.add(list);

                    }
                }
            }
        }
        System.out.println(set);
    }

    // O(n^2) -- twick -- made a set and look up to it if it conatins the right k
    public static void threeSum2(int arr[]) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            Set<Integer> dummySet = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++) {

                int k = -(arr[i] + arr[j]);

                if (dummySet.contains(k)) {
                    // eleminate duplicate
                    List<Integer> list = new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(k);

                    Collections.sort(list);

                    set.add(list);

                }
                dummySet.add(arr[j]);
            }
        }
        System.out.println(set);
    }

    // approch 3 -- sort the array one loop -- now j pointer =i+1 ; k point len-1
    // while loop try to find for i+j+k ==0 , -- O(n^2)

    public static void optimizedThreeSum(int arr[]) {

        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            // taking care of duplicate i
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            // two pointer approch
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];

                if (sum == 0) {
                    // add to list
                    list.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;

                    // now taking care of duplicate j , k
                    while (j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while (j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        System.out.println(list);
    }

    public static void main(String args[]) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };

        // threeSum(arr);
        // threeSum2(arr);
        optimizedThreeSum(arr);
    }

}
