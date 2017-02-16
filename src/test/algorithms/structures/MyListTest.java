package test.algorithms.structures;

import algorithms.structures.MyList;
import algorithms.structures.MyListInterface;

/**
 * Created by m.losK on 2017-02-14.
 */
public class MyListTest {
    public static void main(String[] args) {
        MyListInterface myList = initMyList();
        MyListInterface clonedList = myList.clone();
        myList.add(4);
        clonedList.delete(3);
//        System.out.println(myList.toString());
//        System.out.println(clonedList.toString());
        clonedList.add(1, 5);
//        System.out.println(clonedList.toString());
        clonedList.set(3, 3);
//        System.out.println(clonedList.toString());
        System.out.println(myList.toString());
        System.out.println(clonedList.toString());
//        clonedList.addAll(myList);
        clonedList.addAll(3, myList);
        System.out.println(clonedList.toString());
    }

    private static MyList initMyList() {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(2);
        myList.add(1);
        myList.add(3);
        myList.add(1);
        myList.add(6);
        myList.add(-1);
        myList.add(1);
        myList.add(5);
        myList.add(5);
        myList.add(5);
        myList.add(7);
        return myList;
    }
}
