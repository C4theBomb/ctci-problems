package com.C4theBomb.datastructures.arraysandstrings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class URLifyTest {
    String string = "testing testing 123";

    @Test
    @DisplayName("urlify - Normal Input")
    void passUrlify() {
        assertEquals("testing%20testing%20123", URLify.urlify(this.string));
    }
    
    @Test
    @DisplayName("urlify - Empty string input")
    void emptyInputUrlify() {
        assertEquals("", URLify.urlify(""));
    }
}
