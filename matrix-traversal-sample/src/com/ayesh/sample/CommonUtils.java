package com.ayesh.sample;

public final class CommonUtils {
    public static void printMatrix(int[][] source, int startX, int startY, String message) {
        System.out.println(message);
        for (int i = startX; i < source.length; i++) {
            for (int j = startY; j < source[i].length; j++) {
                System.out.print(source[i][j] + " ");
            }
            System.out.println("");
        }
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
