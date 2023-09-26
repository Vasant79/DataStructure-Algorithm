package TufBasic;

import java.util.*;

// Input: nums = [-1,0,1,2,-1,-4]

// Output: [[-1,-1,2],[-1,0,1]]

// Explanation: Out of all possible unique triplets possible, [-1,-1,2] and [-1,0,1] satisfy the condition of summing up to zero with i!=j!=k (meaning can not pick element twice)

public class ThreeSum {

    // brute force solution tc --> On^3
    public static void findPair(int arr[]) {

        int target = 0;
        // we are storing unique list inside set
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (arr[i] + arr[j] + arr[k] == target) {

                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);

                        // adding it to set
                        set.add(triplet);

                    }
                }
            }
        }
        System.out.println(set);

    }

    // On^2 -- better solution
    public static List<List<Integer>> findPairBetter(int arr[]) {

        Set<List<Integer>> finalSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            Set<Integer> set = new HashSet<>();

            for (int j = i + 1; j < arr.length; j++) {

                int third = -(arr[i] + arr[j]);

                if (set.contains(third)) {

                    // store i , j , third in a list
                    List<Integer> result = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(result);

                    // stored them in set to avoid duplicate
                    finalSet.add(result);
                }

                set.add(arr[j]);
            }
        }
        return new ArrayList<>(finalSet);

    }

    public static void findPairOptimized(int arr[]) {

    }

    public static void main(String args[]) {

        int arr[] = { -1, 0, 1, 2, -1, -4 };

        // findPair(arr);
        System.out.println(findPairBetter(arr));

    }

}
