package arrays;

import java.util.Arrays;

public class MajorityElementNby2 {

    public static void elementOccuringNBy2(int arr[]) {

        Arrays.sort(arr);
        int element = arr[arr.length / 2];

        System.out.println("Element occuring more than n/2 times : " + element);
    }

    public static void main(String args[]) {

        int arr[] = { 2, 3, 3 };

        elementOccuringNBy2(arr);

    }

}
