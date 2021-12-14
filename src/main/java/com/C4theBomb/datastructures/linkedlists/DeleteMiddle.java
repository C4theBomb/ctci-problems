package com.C4theBomb.datastructures.linkedlists;

public class DeleteMiddle {
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

        void deleteMiddle(Node doomedNode) {
            if (doomedNode.next == null) return;
            if (doomedNode == this.head) return;

            Node next = doomedNode.next;
            doomedNode.data = next.data;
            doomedNode.next = next.next;
        }
    }
}
