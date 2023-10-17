package Implementations;

import java.util.Arrays;

/**
 * implementig stack using queue
 * Problem -- code correct -- but you should have used queue given by collection
 * I have used -- array implementing queue and changed its pop functionality
 */

public class StackUsingQ {

    // constructor
    public StackUsingQ(int k) {
        this.size = k;
        this.data = new int[k];
    }

    // props
    int rear = -1;
    int front = -1;
    int data[];
    int size;

    // methods
    public boolean push(int val) {

        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        data[rear] = val;
        return true;
    }

    public boolean pop() {

        // System.out.println("Popped element is : " + data[rear]);
        data[rear] = 0;
        rear = (rear - 1) % size;
        return true;

    }

    public boolean isFull() {
        return ((rear + 1) % size) == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

}
