package test.algorithms.structures;

import algorithms.structures.MyLinkedList;
import algorithms.structures.MyList;
import algorithms.structures.MyListInterface;

/**
 * Created by m.losK on 2017-02-16.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyListInterface firstList = initMyFirstList();
        System.out.println("Before: " + firstList);
//        firstList.add(3);
//        firstList.add(7, 666);
//        System.out.println(firstList.get(8));
//        firstList.delete(8);
//        firstList.set(-1,666);
//        System.out.println(firstList.getSize());
//
//        System.out.println("After:  " + firstList);

        System.out.println();

        MyListInterface secondList = initMySecondList();
        System.out.println("Before: " + secondList);
//        secondList.addAll(firstList);
//        secondList.addAll(7,firstList);
//        System.out.println("After: " + secondList);
//
        System.out.println();
//
        MyListInterface thirdList = firstList.clone();
        System.out.println("After clone: " + thirdList);
        firstList.add(555);
        thirdList.add(444);

        System.out.println();

        System.out.println("FirstList after add: " + firstList);
        System.out.println("ThirdList after add: " + thirdList);

    }

    private static MyListInterface initMyFirstList() {
        MyListInterface firstList = new MyLinkedList();
        firstList.add(11);
        firstList.add(12);
        firstList.add(13);
        firstList.add(14);
        firstList.add(15);
        firstList.add(16);
        firstList.add(17);
        firstList.add(18);
        return firstList;
    }

    private static MyListInterface initMySecondList() {
        MyListInterface secondList = new MyLinkedList();
        secondList.add(2);
        secondList.add(3);
        secondList.add(4);
        secondList.add(5);
        secondList.add(6);
        secondList.add(7);
        secondList.add(8);
        return secondList;
    }
}
