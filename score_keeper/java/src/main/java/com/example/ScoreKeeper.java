package com.example;

public class ScoreKeeper {


    private int teamAScore = 0;

    public String getScore() {
        return String.format("%03d:000", teamAScore);
    }

    public void scoreTeamA1() {
        teamAScore += 1;
    }

    public void scoreTeamA2() {
        teamAScore += 2;
    }

}