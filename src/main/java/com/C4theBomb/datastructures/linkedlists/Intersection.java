package com.C4theBomb.datastructures.linkedlists;

public class Intersection {
    static public class LinkedList {
        Node head = null;
        Node last = null;

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
            Node newNode = new Node(data);
            if (current == null) {
                this.head = newNode;
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            this.last = newNode;
        }

        static Node testIntersection(LinkedList llist1, LinkedList llist2) {
            return llist1.last;
        }
    }
}
