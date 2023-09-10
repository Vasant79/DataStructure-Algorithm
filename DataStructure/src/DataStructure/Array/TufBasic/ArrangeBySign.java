package TufBasic;

import java.util.ArrayList;
import java.util.Collections;

public class ArrangeBySign {

    public static void arrgangeBySign(int arr[], int n) {

        // creating new arr
        int newArr[] = new int[n];
        int index = 0;

        // itr for +ve
        for (int i = 0; i < n / 2; i++) {

            newArr[index] = arr[i];
            index = index + 2;

        }

        // storing -ve to new Arr
        index = 1;
        for (int i = n / 2; i < n; i++) {

            newArr[index] = arr[i];
            index = index + 2;
        }

        print(newArr, n);

    }

    // another way same tc as above
    public static void bruteforce(int arr[], int n) {

        // make Array/list of positive and -ve
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // itr arr seprating +ve and -ve
        for (int val : arr) {
            if (val >= 0) {
                pos.add(val);
            } else {
                neg.add(val);
            }
        }

        // now putting correct value in original arr
        for (int i = 0; i < n / 2; i++) {

            arr[i * 2] = pos.get(i);
            arr[i * 2 + 1] = neg.get(i);
        }

        print(arr, n);
    }

    // optimized sol
    // creating above code 1st itr
    public static void arrgangeBySignOptimized(int arr[], int n) {

        // copy
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));

        int posIndex = 0;
        int negIndex = 1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < 0) {
                list.set(negIndex, arr[i]);
                negIndex = negIndex + 2;

            } else {
                list.set(posIndex, arr[i]);
                posIndex = posIndex + 2;

            }

        }

        System.out.println(list);
    }

    // print array function
    public static void print(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // ---------------------- program above ------------------
    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, -1, -2, -3 };
        int size = 6;
        // arrgangeBySign(arr, size);
        // bruteforce(arr, size);

        arrgangeBySignOptimized(arr, size);
    }

}
