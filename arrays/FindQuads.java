package arrays;

import java.util.*;

public class FindQuads {

    public static void findQuads(int arr[], int target) {

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    for (int l = k + 1; l < arr.length; l++) {

                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {

                            List<Integer> list = new ArrayList<>();
                            list.add(arr[i]);
                            list.add(arr[j]);
                            list.add(arr[k]);
                            list.add(arr[l]);

                            result.add(list);

                        }
                    }
                }
            }
        }
        System.out.println(result);

    }

    public static void main(String args[]) {

        int arr[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        findQuads(arr, target);
    }

}
