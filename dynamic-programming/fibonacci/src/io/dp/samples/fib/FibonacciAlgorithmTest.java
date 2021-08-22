package io.dp.samples.fib;

import io.dp.samples.fib.impl.FibonacciMemoizedAlgorithm;
import io.dp.samples.fib.impl.FibonacciMemoizedBottomUpAlgorithm;
import io.dp.samples.fib.impl.FibonacciRecAlgorithm;

public class FibonacciAlgorithmTest {
    public static void main(String... args) {
        int fibCount = 25;

        // test recursive algorithm
        FibonacciAlgorithm<Integer> recAlgo = new FibonacciRecAlgorithm();
        testPerf(recAlgo, fibCount);

        // test memoized algorithm
        FibonacciAlgorithm<Integer> memAlgo = new FibonacciMemoizedAlgorithm();
        testPerf(memAlgo, fibCount);

        // test memoized bottom up algorithm
        FibonacciAlgorithm<Integer> memBottomUpAlgo = new FibonacciMemoizedBottomUpAlgorithm();
        testPerf(memBottomUpAlgo, fibCount);
    }

    private static <T extends FibonacciAlgorithm<Integer>> void testPerf(T algorithm, int fibCount) {
        long startTime = System.nanoTime();
        Integer calculatedValue = algorithm.calculate(fibCount);
        long endTime = System.nanoTime();
        System.out.printf("[%s] %dth Fibonacci value is %d, time-taken [%d] nanos'%n",
                algorithm.getName(), fibCount, calculatedValue, (endTime - startTime));
    }
}
