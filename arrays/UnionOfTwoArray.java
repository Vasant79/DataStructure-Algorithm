package arrays;

import java.util.*;

public class UnionOfTwoArray {

    public static void unionArray(int arr1[], int arr2[]) {

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {

            if (!set.contains(arr2[i])) {
                set.add(arr2[i]);
            }
        }

        System.out.println("union of 2 array is : " + set);
    }

    public static void main(String args[]) {

        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };

        unionArray(arr1, arr2);

    }

}
