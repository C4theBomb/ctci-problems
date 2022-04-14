package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import com.C4theBomb.datastructures.linkedlists.PartitionList.LinkedList;

public class PartitionListTest {
    LinkedList initial;

    void assertLinkedListEquals(LinkedList.Node head1, LinkedList.Node head2) {
        LinkedList.Node current1 = head1;
        LinkedList.Node current2 = head2;
        while (current1 != null && current2 != null) {
            assertEquals(current1.data, current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }
    }

    @BeforeEach
    void setupEach() {
        this.initial = new LinkedList();
        Integer[] dataSet = {1, 2, 3, 4, 5};
        this.initial.appendMultiple(dataSet);
    }

    @Test
    @DisplayName("partitionList - normal input")
    void partitionListNormal() {
        LinkedList complete = new LinkedList();
        Integer[] completeData = {1, 2, null, 3, 4, 5};
        complete.appendMultiple(completeData);
        
        initial.partitionList(2);

        assertLinkedListEquals(initial.head, complete.head);
    }

    @Test
    @DisplayName("partitionList - all greater than input")
    void partitionListAllGreater() {
        LinkedList complete = new LinkedList();
        Integer[] completeData = {null, 1, 2, 3, 4, 5};
        complete.appendMultiple(completeData);
        
        initial.partitionList(0);

        assertLinkedListEquals(initial.head, complete.head);
    }

    @Test
    @DisplayName("partitionList - all less than input")
    void partitionListAllLessThan() {
        LinkedList complete = new LinkedList();
        Integer[] completeData = {1, 2, 3, 4, 5, null};
        complete.appendMultiple(completeData);
        
        initial.partitionList(6);

        assertLinkedListEquals(initial.head, complete.head);
    }
}
