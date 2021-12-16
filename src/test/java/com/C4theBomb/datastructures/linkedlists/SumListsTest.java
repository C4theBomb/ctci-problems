package com.C4theBomb.datastructures.linkedlists;

/* 
You have two numbers represented by a lined list, where each node contains a single digit.
The digits are stored in reverse order, such that the 1's digit is at the head of the list.
Write a function that adds the two numbers and returns the sum as a linked list. 
NOTE: You are not allowed to "cheat" and conver the LinkedList to an integer.
*/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import com.C4theBomb.datastructures.linkedlists.SumLists.LinkedList;

public class SumListsTest {
    LinkedList first, second, sum;

    void assertLinkedListEquals(LinkedList.Node head1, LinkedList.Node head2) {
        LinkedList.Node current1 = head1;
        LinkedList.Node current2 = head2;
        assertNotNull(head1);
        assertNotNull(head2);
        while (current1 != null && current2 != null) {
            assertEquals(current1.data, current2.data);
            current1 = current1.next;
            current2 = current2.next;
        }
    }

    @BeforeEach
    void setupEach() {
        this.first = new LinkedList();
        this.second = new LinkedList();
        this.sum = new LinkedList();
    }

    @Test
    @DisplayName("sumLists - normal input with no carries")
    void sumListsNormal() {
        int[] firstData = { 5, 1, 6 };
        this.first.appendMultiple(firstData);

        int[] secondData = { 2, 7, 3 };
        this.second.appendMultiple(secondData);

        int[] sumData = { 7, 8, 9 };
        this.sum.appendMultiple(sumData);

        assertLinkedListEquals(this.sum.head, LinkedList.sumLists(this.first, this.second).head);
    }

    @Test
    @DisplayName("sumLists - normal input with carries")
    void sumListsCarries() {
        int[] firstData = { 5, 1, 6 };
        this.first.appendMultiple(firstData);

        int[] secondData = { 6, 7, 9 };
        this.second.appendMultiple(secondData);

        int[] sumData = { 1, 9, 5, 1 };
        this.sum.appendMultiple(sumData);

        assertLinkedListEquals(this.sum.head, LinkedList.sumLists(this.first, this.second).head);
    }

    @Test
    @DisplayName("sumLists - different length inputs with carries")
    void sumListsDifferentLength() {
        int[] firstData = { 5, 1, 6, 4, 2 };
        this.first.appendMultiple(firstData);

        int[] secondData = { 8, 7, 9, 9 };
        this.second.appendMultiple(secondData);

        int[] sumData = { 3, 9, 5, 4, 3 };
        this.sum.appendMultiple(sumData);

        assertLinkedListEquals(this.sum.head, LinkedList.sumLists(this.first, this.second).head);
    }
}
