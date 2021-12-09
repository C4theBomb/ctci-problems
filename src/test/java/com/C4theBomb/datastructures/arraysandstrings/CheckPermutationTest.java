package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class CheckPermutationTest {
    @Test
    @DisplayName("CheckPermutation1 ('abcdefg', 'gefdcba') - true")
    void trueCheckPermutation1() {
        assertTrue(CheckPermutation.checkPermutation1("abcdefg", "gefdcba"));
    }

    @Test
    @DisplayName("CheckPermutation1 ('asdf', 'akdm') - false")
    void falseCheckPermutation1() {
        assertFalse(CheckPermutation.checkPermutation1("asdf", "akdm"));
    }

    @Test
    @DisplayName("CheckPermutation2 ('abcdefg', 'gefcba') - true")
    void trueCheckPermutation2() {
        assertTrue(CheckPermutation.checkPermutation2("abcdefg", "gefdcba"));
    }

    @Test
    @DisplayName("CheckPermutation2 ('asdf', 'akdm') - false")
    void falseCheckPermutation2() {
        assertFalse(CheckPermutation.checkPermutation2("asdf", "akdm"));
    }
}
