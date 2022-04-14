package com.C4theBomb.datastructures.linkedlists;

/* 
Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes greater an or equal to x.
(IMPORTANT: The partiiton element x can appear anywhere in the "right partition"; it does not need to appear between the left and right partitions.)
The additional spacing in the example below indicates the partition. Yes, the output below is one of many valud outputs!
*/

public class PartitionList {
    static public class LinkedList {
        Node head = null;

        class Node {
            Integer data;
            Node next;

            Node(Integer data) {
                this.data = data;
                this.next = null;
            }
        }

        void appendMultiple(Integer[] data) {
            for (Integer d : data) {
                this.append(d);
            }
        }

        void append(Integer data) {
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

        void partitionList(Integer data) {
            Node current = this.head;
            LinkedList less = new LinkedList();
            LinkedList greater = new LinkedList();

            while (current.next != null) {
                if (current.data <= data) {
                    less.append(current.data);
                } else {
                    greater.append(current.data);
                }
                current = current.next;
            }

            Node lessLast = less.head;
            if (lessLast == null) {
                Node newHead = new Node(null);
                newHead.next = this.head;
                this.head = newHead;
            } else if (greater.head == null) {
                current = this.head;
                while (current.next != null) {
                    current = current.next;
                }

                current.next = new Node(null);
            } else {
                while (lessLast.next != null) {
                    lessLast = lessLast.next;
                }

                lessLast.next = new Node(null);
                lessLast.next.next = greater.head;
                this.head = less.head;
            }
        }
    }
}
