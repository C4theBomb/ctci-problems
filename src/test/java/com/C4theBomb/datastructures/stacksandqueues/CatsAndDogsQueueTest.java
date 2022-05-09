package com.C4theBomb.datastructures.stacksandqueues;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class CatsAndDogsQueueTest {
    CatsAndDogsQueue petStore;

    @BeforeEach
    void setupEach() {
        this.petStore = new CatsAndDogsQueue();
        this.petStore.add("Dog1", "dog");
        this.petStore.add("Cat4", "cat");
        this.petStore.add("Cat2", "cat");
        this.petStore.add("Dog2", "dog");
        this.petStore.add("Cat3", "cat");
        this.petStore.add("Dog3", "dog");
        this.petStore.add("Cat1", "cat");
        this.petStore.add("Dog4", "dog");
    }

    @Test
    @DisplayName("CatsAndDogsQueue - pop dog")
    void popFirstDog() {
        assertEquals(this.petStore.remove("dog"), "Name: Dog1, Type: dog");
    }

    @Test
    @DisplayName("CatsAndDogsQueue - pop cat")
    void popFirstCat() {
        assertEquals(this.petStore.remove("cat"), "Name: Cat4, Type: cat");
    }

    @Test
    @DisplayName("CatsAndDogsQueue - pop oldest")
    void popOldest() {
        assertEquals(this.petStore.remove(), "Name: Dog1, Type: dog");
    }

    @Test
    @DisplayName("CatsAndDogsQueue - pop nonexistent")
    void popNonexistentType() {
        assertNull(this.petStore.remove("green"));
    }
}
