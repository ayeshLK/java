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
                if (targetXValue == target.getxPoint() && targetYValue == target.getyPoint()) {
                    path[pathIdx++] = target;
                    CommonUtils.printArr("Test is Finished", path);
                    return true;
                } else if (targetYValue <= maze[0].length - 2 && maze[targetXValue][targetYValue + 1] == 0) {
                    path[pathIdx++] = new Point(targetXValue, targetYValue++);
                } else if (targetXValue <= maze.length - 2 && maze[targetXValue + 1][targetYValue] == 0) {
                    path[pathIdx++] = new Point(targetXValue++, targetYValue);
                } else if (maze[targetXValue - 1][targetYValue] == 0) {
                    path[pathIdx--] = new Point(targetXValue--, targetYValue);
                } else if (maze[targetXValue][targetYValue - 1] == 0) {
                    path[pathIdx--] = new Point(targetXValue, targetYValue--);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean canProceed(int[][] maze, int xPoint, int yPoint) {
        return maze[xPoint][yPoint] == 0;
    }

    public static void main(String... args) {
        int matrix[][] = { { 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 } };
        boolean pathExist = isPathExistV2(matrix);
        System.out.println(String.format("Path Exists Check from [{0,0}, {4, 4}] [%b]", pathExist));
    }
}

