package com.ayesh.sample;

import static com.ayesh.sample.CommonUtils.isNextPointIsPreviousPoint;
import static com.ayesh.sample.CommonUtils.printMatrix;

public class MatrixTraversalSampleRec {
    public static boolean isPathExist(int[][] maze, int startX, int startY, Point[] path, int pathIdx) {
        printMatrix(maze, startX, startY, String.format("Start X [%d] Start Y [%d]", startX, startY));

        if (startX == 0 && startY == 0) {
            path[pathIdx++] = new Point(startX, startY);
            if (pathIdx > 1) {
                return false;
            }
        }

        if (startX == maze.length - 1 && startY == maze[startX].length - 1) {
            return true;
        } else if (startY <= maze[0].length - 2 && maze[startX][startY + 1] == 0
                && !isNextPointIsPreviousPoint(path, pathIdx - 1, startX, startY + 1)){
            path[pathIdx++] = new Point(startX, startY + 1);
            return isPathExist(maze, startX, startY + 1, path, pathIdx);
        } else if (startX <= maze.length - 2 && maze[startX + 1][startY] == 0
                && !isNextPointIsPreviousPoint(path, pathIdx, startX + 1, startY)) {
            path[pathIdx++] = new Point(startX + 1, startY);
            return isPathExist(maze, startX + 1, startY, path, pathIdx);
        } else if (startX != 0 && maze[startX - 1][startY] == 0) {
            path[pathIdx++] = new Point(startX - 1, startY);
            return isPathExist(maze, startX - 1, startY, path, pathIdx);
        } else if (startY != 0 && maze[startX][startY - 1] == 0) {
            path[pathIdx++] = new Point(startX, startY -1);
            return isPathExist(maze, startX, startY -1, path, pathIdx);
        } else {
            System.out.println("No Solution Found");
            return false;
        }
    }

    public static void main(String... args) {
        int matrix[][] = {
                {0,1,1,1,1,1},
                {0,1,0,0,0,1},
                {0,0,1,1,0,1},
                {0,1,1,1,0,1},
                {0,0,0,0,0,1},
                {1,1,1,1,0,0}
        };

        Point[] path = new Point[matrix.length * matrix[0].length];
        int pathIdx = 0;
        boolean pathExist = isPathExist(matrix, 0,0, path, pathIdx);
        System.out.println(String.format("Path Exists Check from [{0,0}, {5,5}] [%b]", pathExist));
        CommonUtils.printArr("Finished finding path", path);
    }
}
