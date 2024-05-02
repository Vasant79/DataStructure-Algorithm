package DataStructures;

import java.util.HashMap;

public class Hashmap {

    public static void iterating(HashMap<String, Integer> map) {

        // using for each loop -- keySet() gives up all the keys
        for (String s : map.keySet()) {

            System.out.println(s);

        }

        System.out.println("getting all the keys using .keySet() : " + map.keySet());
        System.out.println("getting all the values using .value() : " + map.values());

    }

    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();

        // adding elements
        map.put("t", 1);
        map.put("r", 1);
        map.put("e", 2);

        iterating(map);

    }

}
