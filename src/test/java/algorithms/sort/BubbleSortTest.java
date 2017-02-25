package algorithms.sort;

import algorithms.sort.impl.BubbleSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by m.losK on 2017-02-24.
 */
public class BubbleSortTest {
    @Test
    public void testAscSort() {
        //given (arguments)
        int[] input = {5, 6, 1, 8, -1, 2, 7, 9, 10, 20, -1};
        Sort sorter = new BubbleSort();

        //when
        int[] result = sorter.ascSort(input);

        //then
        Assert.assertEquals(-1, result[0]);
    }

    @Test
    public void testDescSort() {
        //given (arguments)
        int[] input = {5, 6, 1, 8, -1, 2, 7, 9, 10, 20, -1};
        Sort sorter = new BubbleSort();

        //when
        int[] result = sorter.descSort(input);

        //then
        Assert.assertEquals(20, result[0]);
    }
}