package test.algorithms.structures.queue;

import algorithms.structures.queue.FIFOQueue;
import algorithms.structures.queue.Queue;

/**
 * Created by m.losK on 2017-02-18.
 */
public class FIFOQueueTest {
    public static void main(String[] args) {
        FIFOQueue fifoQueue = new FIFOQueue();
        fifoQueue.push(3);
        fifoQueue.push(5);
        fifoQueue.push(7);
        fifoQueue.push(9);
//        fifoQueue.pop();
//        fifoQueue.pop();
//        fifoQueue.pop();
//        fifoQueue.pop();
//        fifoQueue.pop();
        System.out.println(fifoQueue);
        Queue clonedList = fifoQueue.clone();
        clonedList.push(88);
        System.out.println("Cloned list: " + clonedList);
    }
}
