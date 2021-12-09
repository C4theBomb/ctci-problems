package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test cases for IsUnique module")
public class IsUniqueTest {
    @Test
    @DisplayName("True (abcdefghijklmnopqrstuvwxyz )")
    void trueIsUnique() {
        assertTrue(IsUnique.dataStructures("abcdefghijklmnopqrstuvwxyz ", 256));        
    }

    @Test
    @DisplayName("False (abc abc)")
    void falseIsUnique() {
        assertFalse(IsUnique.dataStructures("abc abc", 256));
    }
}
