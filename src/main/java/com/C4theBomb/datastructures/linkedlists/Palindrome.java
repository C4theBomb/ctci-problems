package com.C4theBomb.datastructures.linkedlists;

/* 
Implement a function to check if a linked list is a palindrome.
*/

import java.util.Stack;

public class Palindrome {
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
            for (Integer d : data) {
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

        Boolean checkPalindrome() {
            if (this.head == null) {
                return null;
            }

            Stack<Integer> stack = new Stack<>();
            Node front = this.head;
            Node behind = this.head;

            while (front != null && front.next != null) {
                stack.push(behind.data);
                front = front.next.next;
                behind = behind.next;
            }

            if (front != null) {
                behind = behind.next;
            }

            while (!stack.isEmpty()) {
                if (stack.pop() != behind.data) {
                    return false;
                }

                behind = behind.next;
            }

            return true;
        }
    }
}
