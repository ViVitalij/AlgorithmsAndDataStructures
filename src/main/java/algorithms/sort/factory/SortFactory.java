package algorithms.sort.factory;

import algorithms.sort.Sort;
import algorithms.sort.impl.BubbleSort;
import algorithms.sort.impl.CountingSort;
import algorithms.sort.impl.SelectionSort;

/**
 * Created by m.losK on 2017-02-24.
 */
public class SortFactory {
    public static Sort produce(Sort.sortEnum type) {
        if (Sort.sortEnum.BUBBLE.equals(type)) {
            return new BubbleSort();
        }
        if (Sort.sortEnum.COUNTING.equals(type)) {
            return new CountingSort();
        }
        if (Sort.sortEnum.SELECTION.equals(type)) {
            return new SelectionSort();
        }
        return null;
    }
}
