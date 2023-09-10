package TufBasic;

import java.util.ArrayList;

public class LeaderElement {

    public static ArrayList<Integer> leaderElement(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        // itr find non leader
        for (int i = 0; i < arr.length; i++) {

            if (i + 1 < arr.length) {
                if (arr[i] > arr[i + 1]) {
                    // possible leader
                    list.add(arr[i]);
                }
            }

            if (i == arr.length - 1) {
                if (list.get(list.size() - 1) < arr[i]) {
                    list.remove(list.size() - 1);
                    list.add(arr[i]);
                }
            }
        }
        // System.out.println(list);

        // handle edge case
        // 1 -- max ele at last position leader == max
        int max = max(list);
        if (max == list.get(list.size() - 1)) {
            list.clear();
            list.add(max);
            return list;
        }

        for (int i = 0; i < list.size(); i++) {

            if (i + 1 < list.size()) {
                if (list.get(i) < list.get(i + 1)) {
                    list.remove(i);
                }
            }
        }

        return list;

    }

    // optimized approch -- same tc but less computation *******
    public static void optimized(int arr[]) {

        ArrayList<Integer> list = new ArrayList<>();

        int max = arr[arr.length - 1];
        list.add(max);

        // itr arr in backwards
        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max) {
                // leader
                max = arr[i];
                list.add(arr[i]);
            }

        }
        System.out.println(list);
    }

    // --------------------- program above --------------

    public static int max(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }

        }
        return max;
    }

    public static void main(String args[]) {

        // int arr[] = { 10, 22, 12, 3, 0, 6 };
        int array[] = { 4, 7, 1, 0 };

        // System.out.println(leaderElement(arr));
        optimized(array);
    }

}
