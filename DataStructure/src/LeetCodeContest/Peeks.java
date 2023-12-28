
package LeetCodeContest;

import java.util.*;

class Peeks {

    public static void peek(int arr[]) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < arr.length - 1; i++) {

            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                // peek
                list.add(i);

            }

        }
        System.out.println("list of peeks are :" + list);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 4, 3, 8, 5 };

        peek(arr);

    }
}