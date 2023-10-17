package TufBasic;

import java.util.*;

public class MergeOverLap {

    public static void mergeOverLap(int arr[][]) {

        List<List<Integer>> list = new ArrayList<>();

        // sorting 2d array
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // itr 2d arr
        for (int i = 0; i < arr.length; i++) {

            int start = arr[i][0];
            int end = arr[i][1];

            if (!list.isEmpty() && end <= list.get(list.size() - 1).get(1)) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                } else {
                    break;
                }
            }
            list.add(Arrays.asList(start, end));
        }

        System.out.println(list);
    }

    // optimized
    public static void mergeOverLapOptimized(int arr[][]) {

        List<List<Integer>> list = new ArrayList<>();

        // sorting 2d array
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        // itr 2d arr
        for (int i = 0; i < arr.length; i++) {

            int start = arr[i][0];
            int end = arr[i][1];

            if (!list.isEmpty() && end <= list.get(list.size() - 1).get(1)) {
                continue;
            }

            int j = i + 1;
            if (j < arr.length) {

                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }

            }

            list.add(Arrays.asList(start, end));
        }

        System.out.println(list);
    }

    public static void main(String args[]) {

        int arr[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };

        // mergeOverLap(arr);
        mergeOverLapOptimized(arr);
    }

}
