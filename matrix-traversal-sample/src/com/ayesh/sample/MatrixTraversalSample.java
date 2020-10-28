package com.ayesh.sample;

public final class MatrixTraversalSample {
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

    public static void printArr(String message, Point[] visited) {
        System.out.println(String.format("--- printing array [%s] ---", message));
        for (int i = 0; i < visited.length;i++) {
            Point current = visited[i];
            if (current != null) {
                System.out.println(current);
            } else {
                break;
            }
        }
        System.out.println(String.format("--- finished printing array [%s] ---", message));
    }
}

