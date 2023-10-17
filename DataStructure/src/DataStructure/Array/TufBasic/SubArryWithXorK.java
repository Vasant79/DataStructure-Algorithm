package TufBasic;

import java.util.HashMap;

public class SubArryWithXorK {

    public static void subArryWithXorK(int arr[], int k) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            int xor = 0;
            for (int j = i; j < arr.length; j++) {

                xor = xor ^ arr[j];

                if (xor == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    // optmizing using hashing
    public static void subArryWithXorKOptimized(int arr[], int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int xr = 0;
        int count = 0;

        // adding to hm with freq
        hm.put(xr, 1);

        for (int i = 0; i < arr.length; i++) {

            xr = xr ^ arr[i];

            int x = xr ^ k;

            if (hm.containsKey(x)) {
                count = count + hm.get(x);
            }

            // incase xr already in map
            if (hm.containsKey(xr)) {
                hm.put(xr, hm.get(xr) + 1);
            } else {
                // incase not present
                hm.put(xr, 1);
            }
        }

        System.out.println(count);

    }

    public static void main(String args[]) {

        int arr[] = { 5, 6, 7, 8, 9 };
        int k = 5;

        // subArryWithXorK(arr, k);
        subArryWithXorKOptimized(arr, k);

    }

}
