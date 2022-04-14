package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IsUniqueTest {
    @Test
    @DisplayName("IsUnique - True input")
    void trueIsUnique() {
        assertTrue(IsUnique.isUnique("abcdefghijklmnopqrstuvwxyz ", 256));        
    }

    @Test
    @DisplayName("IsUnique - False input")
    void falseIsUnique() {
        assertFalse(IsUnique.isUnique("abc abc", 256));
    }

    @Test
    @DisplayName("IsUnique - Empty string input")
    void emptyIsUnique() {
        assertTrue(IsUnique.isUnique("", 256));
    }
}
