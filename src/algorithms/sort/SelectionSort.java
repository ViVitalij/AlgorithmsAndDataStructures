package algorithms.sort;

import java.util.Arrays;

/**
 * Created by m.losK on 2017-02-14.
 */
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] unsortedArray = {-2, -4, 1, 6, -1, 8, -2, -1};
        System.out.println(Arrays.toString(selectionSort.ascSortUpgrade(unsortedArray)));
    }

    public int[] descSort(int[] unsortedArray) {
        int tmp = 0;
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = 0; j < unsortedArray.length - 1 - i; j++) {
                if (unsortedArray[j] < unsortedArray[j + 1]) {
                    SortUtils.swap(unsortedArray, j, j + 1);
                }
            }
        }
        return unsortedArray;
    }

    public static int[] ascSort(int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int index = 0;
            for (int j = 1; j < unsortedArray.length - i; j++) {
                if (unsortedArray[index] < unsortedArray[j])
                    index = j;
            }
            SortUtils.swap(unsortedArray, index, unsortedArray.length - i - 1);
        }
        return unsortedArray;
    }

    public static int[] ascSortUpgrade(int[] unsortedArray) {

        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                int tmp = unsortedArray[i];
                unsortedArray[i] = unsortedArray[minIndex];
                unsortedArray[minIndex] = tmp;
            }
        }
        return unsortedArray;
    }
}

