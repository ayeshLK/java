package io.dp.samples.fib.impl;

import io.dp.samples.fib.FibonacciAlgorithm;

public class FibonacciRecAlgorithm implements FibonacciAlgorithm<Integer> {
    @Override
    public Integer calculate(int n) {
        if (n <= 2) return 1;
        else {
            return calculate(n - 1) + calculate(n - 2);
        }
    }

    @Override
    public String getName() {
        return "FibonacciRecAlgorithm";
    }
}
