package algorithms.structures.queue;

/**
 * Created by m.losK on 2017-02-19.
 */
public abstract class AbstractQueue implements Queue {

    protected int value;
    protected AbstractQueue next;

    public AbstractQueue() {
    }

    protected AbstractQueue(int value) {
        this.value = value;
    }

    @Override
    public int pop() throws QueueException {
        if (this.next == null) {
            throw new QueueException("Queue is empty!");
        }
        AbstractQueue first = this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    @Override
    public Queue clone() {
        AbstractQueue clonedQueue = getInstance();
        AbstractQueue returnQueue = clonedQueue;
        AbstractQueue thisQueue = this.next;
        while (thisQueue != null) {
            clonedQueue.next = getInstance(thisQueue.value);
            thisQueue = thisQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return returnQueue;
    }

    protected abstract AbstractQueue getInstance();

    protected abstract AbstractQueue getInstance(int value);

    protected AbstractQueue getLast() {
        AbstractQueue myAbstractQueue = this;
        while (myAbstractQueue.next != null) {
            myAbstractQueue = myAbstractQueue.next;
        }
        return myAbstractQueue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");

        AbstractQueue abstractQueue = this.next;
        while (abstractQueue != null) {
            stringBuilder.append(abstractQueue.value);
            if (abstractQueue.next != null) {
                stringBuilder.append(", ");
            }
            abstractQueue = abstractQueue.next;
        }

        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
