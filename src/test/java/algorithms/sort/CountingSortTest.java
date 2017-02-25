package algorithms.sort;

import algorithms.sort.impl.CountingSort;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by m.losK on 2017-02-25.
 */
public class CountingSortTest {
    @Test
    public void testAscSort() {
        int[] input = {5, 6, 1, 8, -2, 2, 7, 9, 10, 20, 9};
        Sort sorter = new CountingSort();

        //when
        int[] result = sorter.ascSort(input);
        sorter.ascSort(input);

        //then
        Assert.assertEquals(-2, result[0]);
    }
    @Test
    public void testDescSort() {
        int[] input = {5, 6, 1, 8, -2, 2, 7, 9, 10, 20, 9};
        Sort sorter = new CountingSort();

        //when
        int[] result = sorter.descSort(input);
        sorter.ascSort(input);

        //then
        Assert.assertEquals(20, result[0]);
    }

    /**
     * if implementation of CountingSort not support negatives numbers we can test ArrayIndexOutOfBoundsException using fail() as below
     */

    /*
    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] input = {5, 6, 1, 8, -2, 2, 7, 9, 10, 20, 9};
        Sort sorter = new CountingSort();

        try {
            sorter.ascSort(input);
            fail();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception");
        }
    }
    */
}
