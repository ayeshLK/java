package io.dp.samples.sp.graph.impl;

import io.dp.samples.sp.graph.Edge;

import java.util.Objects;

public class SimpleEdge implements Edge<SimpleVertex> {
    private final SimpleVertex src;
    private final SimpleVertex target;
    private final int distance;

    public SimpleEdge(SimpleVertex src, SimpleVertex target, int distance) {
        this.src = src;
        this.target = target;
        this.distance = distance;
    }

    @Override
    public SimpleVertex src() {
        return src;
    }

    @Override
    public SimpleVertex target() {
        return target;
    }

    @Override
    public long distance() {
        return distance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(src, target, distance);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SimpleEdge)) {
            return false;
        }

        SimpleEdge edge = (SimpleEdge) obj;
        return src.equals(edge.src())
                && target.equals(edge.target())
                && distance == edge.distance();
    }
}
