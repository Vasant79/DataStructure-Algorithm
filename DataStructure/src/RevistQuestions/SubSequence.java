package RevistQuestions;

import java.util.ArrayList;

public class SubSequence {

    public static void allSubSequence(int arr[], int i, ArrayList<Integer> list) {

        // base
        if (i >= arr.length) {
            System.out.println(list);
            return;
        }

        // processing and call
        // pick
        list.add(arr[i]);
        allSubSequence(arr, i + 1, list);

        list.remove(list.size() - 1);

        // unpick
        allSubSequence(arr, i + 1, list);
    }

    public static void main(String args[]) {

        int arr[] = { 3, 1, 2 };
        int i = 0;

        ArrayList<Integer> list = new ArrayList<>();

        allSubSequence(arr, i, list);

    }
}
