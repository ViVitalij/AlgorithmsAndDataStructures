package test.algorithms.structures;

import algorithms.structures.MyLinkedList;
import algorithms.structures.MyListInterface;

/**
 * Created by m.losK on 2017-02-16.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyListInterface myListInterface = new MyLinkedList();
        myListInterface.get(0);
        myListInterface.add(5);
        System.out.println(myListInterface.get(0));
    }
}
