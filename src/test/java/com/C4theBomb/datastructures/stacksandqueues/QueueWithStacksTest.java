package com.C4theBomb.datastructures.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class QueueWithStacksTest {
    QueueWithStacks queue;

    @BeforeEach
    void setupEach() {
        this.queue = new QueueWithStacks();
        for (int i = 0; i < 10; i++) {
            this.queue.push(i);
        }
    }

    @Test
    @DisplayName("queueWithStacks - correct pop")
    void testCorrectPop() {
        assertEquals(this.queue.pop(), 0);
    }

    @Test
    @DisplayName("queueWithStacks - wrong pop")
    void testWrongPop() {
        assertNotEquals(this.queue.pop(), 9);
    }
}
