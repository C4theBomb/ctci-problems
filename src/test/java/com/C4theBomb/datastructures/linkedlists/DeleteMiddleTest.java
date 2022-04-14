package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import com.C4theBomb.datastructures.linkedlists.DeleteMiddle.LinkedList;

public class DeleteMiddleTest {
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
    @DisplayName("deleteMiddle - normal input")
    void deleteMiddleNormal() {
        LinkedList complete = new LinkedList();
        int[] completeData = {1, 2, 4, 5};
        complete.appendMultiple(completeData);

        LinkedList.Node doomed = this.initial.head.next.next;
        this.initial.deleteMiddle(doomed);

        assertLinkedListEquals(this.initial.head, complete.head);
    }

    @Test
    @DisplayName("deleteMiddle - last input")
    void deleteMiddleLast() {
        LinkedList complete = new LinkedList();
        int[] completeData = {1, 2, 3, 4, 5};
        complete.appendMultiple(completeData);

        LinkedList.Node doomed = this.initial.head.next.next.next.next;
        this.initial.deleteMiddle(doomed);

        assertLinkedListEquals(this.initial.head, complete.head);
    }

    @Test
    @DisplayName("deleteMiddle - first input")
    void deleteMiddleFirst() {
        LinkedList complete = new LinkedList();
        int[] completeData = {1, 2, 3, 4, 5};
        complete.appendMultiple(completeData);

        LinkedList.Node doomed = this.initial.head;
        this.initial.deleteMiddle(doomed);

        assertLinkedListEquals(this.initial.head, complete.head);
    }
}