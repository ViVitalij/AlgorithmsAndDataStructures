package structures.queue.impl;

/**
 * Created by m.losK on 2017-02-19.
 */
public class LIFOQueue extends AbstractQueue {

    public LIFOQueue() {
    }

    protected LIFOQueue(int value) {
        super(value);
    }

    @Override
    protected AbstractQueue getInstance() {
        return new LIFOQueue();
    }

    @Override
    protected AbstractQueue getInstance(int value) {
        return new LIFOQueue(value);
    }

    @Override
    public void push(int value) {
        LIFOQueue insertedElement = new LIFOQueue(value);
        AbstractQueue nextValue = this.next;
        this.next = insertedElement;
        insertedElement.next = nextValue;
    }
}
