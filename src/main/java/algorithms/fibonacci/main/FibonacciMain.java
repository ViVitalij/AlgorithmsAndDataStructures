package algorithms.fibonacci.main;

import algorithms.fibonacci.Fibonacci;
import algorithms.fibonacci.factory.FibonacciFactory;

/**
 * Created by m.losK on 2017-02-24.
 */
public class FibonacciMain {
    public static void main(String[] args) {

        /**
         * test without using JUnit (with JUnit @see algorithms.fibonacci.FibonacciTest in test sources root - src.test.java)
         */

        Fibonacci fibonacciIterative = FibonacciFactory.produce(Fibonacci.FibonacciEnum.FIBITERATIVE);
        System.out.println(fibonacciIterative.getNumber(3));
        Fibonacci fibonacciRecursive = FibonacciFactory.produce(Fibonacci.FibonacciEnum.FIBRECURSIVE);
        System.out.println(fibonacciRecursive.getNumber(5));
    }
}
