package com.example;

/*
    Implement the ScoreKeeper as a Senior Java Developer

    Context:
    Implement the software to manage the scoreboard for a basketball team.
    Each team can score either 1, 2 or 3 points with a single shot.

    Write a class ScoreKeeper which offers following methods:
    void scoreTeamA1()
    void scoreTeamA2()
    void scoreTeamA3()
    void scoreTeamB1()
    void scoreTeamB2()
    void scoreTeamB3()
    String getScore()

    The returned String always has seven characters. An example would be 000:000

    Rules:
    Implement the tests step by step. Start with the first test case so teams did not score any points.
    Continue with the next test case and so on.

    Tests follow the naming convention should<ReturnWhichState><WhenSomethingHappens>.
    Example "shouldReturn000:000WhenTeamsDidNotScorePoints".

 		*/

public class ScoreKeeper {

    public String getScore() {
        return "000:000";
    }
}