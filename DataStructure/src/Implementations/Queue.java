package Implementations;

import java.util.Arrays;

/**
 * implementing queue using arr -- correct dry run it
 */

public class Queue {

    // constructor
    public Queue(int k) {
        this.size = k;
        this.data = new int[k];

    }

    // props
    int front = -1;
    int rear = -1;
    int data[];
    int size;

    // methods
    public boolean enqueue(int num) {

        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }

        rear = (rear + 1) % size;
        data[rear] = num;
        return true;

    }

    public boolean dequeue() {

        if (isEmpty()) {
            return false;
        }
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // incase we want element to be shown
            // int popEle = data[front];
            // System.out.println("removed ele : " + popEle);

            front = (front + 1) % size;

        }

        return true;
    }

    public boolean isEmpty() {
        return front == -1;

    }

    public boolean isFull() {
        return ((rear + 1) % size) == front;
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }
}
