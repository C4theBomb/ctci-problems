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

        int length() {
            Node current = this.head;
            int count = 0;
            while (current != null) {
                current = current.next;
                count++;
            }
            return count;
        }

        static Node testIntersection(LinkedList llist1, LinkedList llist2) {
            int length1 = llist1.length();
            int length2 = llist2.length();

            if (llist1.last != llist2.last) {
                return null;
            }

            Node current1 = llist1.head;
            Node current2 = llist2.head;
            if (length1 > length2) {
                for (int i = 0; i < length1 - length2; i++) {
                    current1 = current1.next;
                }
            } else {
                for (int i = 0; i < length2 - length1; i++) {
                    current2 = current2.next;
                }
            }

            while (current1 != current2) {
                current1 = current1.next;
                current2 = current2.next;
            }

            return current1;
        }
    }
}
