package com.ayesh.sample;

public final class MatrixTraversalSampleImperative {
    public static boolean isPathExistV2(int[][] maze) {
        Point target = new Point(maze.length - 1, maze[0].length - 1);
        Point[] path = new Point[maze.length * maze[0].length];

        int pathIdx = 0;
        int targetXValue = 0;
        int targetYValue = 0;

        while (targetXValue < maze.length) {
            while (targetYValue < maze[targetXValue].length) {
                if (pathIdx > 1 && targetXValue == 0 && targetYValue == 0) {
                    return false;
                }

                if (targetXValue == target.getxPoint() && targetYValue == target.getyPoint()) {
                    path[pathIdx] = target;
                    CommonUtils.printArr("Test is Finished", path);
                    return true;
                } else if (checkRightPath(maze, targetXValue, targetYValue, path, pathIdx)) {
                    path[pathIdx++] = new Point(targetXValue, targetYValue++);
                } else if (checkDownStream(maze, targetXValue, targetYValue, path, pathIdx)) {
                    path[pathIdx++] = new Point(targetXValue++, targetYValue);
                } else if (checkLeftPath(maze, targetXValue, targetYValue)) {
                    path[pathIdx++] = new Point(targetXValue, targetYValue--);
                } else if (checkUpStream(maze, targetXValue, targetYValue)) {
                    path[pathIdx++] = new Point(targetXValue--, targetYValue);
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean checkRightPath(int[][] maze, int targetXValue, int targetYValue, Point[] path, int pathIdx) {
        boolean isPreviousPoint = isNextPointIsPreviousPoint(path, pathIdx, targetXValue, targetYValue + 1);
        System.out.println(String.format("Check Right Path - X [%d] Y [%d] isPrevPoint [%b]", targetXValue, targetYValue, isPreviousPoint));
        return targetYValue <= maze[targetXValue].length - 2
                && isNotBlocked(maze, targetXValue, targetYValue + 1)
                && !isPreviousPoint;
    }

    private static boolean checkDownStream(int[][] maze, int targetXValue, int targetYValue, Point[] path, int pathIdx) {
        boolean isPreviousPoint = isNextPointIsPreviousPoint(path, pathIdx, targetXValue + 1, targetYValue);
        System.out.println(String.format("Check Down Stream - X [%d] Y [%d] isPrevPoint [%b]", targetXValue, targetYValue, isPreviousPoint));
        return targetXValue <= maze.length - 2
                && isNotBlocked(maze, targetXValue + 1, targetYValue)
                && !isPreviousPoint;
    }

    private static boolean isNextPointIsPreviousPoint(Point[] path, int pathIdx, int nextPointX, int nextPointY) {
        if (pathIdx > 0) {
            Point previousPoint = path[pathIdx - 1];
            System.out.println(String.format("Prev-Point Check [%s] X [%d] Y [%d]", previousPoint, nextPointX, nextPointY));
            return previousPoint != null
                    && previousPoint.getxPoint() == nextPointX && previousPoint.getyPoint() == nextPointY;
        } else {
            return false;
        }
    }

    private static boolean checkLeftPath(int[][] maze, int targetXValue, int targetYValue) {
        System.out.println(String.format("Check Left Path - X [%d] Y [%d]", targetXValue, targetYValue));
        return targetYValue != 0 && isNotBlocked(maze, targetXValue, targetYValue - 1);
    }

    private static boolean checkUpStream(int[][] maze, int targetXValue, int targetYValue) {
        System.out.println(String.format("Check Up Stream - X [%d] Y [%d]", targetXValue, targetYValue));
        return targetXValue != 0 && isNotBlocked(maze, targetXValue - 1, targetYValue);
    }

    private static boolean isNotBlocked(int[][] maze, int xPoint, int yPoint) {
        return maze[xPoint][yPoint] == 0;
    }

    public static void main(String... args) {
        int matrix[][] = {
                {0,1,1,1,1,1},
                {0,1,0,0,0,1},
                {0,0,0,1,0,1},
                {1,1,1,1,0,1},
                {1,1,1,1,0,1},
                {1,1,1,1,0,0}
        };
        boolean pathExist = isPathExistV2(matrix);
        System.out.println(String.format("Path Exists Check from [{0,0}, {5, 5}] [%b]", pathExist));
    }
}

