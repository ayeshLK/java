package io.dp.samples.fib;

import java.util.Arrays;

public interface FibonacciAlgorithm<T> {
    int START_COUNT = 10;

    T calculate(int n);

    String getName();

    default T[] copyArray(T[] src, int newLength) {
        T[] intermediateArr = Arrays.copyOf(src, newLength);
        for (int i = 0; i < src.length; i++) {
            if (src[i] != null) {
                intermediateArr[i] = src[i];
            }
        }
        return intermediateArr;
    }
}
