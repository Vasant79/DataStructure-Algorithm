package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestAndLowestFrequency {

    public static void highestAndLowest(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int freq = 1;

        // getting freq of all no
        for (int i = 0; i < arr.length; i++) {

            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], freq);
            } else {
                int newfreq = hm.get(arr[i]) + 1;
                hm.put(arr[i], newfreq);
            }
        }

        maxMin(hm);
    }

    public static void maxMin(HashMap<Integer, Integer> hm) {

        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxEle = 0;
        int minEle = 0;

        // itr and get max and min
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {

            int value = m.getValue();
            int key = m.getKey();

            if (maxFreq < value) {
                maxFreq = value;
                maxEle = key;

            }
            if (minFreq > value) {
                minFreq = value;
                minEle = key;
            }

        }

        System.out.println("Max " + maxEle + " Min " + minEle);
        System.out.println("Max Frequency " + maxFreq + " Max Frequency " + minFreq);

    }

    public static void main(String args[]) {

        int arr[] = { 2, 2, 3, 4, 4, 2 };

        highestAndLowest(arr);
    }

}
