package algorithms.structures.queue;

/**
 * Created by m.losK on 2017-02-19.
 */
public class LIFOQueue extends AbstractQueue {

    public LIFOQueue() {
    }

    protected LIFOQueue(int value) {
        super.value = value;
    }

    @Override
    public void push(int value) {
        LIFOQueue insertedElement = new LIFOQueue(value);
        this.next = insertedElement;
        insertedElement.next = new LIFOQueue(value);
    }
}
