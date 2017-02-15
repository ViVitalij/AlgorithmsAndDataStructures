package algorithms.sort;
import static algorithms.sort.SortUtils.swap;

/**
 * Created by m.losK on 2017-02-14.
 */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] unsortedArray = {-2, -4, 1, 6, -1};
        int[] sortedArray = bubbleSort.ascSort(unsortedArray);
        printArray(sortedArray);
        sortedArray = bubbleSort.descSort(unsortedArray);
        printArray(sortedArray);
    }

    public static int[] ascSort(int[] unsortedArray) {
        boolean flag;
        for (int t = 0; t < unsortedArray.length - 1; t++) {
            flag = true;
            for (int i = 1; i < unsortedArray.length - t; i++) {
                if (unsortedArray[i] < unsortedArray[i - 1]) {
                    swap(unsortedArray, i, i - 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return unsortedArray;
    }

    public static int[] descSort(int[] unsortedArray) {
        boolean flag;
        for (int t = 0; t < unsortedArray.length - 1; t++) {
            flag = true;
            for (int i = 1; i < unsortedArray.length - t; i++) {
                if (unsortedArray[i] > unsortedArray[i - 1]) {
                    swap(unsortedArray, i, i - 1);
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return unsortedArray;
    }

    public static void printArray(int[] array) {
        for (int e : array) {
            System.out.println(e);
        }
    }
}
