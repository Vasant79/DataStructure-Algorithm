package LeetCodeContest;

import java.util.*;

/**
 * You are given a 0-indexed 2D array variables where variables[i] = [ai, bi,
 * ci, mi], and an integer target.
 * 
 * An index i is good if the following formula holds:
 * 
 * 0 <= i < variables.length
 * ((aibi % 10)ci) % mi == target
 * Return an array consisting of good indices in any order.
 */

class DoubleModularExponentiation {

    public static List<Integer> getGoodIndices(int[][] arr, int target) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;

            for (int j = 0; j < arr[0].length; j++) {

                switch (j) {
                    case 0:
                        a = arr[i][j];
                        break;
                    case 1:
                        b = arr[i][j];
                        break;
                    case 2:
                        c = arr[i][j];
                        break;
                    case 3:
                        d = arr[i][j];
                        break;

                }

            }

            /**
             * computation -- do this using modular compuattaion as Math can give error in
             * some case
             **/
            int comp = (int) (Math.pow(a, b) % 10);
            int result = (int) (Math.pow(comp, c) % d);

            if (result == target) {
                list.add(i);
            }

        }
        System.out.println("result : " + list);

        return list;
    }

    public static void main(String[] args) {

        // int arr[][] = { { 2, 3, 3, 10 }, { 3, 3, 3, 1 }, { 6, 1, 1, 4 } };
        // int arr[][] = { { 30, 5, 43, 2 }, { 15, 50, 35, 41 }, { 45, 34, 41, 32 }, {
        // 14, 37, 33, 13 }, { 6, 8, 1, 53 },
        // { 37, 1, 12, 52 }, { 42, 37, 2, 52 }, { 9, 2, 15, 3 }, { 31, 12, 21, 24 }, {
        // 52, 24, 6, 12 },
        // { 51, 35, 21, 52 }, { 30, 18, 10, 2 }, { 27, 31, 50, 27 }, { 29, 25, 26, 32
        // }, { 15, 38, 43, 17 },
        // { 22, 12, 16, 43 }, { 48, 9, 15, 6 }, { 41, 26, 22, 21 }, { 41, 49, 52, 26 },
        // { 53, 38, 9, 33 } };

        int arr[][] = { { 31, 12, 21, 24 } };
        int target = 1;

        getGoodIndices(arr, target);

    }

}
