package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckPalindromePermutationTest {
    @Test
    @DisplayName("CheckPalindromePermutation ('mmada') - true")
    void trueCheckPalindromePermutation() {
        assertTrue(CheckPalindromePermutation.checkPalindromePermutation("mmada"));
    }

    @Test
    @DisplayName("CheckPalindromePermutation ('ajdfsad') - false")
    void falseCheckPalindromePermutation() {
        assertFalse(CheckPalindromePermutation.checkPalindromePermutation("ajdfsad"));
    }

    @Test
    @DisplayName("CheckPalindromePermutation ('') - true")
    void emptyCheckPalindromePermutation() {
        assertTrue(CheckPalindromePermutation.checkPalindromePermutation(""));
    }
}
