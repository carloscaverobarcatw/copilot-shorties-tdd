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

    private Integer teamAPoints = 0;
    private Integer teamBPoints = 0;

    public String getScore() {
        return String.format("%03d:%03d", teamAPoints, teamBPoints);
    }

    public void scoreTeamA1() {
        addPointToTeamA(1);
    }

    private void addPointToTeamA(int i) {
        teamAPoints += i;
    }

    public void scoreTeamB1() {
        // add point to team B
        teamBPoints += 1;
    }
}