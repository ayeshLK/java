package io.dp.samples.sp.graph;

import java.util.Set;

public interface Graph<T extends Vertex, E extends Edge<T>> {
    Set<E> edges();

    Set<T> vertices();

    void addVertex(T vertex);

    void removeVertex(T vertex);

    void addEdge(E edge);

    void removeEdge(E edge);

    boolean isAdjacent(T srcVertex, T targetVertex);
}
