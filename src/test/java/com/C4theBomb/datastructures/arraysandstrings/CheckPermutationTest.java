package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckPermutationTest {
    @Test
    @DisplayName("CheckPermutation1 - True input")
    void trueCheckPermutation1() {
        assertTrue(CheckPermutation.checkPermutation1("abcdefg", "gfedcba"));
    }

    @Test
    @DisplayName("CheckPermutation1 - False input")
    void falseCheckPermutation1() {
        assertFalse(CheckPermutation.checkPermutation1("asdf", "akdm"));
    }

    @Test
    @DisplayName("CheckPermutation1 - Input with empty strings")
    void emptyCheckPermutation1() {
        assertTrue(CheckPermutation.checkPermutation1("", ""));
    }

    @Test
    @DisplayName("CheckPermutation2 - True input")
    void trueCheckPermutation2() {
        assertTrue(CheckPermutation.checkPermutation2("abcdefg", "gefdcba"));
    }

    @Test
    @DisplayName("CheckPermutation2 - False input")
    void falseCheckPermutation2() {
        assertFalse(CheckPermutation.checkPermutation2("asdf", "akdm"));
    }

    @Test
    @DisplayName("CheckPermutation2 - Input with empty string")
    void emptyCheckPermutation2() {
        assertTrue(CheckPermutation.checkPermutation2("", ""));
    }
}
