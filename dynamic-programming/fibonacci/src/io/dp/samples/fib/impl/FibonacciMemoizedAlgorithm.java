package io.dp.samples.fib.impl;

import io.dp.samples.fib.FibonacciAlgorithm;

public class FibonacciMemoizedAlgorithm implements FibonacciAlgorithm<Integer> {
    private Integer[] mem = new Integer[START_COUNT];

    @Override
    public Integer calculate(int n) {
        if (n >= mem.length) {
            int newLength = mem.length * ((n / mem.length) + 1);
            mem = copyArray(mem, newLength);
        }

        if (mem[n] != null) return mem[n];
        else {
            Integer calculatedValue = calculateRec(n);
            mem[n] = calculatedValue;
            return calculatedValue;
        }
    }

    private Integer calculateRec(int n) {
        if (n <= 2) return 1;
        else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }

    @Override
    public String getName() {
        return "FibonacciMemoizedAlgorithm";
    }
}
