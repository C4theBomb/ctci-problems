package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ZeroMatrixTest {
    @Test
    @DisplayName("")
    void test3By3() {
        int[][] initial = {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        int[][] complete = {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};

        assertArrayEquals(complete, ZeroMatrix.setZeroes(initial));        
    }

    @Test
    @DisplayName("")
    void test4By3() {
        int[][] initial = {{0, 2, 3}, {4, 5, 6}, {7, 0, 9}, {10, 11, 12}};
        int[][] complete = {{0, 0, 0}, {0, 0, 6}, {0, 0, 0}, {0, 0, 12}};

        assertArrayEquals(complete, ZeroMatrix.setZeroes(initial));   
    }

    @Test
    @DisplayName("")
    void testAllZeroes() {
        int[][] initial = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        assertArrayEquals(initial, ZeroMatrix.setZeroes(initial));
    }

    @Test
    @DisplayName("")
    void testNoZeroes() {
        int[][] initial = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        assertArrayEquals(initial, ZeroMatrix.setZeroes(initial));
    }
}
