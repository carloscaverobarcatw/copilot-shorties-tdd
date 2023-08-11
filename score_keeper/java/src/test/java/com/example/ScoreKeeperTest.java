
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreKeeperTest {

    //Start testing the happy path, which will consist on a score of 000:000
    //when no points have been scored yet.
    @Test
    public void testInitialScore() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

}