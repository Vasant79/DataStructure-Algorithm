package DataStructure.Stack;

import java.util.*;

public class Celebrity {

    // brute force
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

    // optimized approch using stack
    public static void optimized(int arr[][]) {

        Stack<Integer> stack = new Stack<>();

        // adding people stack
        for (int i = 0; i < arr.length; i++) {
            stack.push(i);
        }

        while (stack.size() > 1) {

            // take 2 and see if they know
            int first = stack.pop();
            int second = stack.pop();

            // check if 1st know 2nd vice versa
            if (arr[first][second] == 0) {
                // knows second
                stack.push(first);

            } else if (arr[second][first] == 0) {
                stack.push(second);
            }
        }

        // System.out.println(stack); -- for debugging
        int celeb = stack.pop();

        // person that remains in stack is possible celeb
        // check condition for celeb -- row all 0, col all 1 except [i]==[j]
        boolean row = checkRow(celeb, arr);
        boolean col = checkCol(celeb, arr);

        // System.out.println(row + " " + col); -- for debugging

        if (checkCol(celeb, arr) && checkRow(celeb, arr)) {
            System.out.println("Celeb is :" + celeb);
            return;
        } else {
            return;
        }

    }

    public static boolean checkRow(int celeb, int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            if (i != celeb && arr[celeb][i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkCol(int celeb, int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            if (i != celeb && arr[i][celeb] == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String args[]) {

        int arr[][] = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        // celebrity(arr);
        optimized(arr);
    }

}
