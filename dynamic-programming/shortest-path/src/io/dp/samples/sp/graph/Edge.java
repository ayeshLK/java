package io.dp.samples.sp.graph;

public interface Edge<T extends Vertex> {
    T src();

    T target();

    long distance();
}
