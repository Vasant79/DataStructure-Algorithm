package DataStructure.Stack;

import java.util.*;

public class Celebrity {

    public static void celebrity(int arr[][]) {

        Map<Integer, Boolean> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (i != j && arr[i][j] == 1) {

                    // System.out.println("Person " + i + " Knows " + j);
                    hm.put(i, false);
                    break;
                } else {
                    hm.put(i, true);
                }
            }

        }

        int celeb = findCeleb(hm);

        System.out.println("Celebrity person is : " + celeb);
    }

    public static int findCeleb(Map<Integer, Boolean> hm) {

        for (Map.Entry<Integer, Boolean> m : hm.entrySet()) {

            if (m.getValue() == true) {
                return m.getKey();
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        int arr[][] = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        celebrity(arr);
    }

}
