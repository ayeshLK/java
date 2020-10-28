package com.ayesh.sample;

import static com.ayesh.sample.CommonUtils.printMatrix;

public class MatrixTraversalSampleRec {
    public static boolean isPathExist(int[][] maze, int startX, int startY) {
        String message = String.format("Start X [%d] Start Y [%d]", startX, startY);

        printMatrix(maze, startX, startY, message);

        if (startX == maze.length - 1 && startY == maze[startX].length - 1) {
            return true;
        } else if (startY <= maze[0].length - 2 && maze[startX][startY + 1] == 0){
            System.out.println("Into X Path");
            return isPathExist(maze, startX, startY + 1);
        } else if (startX <= maze.length - 2 && maze[startX + 1][startY] == 0) {
            System.out.println("Into Y Path");
            return isPathExist(maze, startX + 1, startY);
        } else if (maze[startX - 1][startY] == 0) {
            System.out.println("Backtracking - UP");
            return isPathExist(maze, startX - 1, startY);
        } else if (maze[startX][startY - 1] == 0) {
            System.out.println("Backtracking - LEFT");
            return isPathExist(maze, startX, startY -1);
        } else {
            System.out.println("No Solution Found");
            return false;
        }
    }

    public static void main(String... args) {
        int matrix[][] = { { 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 } };
        boolean pathExist = isPathExist(matrix, 0,0);
        System.out.println(String.format("Path Exists Check from [{0,0}, {4,4}] [%b]", pathExist));
    }
}
