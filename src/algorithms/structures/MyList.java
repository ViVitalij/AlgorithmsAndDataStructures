package algorithms.structures;


/**
 * Created by m.losK on 2017-02-15.
 */
public class MyList {
    private final int INITIAL_SIZE = 10;
    private int[] array;
    private int size;

    public MyList() {
        this.array = new int[INITIAL_SIZE];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public int get(int index) {
        if (checkIndex(index)) return array[0];
        else System.out.println("Wrong index");
        return 0;
    }

    private boolean checkIndex(int index) {
        return index > +0 && index < size;
    }

    public void add(int value) {
        if (this.size >= this.array.length) {
            doubleCappacity();
        }
        this.array[this.size] = value;
        this.size++;
    }

    public MyList clone() {
        MyList myList = new MyList();
        myList.array = rewriteArray(new int[this.array.length]);
        myList.size = this.size;
        return myList;
    }

    private void doubleCappacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewriteArray(tmpArray);
    }

    public void delete(int index) {
        if (checkIndex(index)) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    private int[] rewriteArray(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }

    private void swap(int index, int previousIndex) {
        int tmp = this.array[index];
        this.array[index] = this.array[previousIndex];
        this.array[previousIndex] = tmp;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < this.size; i++) {
            stringBuilder.append(array[i]);
            if (i != size - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void set(int index, int value) {
        if (checkIndex(index)) {
            this.array[index] = value;
        }
    }

    public void add(int index, int value) {
        if (checkIndex(index)) {
            if (this.size >= this.array.length) {
                doubleCappacity();
            }
            for (int i = size; i > index; i--) {
                this.array[i] = this.array[i - 1];
            }
            this.size++;
            this.array[index] = value;
        }
    }

    public void addAll(MyList myList){
        for (int i = 0; i < myList.size; i++) {
            if (this.size >= this.array.length) {
                doubleCappacity();
            }
            this.array[this.size] = myList.array[i];
            this.size++;
        }
    }

    //needs improvement
    public void addAll(MyList myList, int index){
        if (checkIndex(index)) {
            for (int i = 0; i < myList.size; i++) {
                if (this.size >= this.array.length) {
                    doubleCappacity();
                }
                this.array[index+i+myList.size]=this.array[index+i];
                this.array[index+i] = myList.array[i];
                this.size++;
            }
        }
    }
}
