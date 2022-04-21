package com.C4theBomb.datastructures.stacksandqueues;

import java.util.ArrayList;
import java.util.EmptyStackException;

class Stack {
    static public class StackNode {
        private StackNode next;
        int data;
        StackNode min;

        public StackNode(int data) {
            this.data = data;
        }
    }

    private StackNode top;
    private int capacity;
    private int height;

    public Stack(int capacity) {
        this.capacity = capacity;
    }

    public int pop() {
        if (this.top == null)
            throw new EmptyStackException();

        this.height--;

        int item = this.top.data;
        this.top = this.top.next;

        return item;
    }

    public void push(int item) {
        if (this.isFull()) {
            throw new StackOverflowError();
        }

        this.height++;

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

    public boolean isFull() {
        return this.height >= this.capacity;
    }
}

public class SetofStacks {
    ArrayList<Stack> set;
    int stackCapacity;

    SetofStacks(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.set = new ArrayList<>();
        this.set.add(new Stack(this.stackCapacity));
    }

    public void push(int item) {
        if (this.set.get(this.set.size() - 1).isFull()) {
            set.add(new Stack(this.stackCapacity));
        }

        this.set.get(this.set.size() - 1).push(item);
    }

    public int pop() {
        int data = set.get(this.set.size() - 1).pop();

        if (this.set.get(this.set.size() - 1).isEmpty()) {
            set.remove(this.set.size() - 1);
        }

        return data;
    }

    public int popAt(int stack) {
        int data = set.get(stack).pop();
        if (this.set.get(stack).isEmpty()) {
            set.remove(stack);
        }

        return data;
    }
}
