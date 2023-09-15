package Hashing;

import java.util.HashMap;

// Example 1:
// Input: arr[] = {10,5,10,15,10,5};
// Output: 10  3
// 	 5  2
//         15  1
// Explanation: 10 occurs 3 times in the array
// 	      5 occurs 2 times in the array
//               15 occurs 1 time in the array

public class Frequency {

    public static void countFrequency(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int freq = 1;

        for (int i = 0; i < arr.length; i++) {

            // not contains add key with freq
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], freq);

            } else {
                // aldready added case
                int newFreq = hm.get(arr[i]) + 1;// mistake here -- getValue()
                hm.put(arr[i], newFreq);

            }
        }

        System.out.println(hm);
    }

    public static void main(String args[]) {

        int arr[] = { 2, 2, 3, 4, 4, 2 };

        countFrequency(arr);
    }

}
