package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
    Implement the ScoreKeeper as a Senior Java Developer following a TDD approach

    Context:
    We need software to deliver the proper data to the scoreboard for a basketball team.
    They need six buttons (each team can score either 1, 2 or 3 points with a single shot).

    Write a class ScoreKeeper which offers following methods:
    void scoreTeamA1()
    void scoreTeamA2()
    void scoreTeamA3()
    void scoreTeamB1()
    void scoreTeamB2()
    void scoreTeamB3()
    String getScore()

    Rules:
    The returned String always has seven characters. An example would be 000:000
 */
public class ScoreKeeperTest {

    // Start with a happy path test
    // Test that the score is 000:000 when the game starts
    @Test
    public void shouldReturn000000AsScoreWhenGameStarts() {
        // Arrange
        ScoreKeeper scoreKeeper = new ScoreKeeper();

        // Act
        String score = scoreKeeper.getScore();

        // Assert
        assertEquals("000:000", score);
    }
}