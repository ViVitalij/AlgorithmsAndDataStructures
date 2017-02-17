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
        if (checkIndex(index)) {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList myLinkedList = getElement(index);
            MyLinkedList addedElement = new MyLinkedList();
            addedElement.value = value;
            previousElement.next = addedElement;
            addedElement.next = myLinkedList;
        } else {
            System.out.println("Wrong index!");
        }
    }

    @Override
    public int get(int index) {
        MyLinkedList myLinkedList = getElement(index);
        if (!checkIndex(index)) {
            System.out.println("Wrong index!");
            return 0;
        }
        return myLinkedList.value;
    }

    private boolean checkIndex(int index) {
        MyLinkedList myLinkedList = getElement(index);
        return myLinkedList != null && index >= 0;
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
        if (checkIndex(index)) {
            MyLinkedList myLinkedList = getElement(index);
            myLinkedList.value = value;
        } else {
            System.out.println("Wrong index!");
        }
    }

    @Override
    public void addAll(MyListInterface myList) {
        for (int i = 0; i < myList.getSize(); i++) {
            this.add(myList.get(i));
        }
    }

    @Override
    public void addAll(int index, MyListInterface myList) {
        if (checkIndex(index)) {
            for (int i = 0; i < myList.getSize(); i++) {
                add(index + i, myList.get(i));
            }
        } else {
            System.out.println("Wrong index!");
        }
    }

    @Override
    public void delete(int index) {
        if (checkIndex(index)) {
            MyLinkedList previousElement = getElement(index - 1);
            MyLinkedList removableElement = getElement(index);
            previousElement.next = removableElement.next;
            removableElement.next = null;
        } else {
            System.out.println("Wrong index!");
        }
    }


    @Override
    public MyListInterface clone() {
        MyLinkedList myLinkedList = this;
        MyLinkedList tmpLinkedList = new MyLinkedList();
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            tmpLinkedList.add(myLinkedList.get(i));
        }
        return tmpLinkedList;
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
