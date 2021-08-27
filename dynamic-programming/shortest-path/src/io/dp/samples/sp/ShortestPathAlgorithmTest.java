package io.dp.samples.sp;

import io.dp.samples.sp.graph.Graphs;
import io.dp.samples.sp.graph.impl.SimpleEdge;
import io.dp.samples.sp.graph.impl.SimpleVertex;
import io.dp.samples.sp.graph.impl.WeightedGraph;

import java.util.Set;

public class ShortestPathAlgorithmTest {
    public static void main(String... args) {
        SimpleVertex vert1 = new SimpleVertex("1");
        SimpleVertex vert2 = new SimpleVertex("2");
        SimpleVertex vert3 = new SimpleVertex("3");
        SimpleVertex vert4 = new SimpleVertex("4");
        SimpleVertex vert5 = new SimpleVertex("5");
        SimpleVertex vert6 = new SimpleVertex("6");
        SimpleVertex vert7 = new SimpleVertex("7");
        Set<SimpleVertex> vertices = Set.of(vert1, vert2, vert3, vert4, vert5, vert6, vert7);

        SimpleEdge edge1 = new SimpleEdge(vert1, vert2, 1);
        SimpleEdge edge2 = new SimpleEdge(vert2, vert3, 2);
        SimpleEdge edge3 = new SimpleEdge(vert3, vert4, 1);
        SimpleEdge edge4 = new SimpleEdge(vert1, vert5, 1);
        SimpleEdge edge5 = new SimpleEdge(vert1, vert6, 3);
        SimpleEdge edge6 = new SimpleEdge(vert6, vert7, 1);
        Set<SimpleEdge> edges = Set.of(edge1, edge2, edge3, edge4, edge5, edge6);

        WeightedGraph<SimpleVertex, SimpleEdge> graph = Graphs.weightedGraph(vertices, edges);
        Graphs.display(graph);
    }
}
