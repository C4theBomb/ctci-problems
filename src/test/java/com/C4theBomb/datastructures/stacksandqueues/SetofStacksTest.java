package com.C4theBomb.datastructures.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.stacksandqueues.SetofStacks;

public class SetofStacksTest {
    SetofStacks stack;

    @BeforeEach
    void setupEach() {
        this.stack = new SetofStacks(2);
        for (int i = 0; i < 10; i++) {
            this.stack.push(i);
        }
    }

    @Test
    @DisplayName("setOfStacks - correct pop")
    void testCorrectPop() {
        assertEquals(this.stack.pop(), 9);
    }

    @Test
    @DisplayName("setOfStacks - wrong pop")
    void testWrongPop() {
        assertNotEquals(this.stack.pop(), 5);
    }
}
