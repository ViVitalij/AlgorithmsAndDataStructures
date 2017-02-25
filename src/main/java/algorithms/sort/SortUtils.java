package algorithms.sort;

/**
 * Created by m.losK on 2017-02-14.
 */
public class SortUtils {
    public static void swap(int[] unsortedArray, int index, int previousIndex) {
        int tmp = unsortedArray[index];
        unsortedArray[index] = unsortedArray[previousIndex];
        unsortedArray[previousIndex] = tmp;
    }
}