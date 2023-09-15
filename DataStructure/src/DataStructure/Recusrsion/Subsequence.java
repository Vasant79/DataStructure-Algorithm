package DataStructure.Recusrsion;

import java.util.ArrayList;
import java.util.Arrays;

// remember pick unpick concept

public class Subsequence {

    public static void allSubSequence(int arr[], ArrayList<Integer> list, int i) {

        // base case -- making mistake here
        if (i == arr.length) {
            System.out.println(list);
            return;
        }

        // processing
        // picking
        list.add(arr[i]);
        allSubSequence(arr, list, i + 1);

        // unpicking
        list.remove(list.size() - 1);
        allSubSequence(arr, list, i + 1);

    }

    // modifed version print subsequence whoes sum is 5
    public static void sumSubSequence(int arr[], int i, int sum, int k, ArrayList<Integer> list) {

        // base condition
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }

        // processing pick
        list.add(arr[i]);
        sum = sum + arr[i];
        sumSubSequence(arr, i + 1, sum, k, list);

        sum = sum - arr[i];
        list.remove(list.size() - 1);

        sumSubSequence(arr, i + 1, sum, k, list);
    }

    public static void main(String args[]) {

        int i = 0;
        int arr[] = { 1, 2, 3 };
        int k = 5;
        int sum = 0;

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("All subsequence for : " + Arrays.toString(arr));
        allSubSequence(arr, list, i);
        System.out.println("All subsequence that sum upto : " + k);
        sumSubSequence(arr, i, sum, k, list);
    }

}
