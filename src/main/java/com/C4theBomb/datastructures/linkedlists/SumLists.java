package com.C4theBomb.datastructures.linkedlists;

public class SumLists {
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

        int findLength() {
            Node current = this.head;
            int length = 0;
            while (current != null) {
                current = current.next;
                length++;
            }

            return length;
        }

        public static LinkedList sumLists(LinkedList first, LinkedList second) {
            LinkedList sum = new LinkedList();
            Node firstCurrent = first.head;
            Node secondCurrent = second.head;

            int placeValue = 0;
            int carry = 0;
            while (firstCurrent != null || secondCurrent != null) {
                if (firstCurrent == null) {
                    placeValue = secondCurrent.data + carry;
                    secondCurrent = secondCurrent.next;
                } else if (secondCurrent == null) {
                    placeValue = firstCurrent.data + carry;
                    firstCurrent = firstCurrent.next;
                } else {
                    placeValue = firstCurrent.data + secondCurrent.data + carry;
                    firstCurrent = firstCurrent.next;
                    secondCurrent = secondCurrent.next;
                }
                carry = 0;

                if (placeValue >= 10) {
                    carry = 1;
                    placeValue -= 10;
                }

                sum.append(placeValue);

            }

            return sum;
        }
    }
}
