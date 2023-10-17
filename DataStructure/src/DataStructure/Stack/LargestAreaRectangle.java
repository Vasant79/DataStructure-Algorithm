package DataStructure.Stack;

public class LargestAreaRectangle {

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

    public static void main(String args[]) {

        int arr[] = { 2, 1, 5, 6, 2, 3 };

        largestAreaRectangle(arr);
    }

}
