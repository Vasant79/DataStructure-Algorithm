package TufBasic;

import java.util.*;

public class FourSum {

    // tc--> O(N^4)
    public static void fourSum(int arr[], int target) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    for (int l = k + 1; l < arr.length; l++) {

                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            List<Integer> list = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));

                            Collections.sort(list);

                            set.add(list);

                        }
                    }
                }

            }
        }

        System.out.println(set);
    }

    // better solution O(N^3)
    public static void fourSumBetter(int arr[], int target) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    // removing loop l
                    int fourth = -(arr[i] + arr[j] + arr[k]);

                    if (arr[i] + arr[j] + arr[k] + fourth == target) {
                        List<Integer> list = new ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], fourth));

                        Collections.sort(list);

                        set.add(list);

                    }
                }
            }

        }
        System.out.println(set);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        fourSum(arr, target);
    }

}
