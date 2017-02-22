package algorithms.sda.fibonacci.impl;

import algorithms.sda.fibonacci.Fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by m.losK on 2017-02-22.
 */
public class FibonacciTest {
    public static void main(String[] args) {
        Fibonacci fibonacciRecursive = new FibonacciRecursive();
        Fibonacci fibonacciIterational = new FibonacciIterational();

        List<Fibonacci> fibonacciList = new ArrayList<>();
        fibonacciList.add(fibonacciRecursive);
        fibonacciList.add(fibonacciIterational);

        for (Fibonacci fib : fibonacciList) {
            System.out.println(fib.getNumber(5));
        }
    }
}
