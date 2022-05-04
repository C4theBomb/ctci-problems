package com.C4theBomb.datastructures.stacksandqueues;

import java.util.EmptyStackException;

public class Stack {
    static public class StackNode {
        StackNode next;
        int data;
        StackNode min;

        public StackNode(int data) {
            this.data = data;
        }
    }

    protected StackNode top;

    public int pop() {
        if (this.top == null)
            throw new EmptyStackException();

        int item = this.top.data;
        this.top = this.top.next;

        return item;
    }

    public void push(int item) {
        StackNode t = new StackNode(item);
        t.next = this.top;
        this.top = t;

    }

    public int peek() {
        if (this.top == null)
            throw new EmptyStackException();

        return this.top.data;
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
