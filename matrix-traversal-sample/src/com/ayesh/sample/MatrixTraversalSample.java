package com.ayesh.sample;

import static com.ayesh.sample.CommonUtils.printArr;

public final class MatrixTraversalSample {
    public static boolean isPathExistV2(int[][] maze) {
        Point currentPoint = new Point(0, 0);
        Point target = new Point(maze.length - 1, maze[0].length - 1);

        Point[] path = new Point[maze.length * maze[0].length];

        int pathIdx = 0;

        int targetYValue = 0;

        for (int xPoint = 0; xPoint < maze.length; xPoint++) {
            for (int yPoint = targetYValue; yPoint < maze[xPoint].length; yPoint++) {
                currentPoint = new Point(xPoint, yPoint);
                int targetValue = maze[xPoint][yPoint];
                if (currentPoint.getxPoint() == target.getxPoint() && currentPoint.getyPoint() == target.getyPoint()) {
                    printArr("Successful path finding", path);
                    return true;
                } else {
                    if (canProceed(maze, xPoint, yPoint)) {
                        path[pathIdx++] = currentPoint;
                    } else if (canProceed(maze, xPoint + 1, yPoint)) {
                        path[pathIdx++] = currentPoint;
                    } else if (canProceed(maze, xPoint, yPoint + 1)) {
                    }
                }
            }
        }

        return true;
    }

    public static boolean isPathExist(int[][] maze) {
        Point currentPoint = new Point(0, 0);
        Point target = new Point(maze.length - 1, maze[0].length - 1);
        Point[] visited = new Point[maze.length * maze[0].length];
        int visitedCounter = 0;
        int targetYValue = 0;
        int targetXPoint = 0;
        while (targetXPoint < maze.length) {
            int [] currentXPath = maze[targetXPoint];
            for (int yPoint = targetYValue; yPoint < currentXPath.length; yPoint++) {
                System.out.println(String.format("X [%d] Y [%d]", targetXPoint, yPoint));
                currentPoint = new Point(targetXPoint, yPoint);
                int nextValueRight = maze[targetXPoint][yPoint];
                if (currentPoint.getxPoint() == target.getxPoint() && currentPoint.getyPoint() == target.getyPoint()) {
                    printArr("Successful path finding", visited);
                    return true;
                } else {
                    if (canProceed(nextValueRight) && !isAvailable(visited, currentPoint)) {
                        targetYValue = yPoint - 1;
                        visited[visitedCounter++] = currentPoint;
                        continue;
                    } else if (targetXPoint != 0 && !isAvailable(visited, new Point(targetXPoint - 1, yPoint)) && canProceed(maze[targetXPoint - 1][yPoint])) {
                        visited[visitedCounter++] = new Point(targetXPoint - 1, yPoint);
                        targetXPoint = targetXPoint - 1;
                        targetYValue = yPoint;
                    } else {
                        targetYValue = yPoint == 0 ? 0: yPoint - 1;
                        break;
                    }
                }
            }
            targetXPoint++;
        }
        printArr("Unsuccessful path finding", visited);
        return false;
    }

    private static boolean canProceed(int[][] maze, int xPoint, int yPoint) {
        return maze[xPoint][yPoint] == 0;
    }

    public static boolean canProceed(int nextVal) {
        return nextVal == 0;
    }

    public static boolean isAvailable(Point[] visited, Point currentPoint) {
        for (int i = 0; i < visited.length;i++) {
            Point current = visited[i];
            if (current != null) {
                if (current.getxPoint() == currentPoint.getxPoint() && current.getyPoint() == currentPoint.getyPoint()) {
                    return true;
                }
            } else {
                break;
            }
        }
        return false;
    }

    public static void main(String... args) {
        int matrix[][] = { { 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 } };
        boolean pathExist = isPathExist(matrix);
        System.out.println(String.format("Path Exists Check from [{0,0}, {3,3}] [%b]", pathExist));
    }
}

