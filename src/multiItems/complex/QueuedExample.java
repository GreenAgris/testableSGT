package multiItems.complex;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueuedExample {


    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedBlockingQueue<>();

        myQueue.add(4);
        myQueue.add(2);
        myQueue.add(-1);
        myQueue.add(8);

        System.out.println(myQueue.remove());

    }
}
