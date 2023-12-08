package DataStructure.Stack;

import java.util.*;

/**
 * intitution -- major part includes finding largest rectangle in histogram
 * other part -- you update each row by adding upper ele if current ele !=0
 * updateing area
 */

public class LargestRectangleInMatrix {

    // main part :----------
    public static void largestRectangleInMatrix(int matrix[][]) {

        // largest rectangle in 1st row
        int area = largestRectangle(matrix[0]);

        // updating row
        for (int i = 1; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] != 0) {
                    // update -- made mistake here & in j value
                    matrix[i][j] = matrix[i][j] + matrix[i - 1][j];
                } else {
                    matrix[i][j] = 0;
                }
            }
            area = Math.max(area, largestRectangle(matrix[i]));
        }
        System.out.println("Largest area in 2d matrix : " + area);
    }

    // method of finding largest area in arr of heights ---- wroking fine
    public static int largestRectangle(int height[]) {

        int area = Integer.MIN_VALUE;

        // finding next smallest and prev smallest
        int next[] = nextSmaller(height);
        int prev[] = prevSmaller(height);

        // finding area for each height
        for (int i = 0; i < height.length; i++) {

            int len = height[i];
            if (next[i] == -1) {
                next[i] = height.length;
            }
            int b = next[i] - prev[i] - 1;
            int newArea = len * b;

            area = Math.max(area, newArea);

        }
        return area;
    }

    // getting next smaller index
    public static int[] nextSmaller(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int ans[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {

            while (stack.peek() != -1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // finding prev smaller
    public static int[] prevSmaller(int arr[]) {

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);

        int ans[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            // mistake her >= arr[i]
            while (stack.peek() != -1 && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }

            ans[i] = stack.peek();
            stack.push(i);
        }
        return ans;
    }

    // ------------------------------------------------------------------------------
    public static void main(String args[]) {
        int matrix[][] = { { 0, 1, 1, 0 },
                { 1, 1, 1, 1 },
                { 1, 1, 1, 1 },
                { 1, 1, 0, 0 } };
        int arr[] = { 0, 1, 1, 0 };

        largestRectangleInMatrix(matrix);
        largestRectangle(arr); // -- working fine
    }
}
