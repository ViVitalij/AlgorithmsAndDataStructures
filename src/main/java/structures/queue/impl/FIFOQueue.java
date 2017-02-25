package structures.queue.impl;

/**
 * Created by m.losK on 2017-02-18.
 */
public class FIFOQueue extends AbstractQueue {

    public FIFOQueue() {
    }

    protected FIFOQueue(int value) {
        super(value);
    }

    @Override
    protected AbstractQueue getInstance() {
        return new FIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new FIFOQueue(value);
    }

    @Override
    public void push(int value) {
        FIFOQueue last = (FIFOQueue) getLast();
        last.next = new FIFOQueue(value);
    }
}