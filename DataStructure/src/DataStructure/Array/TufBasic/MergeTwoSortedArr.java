package TufBasic;

import java.util.Arrays;

/*
 * Logic i at last index arr1 and j at firstindex of arr2
 * itr arr2 compare [i] & [j] if i>j swap and i--
 * */

public class MergeTwoSortedArr {

    // brute force solution
    public static void mergeBruteForce(int arr1[], int arr2[]) {

        for (int i = arr1.length - 1; i >= 0; i--) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] > arr2[j]) {
                    // swap
                    int temp = arr1[i];
                    arr1[i] = arr2[j];
                    arr2[j] = temp;
                }

            }
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));

    }

    public static void merge(int arr1[], int arr2[]) {
        // arr1 should have all small in asc and arr2 all big asc

        int i = arr1.length - 1;

        for (int j = 0; j < arr2.length; j++) {

            if (arr1[i] > arr2[j]) {
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
            }

        }

        // sortinf
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println("Array 1 : " + Arrays.toString(arr1));
        System.out.println("Array 2 : " + Arrays.toString(arr2));
    }

    public static void main(String args[]) {

        int arr1[] = { 1, 4, 8, 10 };
        int arr2[] = { 2, 3, 9 };

        // merge(arr1, arr2);

        mergeBruteForce(arr1, arr2);
    }

}
