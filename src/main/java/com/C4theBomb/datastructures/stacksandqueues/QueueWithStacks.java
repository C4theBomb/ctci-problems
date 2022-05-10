package com.C4theBomb.datastructures.stacksandqueues;

public class QueueWithStacks {
    Stack in, out;

    QueueWithStacks() {
        this.in = new Stack();
        this.out = new Stack();
    }

    public void push(int i) {
        this.in.push(i);
    }

    public int pop() {
        if (this.out.isEmpty()) {
            while (!this.in.isEmpty()) {
                this.out.push(this.in.pop());
            }
        }

        return this.out.pop();
    }
}
