package com.C4theBomb.datastructures.arraysandstrings;

import java.lang.Math;

public class MatrixRotation {
    static int[][] rotateMatrix(int[][] matrix) {
        int maxLength = matrix.length - 1;
        int numbersInInner = matrix.length;

        for (int d = 0; d < Math.ceil((maxLength + 1)/ 2); d++) {
            for (int i = 0; i < numbersInInner - 1; i++) {
                // Stores top into variable tmp
                int tmp = matrix[maxLength - (maxLength - d)][maxLength - (maxLength - (d + i))];
                // Set top equal to left
                matrix[maxLength - (maxLength - d)][maxLength - (maxLength - (d + i))] = matrix[maxLength - (d + i)][maxLength - (maxLength - d)];
                // Set left equal to bottom
                matrix[maxLength - (d + i)][maxLength - (maxLength - d)] = matrix[maxLength - d][maxLength - (d + i)];
                // Set bottom equal to right
                matrix[maxLength - d][maxLength - (d + i)] = matrix[maxLength - (maxLength- (d + i))][maxLength - d];
                // Set right equal to tmp
                matrix[maxLength - (maxLength- (d + i))][maxLength - d] = tmp;
            }

            numbersInInner -= 2;
        }

        return matrix;
    }
}
