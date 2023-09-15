package DataStructure.Stack;

import java.util.ArrayList;

public class MinStack {

    // properties
    ArrayList<Integer> data;

    // constructor
    public MinStack() {
        data = new ArrayList<>();
    }
    // methods

    public void push(int val) {
        data.add(val);

    }

    public void pop() {

        if (!data.isEmpty()) {
            data.remove(data.size() - 1);
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

}
