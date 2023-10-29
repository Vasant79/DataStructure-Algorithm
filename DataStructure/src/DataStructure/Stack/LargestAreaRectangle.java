package DataStructure.Stack;

import java.util.*;

public class LargestAreaRectangle {

    // brute force
    public static void largestAreaRectangle(int arr[]) {

        int maxArea = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // length is arr[i]
            int len = arr[i];
            int b = 1;

            // calc breadth -- rigth expand b
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    // cannot expand b in right
                    break;
                } else {
                    b++;
                }

            }

            // left expand b
            if (i > 0) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[i] < arr[j]) {
                        b++;
                    } else {
                        break;
                    }
                }
            }

            int area = len * b;
            maxArea = Math.max(area, maxArea);

        }
        System.out.println("Area : " + maxArea);

    }

    /**
     * 
     * optimized approch using stack
     * INTITUTION --
     * get next smaller element for each and return indexes in arr
     * get prev smaller element '' ''
     * loop org arr and find area for each height given
     * handel case where next[i] ==1;
     * calulate b = next[i]-prev[i]-1
     */
    public static void optimized(int arr[]) {

        int next[] = nextSmaller(arr);
        int prev[] = prevSmaller(arr);

        int area = Integer.MIN_VALUE;

        // System.out.println(Arrays.toString(next)); -- deubgging

        for (int i = 0; i < arr.length; i++) {

            int breadth = next[i] - prev[i] - 1;

            // handleing cond where no next smallest
            if (next[i] == -1) {
                next[i] = arr.length;
            }

            int newArea = arr[i] * breadth;

            area = Math.max(area, newArea);

        }

        System.out.println("Rectangle with max area in Histogram is : " + area);

    }

    // finding next smaller index
    public static int[] nextSmaller(int arr[]) {

        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int ans[] = new int[arr.length];

        // loop from last till index
        for (int i = arr.length - 1; i >= 0; i--) {

            int current = arr[i];

            // * was making mistake in while condition
            while (s.peek() != -1 && arr[s.peek()] >= current) {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(i);

        }
        // System.out.println(Arrays.toString(ans));
        return ans;

    }

    // findinf prev smaller
    public static int[] prevSmaller(int arr[]) {

        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int ans[] = new int[arr.length];

        // same as above just loop changed from 0 to len
        for (int i = 0; i < arr.length; i++) {

            int current = arr[i];

            // * was making mistake in while condition
            while (s.peek() != -1 && arr[s.peek()] >= current) {
                s.pop();
            }

            ans[i] = s.peek();
            s.push(i);

        }
        // System.out.println(Arrays.toString(ans));
        return ans;

    }

    public static void main(String args[]) {

        // int arr[] = { 2, 1, 5, 6, 2, 3 };
        int arr[] = { 0, 9 };

        // largestAreaRectangle(arr); brute force approch

        // nextSmaller(arr); both works fine
        // prevSmaller(arr);

        optimized(arr);
    }

}
