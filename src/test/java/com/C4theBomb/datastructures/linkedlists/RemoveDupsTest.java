package com.C4theBomb.datastructures.linkedlists;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import com.C4theBomb.datastructures.linkedlists.RemoveDups.LinkedList;

public class RemoveDupsTest {

    boolean assertLinkedListEquals(LinkedList.Node head1, LinkedList.Node head2) {
        LinkedList.Node current1 = head1;
        LinkedList.Node current2 = head2;
        while (current1 != null || current2 != null) {
            assertEquals(current1.data, current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }

        return true;
    }


    @Test
    @DisplayName("")
    void testNormalLlist() {
        LinkedList normal = new LinkedList();
        int[] normalData = {1, 2, 2, 3, 4};
        normal.appendMultiple(normalData);

        LinkedList complete = new LinkedList();
        int[] completeData = {1, 2, 3, 4};
        complete.appendMultiple(completeData);

        normal.removeDups();

        assertLinkedListEquals(normal.head, complete.head);
    }

    @Test
    @DisplayName("")
    void testNoDuplicates() {
        LinkedList noDupes = new LinkedList();
        int[] noDupesData = {1, 2, 3, 4, 5};
        noDupes.appendMultiple(noDupesData);

        LinkedList complete = new LinkedList();
        complete.appendMultiple(noDupesData);

        noDupes.removeDups();

        assertLinkedListEquals(noDupes.head, complete.head);
    }

    @Test
    @DisplayName("")
    void testAllDuplicate() {
        LinkedList allDupes = new LinkedList();
        int[] allDupesData = {1, 1, 1, 1, 1};
        allDupes.appendMultiple(allDupesData);

        LinkedList complete = new LinkedList();
        complete.append(1);

        allDupes.removeDups();

        assertLinkedListEquals(allDupes.head, complete.head);
    }
}
