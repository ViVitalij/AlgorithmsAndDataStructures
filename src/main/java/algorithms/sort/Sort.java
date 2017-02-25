package algorithms.sort;

/**
 * Created by m.losK on 2017-02-22.
 */
public interface Sort {

    enum sortEnum {
        BUBBLE, COUNTING, SELECTION
    }

    int[] ascSort(int[] unsortedArray);

    int[] descSort(int[] unsortedArray);
}