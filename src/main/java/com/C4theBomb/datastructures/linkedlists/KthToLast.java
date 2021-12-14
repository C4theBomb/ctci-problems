package com.C4theBomb.datastructures.linkedlists;

public class KthToLast {
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

        Node kthToLast(int k) {
            Node buffer = this.head;
            Node goal = this.head;

            for (int i = 0; i < k - 1; i++) {
                if (buffer.next == null) return null; 
                buffer = buffer.next;
            }

            while (buffer.next != null) {
                buffer = buffer.next;
                goal = goal.next;
            }
            

            return goal;
        }
    }
}
