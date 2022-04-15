package com.C4theBomb.datastructures.stacksandqueues;

import java.util.EmptyStackException;

public class StackMin {
    static public class StackWithMin extends Stack {
        private Stack minStack;

        StackWithMin() {
            this.minStack = new Stack();
        }

        public void push(int item) {
            StackNode t = new StackNode(item);
            t.next = super.top;
            super.top = t;

            if (item <= this.getMin()) {
                this.minStack.push(item);
            }
        }

        public int pop() {
            int value = super.pop();
            if (value == this.getMin()) {
                this.minStack.pop();
            }
            return value;
        }

        public int getMin() {
            return minStack.isEmpty() ? Integer.MAX_VALUE : this.minStack.peek();
        }
    }

    static public class Stack {

        static public class StackNode {
            private StackNode next;
            int data;
            StackNode min;

            public StackNode(int data) {
                this.data = data;
            }
        }

        private StackNode top;

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
            return top == null;
        }

    }
}
