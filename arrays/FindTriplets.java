package arrays;

import java.util.*;

public class FindTriplets {

    public static void triplets(int arr[]) {

        if (arr.length < 3) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                for (int k = j + 1; k < arr.length; k++) {

                    if (((arr[i] != arr[j]) && (arr[j] != arr[k]) && (arr[k] != arr[i]))
                            && (arr[i] + arr[j] + arr[k] == 0)) {

                        List<Integer> arrList = new ArrayList<>();

                        arrList.add(arr[i]);
                        arrList.add(arr[j]);
                        arrList.add(arr[k]);

                        System.out.println(arrList);

                    }

                }

            }

        }

    }

    public static void main(String args[]) {

        int arr[] = { -1, 0, 1, 0 };
        triplets(arr);

    }

}
