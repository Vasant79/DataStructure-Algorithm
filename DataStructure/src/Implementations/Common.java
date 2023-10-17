package Implementations;

public class Common {

    public static void main(String args[]) {

        // implementing queue using stack
        // Queue q = new Queue(5);
        // q.enqueue(1);
        // q.enqueue(9);

        // q.enqueue(7);

        // q.dequeue();

        // q.print();

        // implementing stack using queue
        StackUsingQ s = new StackUsingQ(4);
        s.push(3);
        s.push(5);
        s.push(8);
        s.pop();
        s.print();

    }

}
