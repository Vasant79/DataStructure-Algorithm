package arrays;

import java.util.*;

public class RemoveDuplicatesInPlace {

    public static Set<Integer> removeDuplicated(int arr[]) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            // add to set
            set.add(arr[i]);
        }

        return set;

    }

    public static void main(String args[]) {

        int arr[] = { 1, 1, 2, 2, 3, 3, 3, 3, 3, 3 };

        Set<Integer> result = removeDuplicated(arr);

        System.out.println("After removing duplicate : " + result);

    }

}
