package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test cases for CheckPermutation module")
public class CheckPermutationTest {
    @Test
    @DisplayName("trueCheckPermutation1 - (abcdefg, gefdcba)")
    void trueCheckPermutation1() {
        assertTrue(CheckPermutation.checkPermutation1("abcdefg", "gefdcba"));
    }

    @Test
    @DisplayName("falseCheckPermutation1 - (asdf, akdm)")
    void falseCheckPermutation1() {
        assertFalse(CheckPermutation.checkPermutation1("asdf", "akdm"));
    }

    @Test
    @DisplayName("trueCheckPermutation2 - (abcdefg, gefcba)")
    void trueCheckPermutation2() {
        assertTrue(CheckPermutation.checkPermutation2("abcdefg", "gefdcba"));
    }

    @Test
    @DisplayName("falseCheckPermutation2 - (asdf, akdm)")
    void falseCheckPermutation2() {
        assertFalse(CheckPermutation.checkPermutation2("asdf", "akdm"));
    }
}
