package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class StringCompressionTest {
    @Test
    @DisplayName("compressString - Normal input")
    void passStringCompression() {
        assertEquals("a2bc5a3", StringCompression.compressString("aabcccccaaa"));
    }

    @Test
    @DisplayName("compressString - Same length input")
    void sameLengthStringCompression() {
        assertEquals("aabbccdd", StringCompression.compressString("aabbccdd"));
    }

    @Test
    @DisplayName("compressString - Empty string input")
    void emptyStringCompression() {
        assertEquals("", StringCompression.compressString(""));
    }
}
