package algorithms.sort.impl;


import algorithms.sort.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by m.losK on 2017-02-22.
 */
public class SortTest {
    public static void main(String[] args) {
        Sort bubleSort = new BubbleSort();
        Sort countingSort = new CountingSort();
        Sort selectionSort = new SelectionSort();

        List<Sort> listSort = new ArrayList<>();
        listSort.add(bubleSort);
        listSort.add(countingSort);
        listSort.add(selectionSort);

        int[] listToSort = new int[1000];
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            listToSort[i] = random.nextInt(10000);
        }

        List<int[]> listOfResults = new ArrayList<>();

        for (Sort sorter : listSort) {
            listOfResults.add(sorter.ascSort(listToSort));
        }

        for (int[] result : listOfResults) {
            System.out.println(Arrays.toString(result));
        }
    }
}
