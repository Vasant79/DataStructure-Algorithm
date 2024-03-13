package arrays;

import java.util.*;

public class NumberAppearOnlyOnce {

    public static int getKeyOfMinValue(Map<Integer, Integer> map) {

        int minValue = Integer.MAX_VALUE;
        int result = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (minValue > entry.getValue()) {
                minValue = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == minValue) {
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void elementWithFrequencyOne(int arr[]) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {

                int value = map.get(arr[i]) + 1;
                map.put(arr[i], value);

            } else {
                map.put(arr[i], 1);
            }
        }

        // get key of max value
        int element = getKeyOfMinValue(map);

        System.out.println("Element occuring once is : " + element);

    }

    public static void main(String args[]) {

        int arr[] = { 4, 1, 2, 1, 2 };
        elementWithFrequencyOne(arr);

    }

}
