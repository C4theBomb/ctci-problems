package com.C4theBomb.datastructures.arraysandstrings;

/* 
Write an algorithm such that if an element in an M x N matrix is 0, its entire row and column are set to 0
*/

public class ZeroMatrix {
    static int[][] setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];

        for (int m = 0; m < rows.length; m++) {
            for (int n = 0; n < columns.length; n++) {
                if (matrix[m][n] == 0) {
                    rows[m] = true;
                    columns[n] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == true) nullifyRows(matrix, i);
        }

        for (int i = 0; i < columns.length; i++) {
            if (columns[i] == true) nullifyColumns(matrix, i);
        }

        return matrix;
    }

    private static void nullifyRows(int[][] matrix, int row) {
        for (int i = 0; i < matrix[0].length; i++) {
            matrix[row][i] = 0;
        }
    }

    private static void nullifyColumns(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }
}
