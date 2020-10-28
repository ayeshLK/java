package com.ayesh.sample;

public class MatrixTraversalSampleRec {
    public static boolean isPathExist(int[][] maze) {
        if (maze.length == 1 && maze[0].length == 1) {
            return maze[0][0] == 0;
        } else if (maze[0].length > 1 && isPathExist(retrievePartialMatrix(maze, 0, 1, "Right Path"))) {
            return true;
        } else if (maze[1].length > 1 && isPathExist(retrievePartialMatrix(maze, 1, 0, "Down Path"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int[][] retrievePartialMatrix(int[][] matrix, int startY, int startX, String  message) {
        printMatrix(matrix, message);
        int[][] updated = new int[matrix.length - startY][matrix[startY].length - startX];
        int k = 0;
        for (int i = startY; i < matrix.length; i++) {
            int l = 0;
            for (int j = startX; j < matrix[i].length - startX; j++) {
                int val = matrix[i][j];
                System.out.println(String.format("K [%d] L [%d] Val [%d]", k, l, val));
                updated[k][l++] = val;
            }
            k++;
        }
        return updated;
    }

    public static void printMatrix(int[][] matrix, String message) {
        System.out.println(String.format("Printing Matrix [%s]", message));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String... args) {
        int matrix[][] = { { 0, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1 }, { 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 1, 0 }, { 1, 1, 1, 1, 0 } };
        boolean pathExist = isPathExist(matrix);
        System.out.println(String.format("Path Exists Check from [{0,0}, {3,3}] [%b]", pathExist));
    }
}
