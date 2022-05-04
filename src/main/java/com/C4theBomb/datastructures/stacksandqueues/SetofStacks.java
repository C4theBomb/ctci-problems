package com.C4theBomb.datastructures.stacksandqueues;

import java.util.ArrayList;

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
        this.set = new ArrayList<>();
        this.set.add(new StackStack(this.stackCapacity));
    }

    public void push(int item) {
        if (this.set.get(this.set.size() - 1).isFull()) {
            set.add(new StackStack(this.stackCapacity));
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
}
