package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class MatrixRotationTest {
    @Test
    @DisplayName("rotateMatrix - 3x3 input")
    void rotate3By3Matrix() {
        int[][] initial = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotated = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(rotated, MatrixRotation.rotateMatrix(initial));
    }

    @Test
    @DisplayName("rotateMatrix - 4x4 input")
    void rotate4By4Matrix() {
        int[][] initial = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] rotated = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
        assertArrayEquals(rotated, MatrixRotation.rotateMatrix(initial));
    }
}
