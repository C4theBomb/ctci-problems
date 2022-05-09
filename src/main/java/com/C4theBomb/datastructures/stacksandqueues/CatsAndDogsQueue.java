package com.C4theBomb.datastructures.stacksandqueues;

import java.util.NoSuchElementException;

class Pet {
    String name, type;

    public Pet(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String toString() {
        return String.format("Name: %s, Type: %s", this.name, this.type);
    }
}

public class CatsAndDogsQueue {
    Queue<Pet> pets = new Queue<>();

    public void add(String name, String type) {
        pets.add(new Pet(name, type));
    }

    public String remove() {
        return this.pets.remove().toString();
    }

    public String remove(String type) {
        Queue<Pet> tmp = new Queue<>();

        while (!this.pets.isEmpty() && this.pets.peek().type != type) {
            tmp.add(this.pets.remove());
        }

        if (this.pets.isEmpty()) {
            return null;
        }

        Pet pet = this.pets.remove();
        while (!tmp.isEmpty()) {
            this.pets.add(tmp.remove());
        }

        return pet.toString();
    }

}