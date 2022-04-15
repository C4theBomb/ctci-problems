package com.C4theBomb.datastructures.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.stacksandqueues.StackMin.StackWithMin;

public class StackMinTest {
    StackWithMin stack = new StackWithMin();

    @BeforeEach
    void setupEach() {
        for (int i = 10; i > 0; i--) {
            this.stack.push(i);
        }
    }

    @Test
    @DisplayName("getMin - min 5")
    void testNormalMin() {
        assertEquals(1, this.stack.getMin());
    }

    @Test
    @DisplayName("getMin - wrong min")
    void testWrongMin() {
        assertNotEquals(10, this.stack.getMin());
    }
}
