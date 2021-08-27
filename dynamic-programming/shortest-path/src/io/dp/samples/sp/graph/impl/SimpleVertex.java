package io.dp.samples.sp.graph.impl;

import io.dp.samples.sp.graph.Vertex;

import java.util.Objects;

public class SimpleVertex implements Vertex {
    private final String name;

    public SimpleVertex(String name) {
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SimpleVertex)) {
            return false;
        }

        SimpleVertex vertex = (SimpleVertex) obj;
        return this.name.equals(vertex.name());
    }
}
