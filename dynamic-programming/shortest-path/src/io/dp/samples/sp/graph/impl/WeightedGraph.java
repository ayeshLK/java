package io.dp.samples.sp.graph.impl;

import io.dp.samples.sp.graph.Edge;
import io.dp.samples.sp.graph.Graph;
import io.dp.samples.sp.graph.Vertex;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WeightedGraph<T extends Vertex, E extends Edge<T>> implements Graph<T, E> {
    private final Set<E> edges;
    private final Set<T> vertices;

    public WeightedGraph(Set<E> edges, Set<T> vertices) {
        this.edges = new HashSet<>(edges);
        this.vertices = new HashSet<>(vertices);
    }

    @Override
    public Set<E> edges() {
        return Collections.unmodifiableSet(edges);
    }

    @Override
    public Set<T> vertices() {
        return Collections.unmodifiableSet(vertices);
    }

    @Override
    public void addVertex(T vertex) {
        this.vertices.add(vertex);
    }

    @Override
    public void removeVertex(T vertex) {
        this.vertices.remove(vertex);
    }

    @Override
    public void addEdge(E edge) {
        if (!this.vertices.contains(edge.src())) {
            addVertex(edge.src());
        }

        if (!this.vertices.contains(edge.target())) {
            addVertex(edge.target());
        }

        this.edges.add(edge);
    }

    @Override
    public void removeEdge(E edge) {
        this.edges.remove(edge);
    }

    @Override
    public boolean isAdjacent(T srcVertex, T targetVertex) {
        return this.edges.stream().anyMatch(e -> e.src().equals(srcVertex) && e.target().equals(targetVertex));
    }
}
