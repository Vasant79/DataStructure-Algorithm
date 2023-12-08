package DataStructure.Stack;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Example 1:
 * 
 * Input: height= [0,1,0,2,1,0,1,3,2,1,2,1]
 * 
 * Output: 6
 * 
 * Explanation: As seen from the diagram 1+1+2+1+1=6 unit of water can be
 * trapped
 * 
 * mistake -- see the prefix and suffix
 * 
 */

public class TrappingRainwater {

    public static void rainwaterCollected(int arr[]) {

        // logic get stored rain water for every height
        // -- min(left max , right max)-arr[i]

        int waterStored = 0;

        int prefix[] = leftmaxBuilding(arr);
        int postfix[] = rightmaxBuilding(arr);

        System.out.println(Arrays.toString(postfix));
        System.out.println(Arrays.toString(prefix));

        for (int i = 0; i < arr.length; i++) {
            waterStored = waterStored + Math.min(prefix[i], postfix[i]) - arr[i];
        }

        System.out.println(waterStored);
    }

    // --------------- helping methods -------------

    // mistake was here i was cal for next greater -- instead get the right max &
    // left max if current ele greater put current element in result [i]
    public static int[] rightmaxBuilding(int arr[]) {

        int result[] = new int[arr.length];

        result[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {

            result[i] = Math.max(arr[i], result[i - 1]);
        }

        return result;

    }

    public static int[] leftmaxBuilding(int arr[]) {

        int result[] = new int[arr.length];
        result[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            result[i] = Math.max(arr[i], result[i + 1]);
        }
        return result;
    }

    // ------------------- main ---------------------
    public static void main(String[] args) {

        // int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int arr[] = { 4, 2, 0, 3, 2, 5 };
        rainwaterCollected(arr);
    }

}
