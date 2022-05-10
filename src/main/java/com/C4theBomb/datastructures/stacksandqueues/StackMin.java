package com.C4theBomb.datastructures.stacksandqueues;

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
}
