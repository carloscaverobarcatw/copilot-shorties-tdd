package com.example;

/*
    Implement the ScoreKeeper as a Senior Java Developer

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

public class ScoreKeeper {


    public String getScore() {
        return "000:000";
    }
}