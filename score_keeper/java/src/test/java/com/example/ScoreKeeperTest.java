package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreKeeperTest {

    @Test
    public void shouldReturn000000WhenTeamsDidNotScorePoints() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        String score = scoreKeeper.getScore();
        assertEquals("000:000", score);
    }
}