package algorithms.structures.queue;

/**
 * Created by m.losK on 2017-02-19.
 */
public abstract class AbstractQueue implements Queue {

    protected int value;
    protected AbstractQueue next;

    public AbstractQueue() {
    }

    public AbstractQueue(int value) {
        this.value = value;
    }

    @Override
    public int pop() {
        if (this.next == null) {
            System.out.println("Queue is empty");
            return 0;
        }
        AbstractQueue first = this.next;
        this.next = first.next;
        first.next = null;
        return first.value;
    }

    @Override
    public Queue clone() {
        AbstractQueue clonedQueue = new FIFOQueue();
        AbstractQueue returnQueue = clonedQueue;
        AbstractQueue tmpQueue = this.next;
        while (tmpQueue != null) {
            clonedQueue.next = new FIFOQueue(tmpQueue.value);
            tmpQueue = tmpQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return returnQueue;
    }

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
