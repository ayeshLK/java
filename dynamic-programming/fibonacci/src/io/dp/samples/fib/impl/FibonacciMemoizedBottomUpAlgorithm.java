package io.dp.samples.fib.impl;

import io.dp.samples.fib.FibonacciAlgorithm;

public class FibonacciMemoizedBottomUpAlgorithm implements FibonacciAlgorithm<Integer> {
    private Integer[] mem = new Integer[START_COUNT];

    @Override
    public Integer calculate(int n) {
        if (n >= mem.length) {
            int newLength = mem.length * ((n / mem.length) + 1);
            mem = copyArray(mem, newLength);
        }

        for (int k = 1; k <= n; k++) {
            Integer calculatedValue = calculateRec(k);
            mem[k] = calculatedValue;
        }
        return mem[n];
    }

    private Integer calculateRec(int n) {
        if (n <= 2) return 1;
        else {
            return mem[n - 1] + mem[n - 2];
        }
    }

    @Override
    public String getName() {
        return "FibonacciMemoizedBottomUpAlgorithm";
    }
}
