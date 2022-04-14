package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import com.C4theBomb.datastructures.linkedlists.KthToLast.LinkedList;

public class KthToLastTest {
    LinkedList initial;

    void assertLinkedListEquals(LinkedList.Node head1, LinkedList.Node head2) {
        LinkedList.Node current1 = head1;
        LinkedList.Node current2 = head2;
        while (current1 != null || current2 != null) {
            assertEquals(current1.data, current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }
    }

    @BeforeEach
    void setupEach() {
        this.initial = new LinkedList();
        int[] dataSet = {1, 2, 3, 4, 5};
        this.initial.appendMultiple(dataSet);
    }

    @Test
    @DisplayName("kthToLast - normal input")
    void kthToLastNormal() {
        assertEquals(3, this.initial.kthToLast(3).data);
    }

    @Test
    @DisplayName("kthToLast - invalid input")
    void kthToLastInvalid() {
        assertNull(this.initial.kthToLast(6));
    }
}
