package com.C4theBomb.datastructures.linkedlists;

import java.lang.RuntimeException;

public class LoopDetection {
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
            Node newNode = new Node(data);
            if (current == null) {
                this.head = newNode;
            } else {
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        Node get(int index) {
            Node current = this.head;
            for (int i = 0; i < index; i++) {
                if (current == null) {
                    throw new RuntimeException("Index out of range.");
                }
                current = current.next;
            }
            return current;
        }

        static Node detectLoop(LinkedList llist) {
            Node step = llist.head;
            Node twoStep = llist.head;

            while (twoStep != null && twoStep.next != null) {
                step = step.next;
                twoStep = twoStep.next.next;
                if (step == twoStep)
                    break;
            }

            if (twoStep == null || twoStep.next == null)
                return null;

            step = llist.head;
            while (step != twoStep) {
                step = step.next;
                twoStep = twoStep.next;
            }

            return step;
        }
    }
}
