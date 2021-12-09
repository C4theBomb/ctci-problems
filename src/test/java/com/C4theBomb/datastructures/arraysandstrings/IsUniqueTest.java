package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class IsUniqueTest {
    @Test
    @DisplayName("IsUnique ('abcdefghijklmnopqrstuvwxyz ') - Expected Output: true")
    void trueIsUnique() {
        assertTrue(IsUnique.dataStructures("abcdefghijklmnopqrstuvwxyz ", 256));        
    }

    @Test
    @DisplayName("False ('abc abc') - Expected Output: false")
    void falseIsUnique() {
        assertFalse(IsUnique.dataStructures("abc abc", 256));
    }
}
