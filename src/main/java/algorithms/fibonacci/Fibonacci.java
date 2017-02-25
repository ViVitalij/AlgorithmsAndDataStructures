package algorithms.fibonacci;

/**
 * Created by m.losK on 2017-02-22.
 */
public interface Fibonacci {

    enum FibonacciEnum {
        FIBITERATIVE, FIBRECURSIVE
    }

    long getNumber(int number);
}
