package io.dp.samples.fib.impl;

import io.dp.samples.fib.FibonacciAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedBottomUpAlgorithm implements FibonacciAlgorithm<Integer> {
    private final Map<Integer, Integer> mem = new HashMap<>();

    @Override
    public Integer calculate(int n) {
        for (int k = 1; k <= n; k++) {
            Integer calculatedValue = calculateRec(k);
            mem.put(k, calculatedValue);
        }
        return mem.get(n);
    }

    private Integer calculateRec(int n) {
        if (n <= 2) return 1;
        else {
            return mem.get(n - 1) + mem.get(n - 2);
        }
    }

    @Override
    public String getName() {
        return "FibonacciMemoizedBottomUpAlgorithm";
    }
}
