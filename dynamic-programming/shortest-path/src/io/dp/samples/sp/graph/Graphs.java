package io.dp.samples.sp.graph;

import io.dp.samples.sp.graph.impl.WeightedGraph;

import java.util.Set;

import static java.util.stream.Collectors.groupingBy;

public final class Graphs {
    public static <T extends Vertex, E extends Edge<T>> WeightedGraph<T, E> weightedGraph(Set<T> vertices, Set<E> edges) {
        return new WeightedGraph<>(edges, vertices);
    }

    public static <T extends Vertex, E extends Edge<T>> void display(Graph<T, E> graph) {
        graph.edges().stream()
                .collect(groupingBy(Edge::src))
                .forEach((vertex, edges) -> {
                    String vertexDescription = edges.stream()
                            .map(edge -> String.format("-(%d)-> %s", edge.distance(), edge.target().name()))
                            .reduce(String.format("[%s]", vertex.name()), (a, b) -> String.format("%s | %s", a, b));
                    System.out.println(vertexDescription);
                });
    }
}
