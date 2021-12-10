package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class StringCompressionTest {
    @Test
    @DisplayName("compressString ('aabcccccaaa') - 'a2bc5a3'")
    void passStringCompression() {
        assertEquals("a2bc5a3", StringCompression.compressString("aabcccccaaa"));
    }

    @Test
    @DisplayName("compressString ('aabbccdd') - 'aabbccdd'")
    void sameLengthStringCompression() {
        assertEquals("aabbccdd", StringCompression.compressString("aabbccdd"));
    }

    @Test
    @DisplayName("compressString ('') - ''")
    void emptyStringCompression() {
        assertEquals("", StringCompression.compressString(""));
    }
}
