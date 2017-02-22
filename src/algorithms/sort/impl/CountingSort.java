package algorithms.sort.impl;

import algorithms.sort.Sort;

import java.util.Arrays;

/**
 * Created by m.losK on 2017-02-14.
 */
public class CountingSort implements Sort {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] unsorted = {-2, -4, 1, 6, -1, 8, -2, -1, -3, 2, 9, 8, -1};
        System.out.println("Before: " + Arrays.toString(unsorted));

        int[] ascSorted = countingSort.ascSort(unsorted);
        System.out.println("After ascending sort: " + Arrays.toString(ascSorted));

        int[] descSorted = countingSort.descSort(unsorted);
        System.out.println("After descending sort: " + Arrays.toString(descSorted));
    }

    @Override
    public int[] ascSort(int[] unsortedArray) {

        int[] sortedArray = new int[unsortedArray.length];

        int min = unsortedArray[0];
        int max = unsortedArray[0];
        for (int i = 1; i < unsortedArray.length; i++) {
            if (unsortedArray[i] < min) {
                min = unsortedArray[i];
            } else if (unsortedArray[i] > max) {
                max = unsortedArray[i];
            }
        }

        int[] occurence = new int[max - min + 1];

        // init the frequencies of appearance
        for (int i = 0; i < unsortedArray.length; i++) {
            occurence[unsortedArray[i] - min]++;
        }

        // recalculate the unsortedArray - create the unsortedArray of occurences
        occurence[0]--;
        for (int i = 1; i < occurence.length; i++) {
            occurence[i] = occurence[i] + occurence[i - 1];
        }

        for (int i = unsortedArray.length - 1; i >= 0; i--) {
            sortedArray[occurence[unsortedArray[i] - min]--] = unsortedArray[i];
        }

        return sortedArray;
    }

    @Override
    public int[] descSort(int[] unsortedArray) {
        int[] tempArray = ascSort(unsortedArray);
        int[] resultArray = new int[tempArray.length];
        for (int i = 0; i < tempArray.length; i++) {
            resultArray[i] = tempArray[tempArray.length - 1 - i];
        }
        return resultArray;
    }
}
