package algorithms.sda.fibonacci.impl;

import algorithms.sda.fibonacci.Fibonacci;

/**
 * Created by m.losK on 2017-02-22.
 */
public class FibonacciIterational implements Fibonacci {
    @Override
    public long getNumber(int number) {
        long currentValue = 0;
        if(number == 1){
            currentValue = 1;
        } else if (number > 1) {
            currentValue = 1;
            long prevValue = 1;
            for (int i = 2; i < number; i++) {
                long tempValue = currentValue;
                currentValue = currentValue + prevValue;
                prevValue = tempValue;
            }
        }
        return currentValue;
    }
}
