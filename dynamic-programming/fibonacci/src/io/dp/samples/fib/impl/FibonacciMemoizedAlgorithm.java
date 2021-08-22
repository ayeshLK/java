package io.dp.samples.fib.impl;

import io.dp.samples.fib.FibonacciAlgorithm;

import java.util.HashMap;
import java.util.Map;

public class FibonacciMemoizedAlgorithm implements FibonacciAlgorithm<Integer> {
    private final int[] mem1 = new int[10];
    private final Map<Integer, Integer> mem = new HashMap<>();

    @Override
    public Integer calculate(int n) {
        if (n < mem1.length) {

        } else {

        }

        if (mem.containsKey(n)) return mem.get(n);
        else {
            Integer calculatedValue = calculateRec(n);
            mem.put(n, calculatedValue);
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
