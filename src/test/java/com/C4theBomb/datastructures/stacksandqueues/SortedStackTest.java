package com.C4theBomb.datastructures.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class SortedStackTest {
    SortedStack stack;

    @BeforeEach
    void setupEach() {
        this.stack = new SortedStack();
        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * 100);
            this.stack.push(random);
        }
        this.stack.sort();
    }

    @Test
    @DisplayName("sortedStack - test sorted")
    void testCorrectPop() {
        int previous = this.stack.pop();
        while (!this.stack.isEmpty()) {
            assertTrue(previous <= this.stack.peek());
            previous = this.stack.pop();
        }
    }
}
