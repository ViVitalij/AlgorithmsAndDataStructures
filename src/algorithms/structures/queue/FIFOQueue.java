package algorithms.structures.queue;

/**
 * Created by m.losK on 2017-02-18.
 */
public class FIFOQueue implements Queue {

    private int value;

    private FIFOQueue next;

    public FIFOQueue() {
    }

    private FIFOQueue(int value) {
        this.value = value;
    }

    @Override
    public void push(int value) {
        FIFOQueue last = getLast();
        last.next = new FIFOQueue(value);
    }

    @Override
    public int pop() {
        if (this.next == null) {
            System.out.println("Queue is empty");
            return 0;
        }
        FIFOQueue first = this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    @Override
    public Queue clone() {
        FIFOQueue clonedQueue = new FIFOQueue();
        FIFOQueue returnQueue = clonedQueue;
        FIFOQueue tmpQueue = this.next;
        while (tmpQueue != null) {
            clonedQueue.next = new FIFOQueue(tmpQueue.value);
            tmpQueue = tmpQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return returnQueue;
    }

    private FIFOQueue getLast() {
        FIFOQueue myFifoQueue = this;
        while (myFifoQueue.next != null) {
            myFifoQueue = myFifoQueue.next;
        }
        return myFifoQueue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        FIFOQueue fifoQueue = this.next;
        while (fifoQueue != null) {
            stringBuilder.append(fifoQueue.value);
            if (fifoQueue.next != null) {
                stringBuilder.append(", ");
            }
            fifoQueue = fifoQueue.next;
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}