package algorithms.fibonacci.impl;

import algorithms.fibonacci.Fibonacci;

/**
 * Created by m.losK on 2017-02-22.
 */
public class FibonacciRecursive implements Fibonacci {
    @Override
    public long getNumber(int number) {
        long result = 0;
        if (number == 0) {
            result = number;
        } else if (number == 1) {
            result = 1;
        } else {
            result = getNumber(number - 2) + getNumber(number - 1);
        }
        return result;
    }
}
