package test.algorithms.structures.queue;

import algorithms.structures.queue.LIFOQueue;
import algorithms.structures.queue.Queue;
import algorithms.structures.queue.QueueException;

/**
 * Created by m.losK on 2017-02-20.
 */
public class LIFOQueueTest {
    public static void main(String[] args) {
        LIFOQueue lifoQueue = new LIFOQueue();

        try {
            lifoQueue.pop();
        } catch (QueueException e) {
            e.printStackTrace();
        }
        lifoQueue.push(3);
        lifoQueue.push(4);
        lifoQueue.push(5);
        lifoQueue.push(6);
        lifoQueue.push(-1);
        lifoQueue.push(2);
        lifoQueue.push(3);
//        lifoQueue.push(7);
//        lifoQueue.pop();
        System.out.println(lifoQueue.pop());

        System.out.println(lifoQueue);
        Queue clonedList = lifoQueue.clone();
        clonedList.push(4);
        clonedList.push(3);
        clonedList.push(666);
        System.out.println("Cloned list: " + clonedList);
    }
}
