package com.C4theBomb.datastructures.linkedlists;

/* 
Write code to remove duplicates from an unsorted linked list.
*/

import java.util.HashSet;

public class RemoveDups {
    static public class LinkedList {
        Node head = null;

        class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        void appendMultiple(int[] data) {
            for (int d : data) {
                this.append(d);
            }
        }

        void append(int data) {
            Node current = this.head;
            if (current == null) {
                this.head = new Node(data);
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
            }
        }

        void removeDups() {
            HashSet<Integer> set = new HashSet<>();
            Node prev = null;
            Node current = this.head;
            while (current != null) {
                if (set.contains(current.data)) {
                    prev.next = current.next;
                } else {
                    set.add(current.data);
                    prev = current;
                }
                current = current.next;
            }
        }
    }
}
