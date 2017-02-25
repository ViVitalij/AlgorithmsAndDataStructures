package algorithms.sort.main;


import algorithms.sort.Sort;
import algorithms.sort.factory.SortFactory;     //when using factory
import algorithms.sort.impl.BubbleSort;         //used before enum and factory
import algorithms.sort.impl.CountingSort;       //used before enum and factory
import algorithms.sort.impl.SelectionSort;      //used before enum and factory

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by m.losK on 2017-02-22.
 */
public class SortMain {
    public static void main(String[] args) {

        /**
         * before enum and factory
         */

        /*
        Sort bubbleSort = new BubbleSort();
        Sort countingSort = new CountingSort();
        Sort selectionSort = new SelectionSort();

        List<Sort> sortList = new ArrayList<>();
        sortList.add(bubbleSort);
        sortList.add(countingSort);
        sortList.add(selectionSort);

        //filling the array (arrayToSort) with random numbers from 0 to 9999
        int[] arrayToSort = new int[1000];
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            arrayToSort[i] = random.nextInt(10000);
        }

        List<int[]> listOfResults = new ArrayList<>();

        //on each element (here objects called 'sorter's) of the type Sort from the sortList,
        //call the method ascSort on arrayToSort and result add to the listOfResults
        for (Sort sorter : sortList) {
            listOfResults.add(sorter.ascSort(arrayToSort));
        }

        //print every result from the listOfResults
        for (int[] result : listOfResults) {
            System.out.println(Arrays.toString(result));
        }
        */


        /**
         * using enum and factory
         */

        Sort bubbleSort = SortFactory.produce(Sort.sortEnum.BUBBLE);
        Sort countingSort = SortFactory.produce(Sort.sortEnum.COUNTING);
        Sort selectionSort = SortFactory.produce(Sort.sortEnum.SELECTION);

        List<Sort> sortList = new ArrayList<>();
        sortList.add(bubbleSort);
        sortList.add(countingSort);
        sortList.add(selectionSort);

        //filling the array (arrayToSort) with random numbers from 0 to 999
        int[] arrayToSort = new int[100];
        for (int i = 0; i < 100; i++) {
            Random random = new Random();
            arrayToSort[i] = random.nextInt(1000);
        }

        List<int[]> listOfResults = new ArrayList<>();

        //on each element (here objects called 'sorter's) of the type Sort from the sortList,
        //call the method ascSort on arrayToSort and result add to the listOfResults
        for (Sort sorter : sortList) {
            listOfResults.add(sorter.ascSort(arrayToSort));
        }

        //print every result from the listOfResults
        for (int[] result : listOfResults) {
            System.out.println(Arrays.toString(result));
        }
    }
}
