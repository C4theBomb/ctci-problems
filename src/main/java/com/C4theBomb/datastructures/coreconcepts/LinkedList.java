package com.C4theBomb.datastructures.coreconcepts;

public class LinkedList {
    Node head;

    static class Node {
        String nodeData;
        Node next;

        Node(String data) {
            nodeData = data;
            next = null;
        }
        
    }

    public void printList() {
        Node current = head;
        int i = 0;
        while (current != null) {
            String message = String.format("Index: %d\n\tData: %s", i, current.nodeData);
            System.out.println(message);
            current = current.next;
            i++;
        }
    }

    public Node push(String data) {
        /*
        1. Create a new node with data input
        2. Set the next node to the head of the linked list
        3. Set the newNode to head
        */
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return newNode;
    }

    public Node insertAfter(Node prevNode, String newData) {
        /* 
        1. Intialize newNode with data input
        2. Check if prevNode == null, if so, return error
        3. Set next of newNode to next of prevNode
        4. Set next of prevNode to newNode
        */
        if (prevNode == null) {
            System.out.println("The previous node cannot be null");
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

        return newNode;
    }

    public Node insertEnd(String newData) {
        /* 
        1. Initialize node with data input
        2. Check if head is null, if so, insert newNode as head
        3. Get the last node
        4. Set the next of the last node to newNode
        NOTE: Time complexity can be increased to O(1) if a pointer to the end of the linked list is kept. Increases space complexity by a small amount.
        */
        Node newNode = new Node(newData);

        if (head == null) {
            head = newNode;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = newNode;

        return newNode;
    }

    public void deleteNode(String key) {
        Node tmp = head;
        Node prev = null;

        if (tmp != null && tmp.nodeData == key) {
            head = tmp.next;
            return;
        }

        while (tmp != null && tmp.nodeData != key) {
            prev = tmp;
            tmp = tmp.next;
        }

        if (tmp == null) {
            return;
        }

        prev.next = tmp.next;
    }

    public int length() {
        Node current = head;
        int length = 0;

        while (current != null) {
            current = current.next;
            length++;
        };
        
        System.out.println(length);
        return length;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        Node current = null;

        llist.head = new Node("Node 1");
        current = llist.head;
        current.next = new Node("Node 2");
        current = current.next;
        current.next = new Node("Node 3");
        current = current.next;

        llist.printList();
        llist.push("Pushed");
        llist.printList();
        llist.insertAfter(current, "Insert After");
        llist.printList();
        llist.insertEnd("Insert End");
        llist.printList();

        llist.length();
    }
}
