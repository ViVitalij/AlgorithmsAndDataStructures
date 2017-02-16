package algorithms.structures;

/**
 * Created by m.losK on 2017-02-16.
 */
public class MyLinkedList implements MyListInterface {
    private int value;
    private MyLinkedList next;

    @Override
    public void add(int value) {
        MyLinkedList myLinkedList = getLast();
        MyLinkedList tmpMyLinkedList = new MyLinkedList();
        tmpMyLinkedList.value = value;
        myLinkedList.next = tmpMyLinkedList;
    }

    private MyLinkedList getLast() {
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void add(int index, int value) {

    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = getElement(index);
        if (myLinkedList == null) {
            System.out.println("Wrong index");
            return 0;
        }
        return myLinkedList.value;
    }

    private MyLinkedList getElement(int index) {
        MyLinkedList myLinkedList = this;
        for (int i = 0; i <= index; i++) {
            if (myLinkedList.next == null) {
                return null;
            }
            myLinkedList = myLinkedList.next;
        }
        return myLinkedList;
    }

    @Override
    public void set(int index, int value) {

    }

    @Override
    public void addAll(MyListInterface myList) {

    }

    @Override
    public void addAll(int index, MyListInterface myList) {

    }

    @Override
    public void delete(int index) {
        if (index < getSize()) {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList removableElement = getElement(index);
            previousElement.next = removableElement.next;
            removableElement.next = null;
        }


    }


    @Override
    public MyListInterface clone() {
        return null;
    }

    @Override
    public int getSize() {
        int counter = 0;
        MyLinkedList myLinkedList = this;
        while (myLinkedList.next != null) {
            counter++;
            myLinkedList = myLinkedList.next;
        }
        return counter;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.getSize(); i++) {
            stringBuilder.append(get(i));
            if (i != getSize() - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
