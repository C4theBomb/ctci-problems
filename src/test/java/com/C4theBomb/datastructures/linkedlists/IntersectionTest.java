package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.linkedlists.Intersection.LinkedList;

public class IntersectionTest {
    LinkedList noIntersect1, noIntersect2;
    LinkedList test1Intersect, test2Intersect;

    @Test
    @DisplayName("testIntersect - different length inputs with intersection")
    void trueIntersectionDifferentLengths() {
        // Initialize noIntersect1
        this.noIntersect1 = new LinkedList();
        int[] noIntersect1Data = { 1, 2, 3, 4, 5 };
        this.noIntersect1.appendMultiple(noIntersect1Data);

        // Initialize noIntersect2
        this.noIntersect2 = new LinkedList();
        int[] noIntersect2Data = { 1, 2, 3, 4 };
        this.noIntersect2.appendMultiple(noIntersect2Data);

        assertNull(LinkedList.testIntersection(this.noIntersect1, this.noIntersect2));
    }

    @Test
    @DisplayName("testIntersect - different length inputs with no intersection")
    void falseIntersectionDifferentLengths() {
        // Initialize test1Intersect
        this.test1Intersect = new LinkedList();
        int[] data1 = { 1, 2, 3, 4, 5 };
        this.test1Intersect.appendMultiple(data1);

        // Initialize test2Intersect
        this.test2Intersect = new LinkedList();
        int[] data2 = { 1, 2, 3 };
        this.test2Intersect.appendMultiple(data2);

        // Creating intersection at end of test1
        this.test1Intersect.last.next = this.test2Intersect.last;
        // Add more nodes to the intersection
        int[] intersectionData = { 8, 9, 10 };
        this.test2Intersect.appendMultiple(intersectionData);

        assertEquals(
                test2Intersect.head.next.next,
                LinkedList.testIntersection(
                        this.test1Intersect,
                        this.test2Intersect));
    }
}
