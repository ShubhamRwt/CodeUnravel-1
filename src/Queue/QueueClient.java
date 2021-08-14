package Queue;

import java.util.Arrays;

public class QueueClient {

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.insert(1);
        queue.insert(2);// <-- Front
        queue.insert(3);

        //rear --> 3

        System.out.println(queue.delete());

        queue.insert(10);
        System.out.println(queue.delete());
        System.out.println(queue.delete());

        System.out.println(queue.delete());
        System.out.println(Arrays.toString(queue.data));

        queue.insert(11);
        queue.insert(12);
        queue.insert(13);

        System.out.println(Arrays.toString(queue.data));
    }

}
