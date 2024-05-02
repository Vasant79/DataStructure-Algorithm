package arrays;

import java.util.*;

public class LeaderInArray {

    public static void findLeader(int arr[]) {
        List<Integer> leaders = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    // not a leader
                    break;
                }
                if (j == arr.length - 1) {
                    leaders.add(arr[i]);
                }
            }

        }
        leaders.add(arr[arr.length - 1]);

        System.out.println("Leaders are : " + leaders);
    }

    public static void main(String args[]) {

        int arr[] = { 4, 7, 1, 0 };
        findLeader(arr);

    }

}
