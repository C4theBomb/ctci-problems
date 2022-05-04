package com.C4theBomb.datastructures.stacksandqueues;

import java.util.ArrayList;

import com.C4theBomb.datastructures.stacksandqueues.Stack;

class StackStack extends Stack {
    int capacity;
    int height;

    StackStack(int capacity) {
        this.capacity = capacity;
    }

    public void push(int data) {
        this.height++;
        super.push(data);
    }

    public int pop(int data) {
        this.height--;
        return super.pop();
    }

    public boolean isFull() {
        if (this.height >= this.capacity) {
            return true;
        }

        return false;
    }
}

public class SetofStacks {
    ArrayList<StackStack> set;
    int stackCapacity;

    SetofStacks(int stackCapacity) {
        this.stackCapacity = stackCapacity;
        this.set.add(new StackStack(this.stackCapacity));
    }

    public void push(int item) {
        if (this.set.get(-1).isFull()) {
            set.add(new StackStack(this.stackCapacity));
        }

        this.set.get(-1).push(item);
    }

    public int pop() {
        int data = set.get(-1).pop();

        if (this.set.get(-1).isEmpty()) {
            set.remove(-1);
        }

        return data;
    }
}
