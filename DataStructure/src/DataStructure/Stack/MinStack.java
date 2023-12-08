package DataStructure.Stack;

import java.util.*;

/**
 * implement the stack and its method push pop peek
 * also implement a method min -- it should take constant time
 */

public class MinStack {

    // properties
    ArrayList<Integer> data;
    List<Integer> min;

    // constructor
    public MinStack() {
        this.data = new ArrayList<>();
        this.min = new ArrayList<>();
    }
    // methods

    public void push(int val) {
        data.add(val);

        // intially min empty -- pushing val to min , also adding the condition for next
        // time push
        if (min.isEmpty() || val <= min.get(min.size() - 1)) {
            min.add(val);
        }

    }

    public void pop() {

        if (!data.isEmpty()) {
            int removedValue = data.remove(data.size() - 1);

            if (!min.isEmpty() && removedValue == min.get(min.size() - 1)) {
                min.remove(min.size() - 1);
            }
        }

    }

    public void peek() {

        if (!data.isEmpty()) {
            System.out.println(data.get(data.size() - 1));
        }

    }

    public void size() {
        System.out.println(data.size());
    }

    public int min() {
        if (!min.isEmpty()) {
            return min.get(min.size() - 1);
        }
        return -1;
    }

}
