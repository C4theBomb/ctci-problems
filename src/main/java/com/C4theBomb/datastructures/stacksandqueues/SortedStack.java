package com.C4theBomb.datastructures.stacksandqueues;

public class SortedStack extends Stack {

    void sort() {
        Stack sorting = new Stack();

        while (!this.isEmpty()) {
            int tmp = this.pop();
            while (!sorting.isEmpty() && sorting.peek() > tmp) {
                this.push(sorting.pop());
            }
            sorting.push(tmp);
        }

        while (!sorting.isEmpty()) {
            this.push(sorting.pop());
        }
    }
}
