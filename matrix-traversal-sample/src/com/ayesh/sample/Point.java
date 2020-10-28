package com.ayesh.sample;

public class Point {
    private int xPoint;
    private int yPoint;

    public Point(int xPoint, int yPoint) {
        this.xPoint = xPoint;
        this.yPoint = yPoint;
    }

    public int getxPoint() {
        return xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("xPoint=").append(xPoint);
        sb.append(", yPoint=").append(yPoint);
        sb.append('}');
        return sb.toString();
    }
}
