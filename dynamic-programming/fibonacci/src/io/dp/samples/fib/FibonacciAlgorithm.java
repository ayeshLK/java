package io.dp.samples.fib;

public interface FibonacciAlgorithm<T> {
    T calculate(int n);

    String getName();
}
