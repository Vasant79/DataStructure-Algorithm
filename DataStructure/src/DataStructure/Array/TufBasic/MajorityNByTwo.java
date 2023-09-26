package TufBasic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// tc --> Onlogn
public class MajorityNByTwo {

    // prints element occuring more then n/2
    public static void element(int arr[]) {

        Arrays.sort(arr);

        System.out.println(arr[arr.length / 2]);
    }

    // using hashmap tc--> O(N)
    public static void elementUsingHashing(int arr[]) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int baseFreq = 1;

        for (int i = 0; i < arr.length; i++) {

            // ifnot presesnt
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], baseFreq);
            } else {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
        }

        System.out.println(hm);

        // getting key with max value from hm
        System.out.println(max(hm, arr));
    }

    public static HashSet<Integer> max(HashMap<Integer, Integer> hm, int arr[]) {

        int maxNo = 1;

        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> m : hm.entrySet()) {

            if (m.getValue() > arr.length / 3) {
                maxNo = m.getKey();
                set.add(maxNo);
                // System.out.println(maxNo);
            }

        }
        return set;
    }

    public static void main(String args[]) {

        int arr[] = { 11, 33, 33, 11, 33, 11 };

        elementUsingHashing(arr);
    }

}
