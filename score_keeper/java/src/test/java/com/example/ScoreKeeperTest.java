
package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreKeeperTest {

    //Start testing the happy path, which will consist on a score of 000:000
    //when no points have been scored yet.
    @Test
    public void shouldReturn000000ScoreAtTheBeginningOfTheMatch() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        assertEquals("000:000", scoreKeeper.getScore());
    }

    //Now we will test the first point scored by team A, which will result in a score of 001:000
    @Test
    public void shouldReturn001000ScoreWhenTeamAScoresFirstPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA1();
        assertEquals("001:000", scoreKeeper.getScore());
    }

    //Now we will test the first point scored by team B, which will result in a score of 000:001
    @Test
    public void shouldReturn000001ScoreWhenTeamBScoresFirstPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB1();
        assertEquals("000:001", scoreKeeper.getScore());
    }

    //Now we will test a double point scored by team A, which will result in a score of 002:000
    @Test
    public void shouldReturn002000ScoreWhenTeamAScoresSecondPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA2();
        assertEquals("002:000", scoreKeeper.getScore());
    }

    //Now we will test a double point scored by team B, which will result in a score of 000:002
    @Test
    public void shouldReturn000002ScoreWhenTeamBScoresSecondPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB2();
        assertEquals("000:002", scoreKeeper.getScore());
    }

    //Now we will test a triple point scored by team A, which will result in a score of 003:000
    @Test
    public void shouldReturn003000ScoreWhenTeamAScoresThirdPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        assertEquals("003:000", scoreKeeper.getScore());
    }

    //Now we will test a triple point scored by team B, which will result in a score of 000:003
    @Test
    public void shouldReturn000003ScoreWhenTeamBScoresThirdPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamB3();
        assertEquals("000:003", scoreKeeper.getScore());
    }

    //Now we will test a triple point scored by team A and a double point scored by team B,
    //which will result in a score of 003:002
    @Test
    public void shouldReturn003002ScoreWhenTeamAScoresThirdPointAndTeamBScoresSecondPoint() {
        ScoreKeeper scoreKeeper = new ScoreKeeper();
        scoreKeeper.scoreTeamA3();
        scoreKeeper.scoreTeamB2();
        assertEquals("003:002", scoreKeeper.getScore());
    }

}