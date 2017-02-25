package algorithms.fibonacci.factory;

import algorithms.fibonacci.Fibonacci;
import algorithms.fibonacci.impl.FibonacciIterative;
import algorithms.fibonacci.impl.FibonacciRecursive;

/**
 * Created by m.losK on 2017-02-24.
 */
public class FibonacciFactory {
    public static Fibonacci produce(Fibonacci.FibonacciEnum type) {
        if (Fibonacci.FibonacciEnum.FIBITERATIVE.equals(type)) {
            return new FibonacciIterative();
        }
        if (Fibonacci.FibonacciEnum.FIBRECURSIVE.equals(type)) {
            return new FibonacciRecursive();
        }
        return null;
    }
}
