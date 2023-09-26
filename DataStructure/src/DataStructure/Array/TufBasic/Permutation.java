package TufBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Permutation {

    public static void nextPermutation(int arr[]) {

        boolean ascending = true;

        // check if ascending
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    ascending = false;

                }
            }
        }
        System.out.println(ascending);

        if (ascending == false) {
            // swap
            int temp = arr[0];
            arr[0] = arr[2];
            arr[2] = temp;
        } else {
            int temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void nextPermutationCorrect(ArrayList<Integer> list) {

        int size = list.size();
        int index = -1;

        // find break point
        for (int i = size - 2; i >= 0; i--) {

            if (list.get(i) < list.get(i + 1)) {
                // found break point
                index = i;
                break;
            }
        }

        System.out.println(index);

        // in case no break point
        if (index == -1) {
            Collections.reverse(list);
            // System.out.println(list);

            return;
        }

        // find smaller value than break point
        for (int i = size - 1; i > index; i--) {
            // compare
            if (list.get(i) > list.get(index)) {

                System.out.println("smaller value : " + list.get(i));
                // swap
                int temp = list.get(i);
                list.set(i, list.get(index));
                list.set(index, temp);

                break;
            }
        }

        // reverseing after break point index
        int i = index + 1;
        int j = size - 1;

        while (i <= j) {

            // swap
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);

            i++;
            j--;
        }

        System.out.println(list);

    }

    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);

        // list.add(5);
        // list.add(4);
        // list.add(3);
        // list.add(2);
        // list.add(1);

        nextPermutationCorrect(list);
    }

}
