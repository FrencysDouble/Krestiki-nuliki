package com.Glebass.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    @Test
    void arrSum() {
        int actual1 = Game.ArrSum(Game.CubeRandomp1());
        int actual2 = Game.ArrSum(Game.CubeRandomp2());
        assertTrue(actual1 >= 5 && actual1 <= 30);
        assertTrue(actual2 >= 5 && actual2 <= 30);
        assertFalse(false);
    }
}