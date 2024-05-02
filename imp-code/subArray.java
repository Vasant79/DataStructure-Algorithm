package code;

import java.util.*;

// code for printing all subarray

public class subArray {

    public static void printSubArr(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                List<Integer> list = new ArrayList<>();

                for (int k = i; k <= j; k++) {

                    list.add(arr[k]);
                }
                System.out.println(list);

            }
        }
    }

    public static void main(String args[]) {
        // print all subarray
        int arr[] = { 2, 3, 5, 1, 9 };

        printSubArr(arr);
    }

}
