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
        if (index > +0 && index < size) return array[0];
        else System.out.println("Wrong index");
        return 0;
    }

    public void add(int value) {
        if (size >= array.length) {
            doubleCappacity();
        }
        array[size] = value;
        size++;
    }

    public MyList clone(){
        MyList myList = new MyList();
        myList.array = rewriteArray(new int[this.array.length]);
        myList.size = this.size;
        return myList;
    }

    private void doubleCappacity() {
        int[] tmpArray = new int[size * 2];
        this.array = rewriteArray(tmpArray);
    }

    private int[] rewriteArray(int[] tmpArray) {
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = this.array[i];
        }
        return tmpArray;
    }
}
