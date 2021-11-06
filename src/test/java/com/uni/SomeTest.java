package com.uni;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeTest {

    @Test
    void square() {
        Some obj = new Some();
        obj.setNumber(5);
        assertEquals(25, obj.square());
    }
}