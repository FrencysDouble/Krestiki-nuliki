package com.Glebass.junit;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @org.junit.jupiter.api.Test
    void arraysum() {
        Array array = new Array();
        int actual = array.Arraysum();
            assertTrue(actual>=0 && actual<= 1000);
            assertFalse(false);
    }
}