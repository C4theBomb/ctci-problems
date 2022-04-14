package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.linkedlists.LoopDetection.LinkedList;

public class LoopDetectionTest {
    LinkedList loop4, loop5, noLoop;

    @Test
    @DisplayName("loopDetection - 2 long into 5 loop")
    void loopDetection5Loop() {
        this.loop5 = new LinkedList();
        // Set up the initial loop with data.
        int[] loopData = { 1, 2, 3, 4, 5, 6, 7 };
        this.loop5.appendMultiple(loopData);

        // Connect the first part of the loop at the desired node.
        LinkedList.Node lastNode = this.loop5.get(6);
        LinkedList.Node loopStart = this.loop5.get(2);
        lastNode.next = loopStart;

        // Test that it returns the desired node
        assertEquals(loopStart, LinkedList.detectLoop(this.loop5));
    }

    @Test
    @DisplayName("loopDetection - 1 long into 4 loop")
    void loopDetection4Loop() {
        this.loop4 = new LinkedList();
        // Set up the initial loop with data.
        int[] loopData = { 1, 2, 3, 4, 5 };
        this.loop4.appendMultiple(loopData);

        // Connect the first part of the loop at the desired node.
        LinkedList.Node lastNode = this.loop4.get(4);
        LinkedList.Node loopStart = this.loop4.get(1);
        lastNode.next = loopStart;

        // Test that it returns the desired node
        assertEquals(loopStart, LinkedList.detectLoop(this.loop4));
    }

    @Test
    @DisplayName("loopDetection - different length inputs with intersection")
    void loopDetectionNoLoop() {
        this.noLoop = new LinkedList();
        // Set up the initial loop with data.
        int[] loopData = { 1, 2, 3, 4, 5, 6, 7 };
        this.noLoop.appendMultiple(loopData);

        // Test that it returns the desired node
        assertNull(LinkedList.detectLoop(this.noLoop));
    }
}
