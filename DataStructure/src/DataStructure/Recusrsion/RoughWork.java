package DataStructure.Recusrsion;

import java.util.ArrayList;

public class RoughWork {

    public static void subSequence(int arr[], int index, ArrayList<Integer> list) {

        // base
        if (index == arr.length) {
            System.out.println(list);
            return;
        }

        // processing pick
        list.add(arr[index]);
        // call
        subSequence(arr, index + 1, list);
        list.remove(list.size() - 1);

        subSequence(arr, index + 1, list);
    }

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3 };
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();
        subSequence(arr, index, list);
    }

}
