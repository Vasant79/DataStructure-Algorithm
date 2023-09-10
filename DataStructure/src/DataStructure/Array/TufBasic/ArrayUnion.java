package TufBasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayUnion {

    // works for sorted and unsorted arr
    public static void arrayUnion(int arr1[], int arr2[]) {

        Set<Integer> set = new HashSet<>();

        for (int x : arr1) {
            set.add(x);
        }

        for (int x : arr2) {
            set.add(x);
        }

        System.out.println(set);
    }

    // is arr sorted --> optimizing -- work on 2 pointer approch
    public static void unionOfSortedArray(int arr1[], int arr2[]) {

        ArrayList<Integer> list = new ArrayList<>();

        // 2 pointer approch
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            // revist it
            if (arr1[i] <= arr2[j]) {
                if (list.size() == 0 || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;

            } else {
                if (list.size() == 0 || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;

            }
        }

        // at some point loop will end-- incase one arr greater than other
        while (i < arr1.length) {
            if (list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;

        }

        while (j < arr2.length) {
            if (list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;

        }
        System.out.println(list);

    }

    public static void main(String args[]) {

        int arr1[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int arr2[] = { 2, 3, 4, 4, 5, 11, 12 };

        // arrayUnion(arr1, arr2);
        unionOfSortedArray(arr1, arr2);
    }

}
