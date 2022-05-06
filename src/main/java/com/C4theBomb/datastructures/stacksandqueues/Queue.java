package com.C4theBomb.datastructures.stacksandqueues;

public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode<T> first;
    private QueueNode<T> last;

    public void add(T i) {
        QueueNode<T> newNode = new QueueNode<>(i);
        if (last != null) {
            this.last.next = newNode;
        }
        this.last = newNode;
        if (first == null) {
            this.first = newNode;
        }
    }

    public T remove() {
        T data = first.data;

        this.first = this.first.next;
        if (first == null) {
            this.last = null;
        }

        return data;
    }

    public T peek() {
        return this.first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
