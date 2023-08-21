package _go

import "fmt"

/*
   Implement the ScoreKeeper as a Senior Go Developer

   Context:
   We need software to deliver the proper data to the scoreboard for a basketball team.
   They need six buttons (each team can score either 1, 2 or 3 points with a single shot).

   Write a ScoreKeeper struct which offers following methods:
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

// create a struct called ScoreKeeper
type ScoreKeeper struct {
	//fields for scores for team A
	scoreTeamA int

	//fields for scores for team B
	scoreTeamB int
}

// create a constructor for ScoreKeeper
func NewScoreKeeper() ScoreKeeper {
	return ScoreKeeper{}
}

// create a method called getScore() that returns a string
func (sk *ScoreKeeper) GetScore() string {
	//return the score string based on team A
	return fmt.Sprintf("%03d:%03d", sk.scoreTeamA, sk.scoreTeamB)
}

func (sk *ScoreKeeper) ScoreTeamA1() {
	sk.scoreTeamA += 1
}

func (sk *ScoreKeeper) ScoreTeamA2() {
	sk.scoreTeamA += 2
}

func (sk *ScoreKeeper) ScoreTeamA3() {
	sk.scoreTeamA += 3
}

func (sk *ScoreKeeper) ScoreTeamB1() {
	sk.scoreTeamB += 1
}

func (sk *ScoreKeeper) ScoreTeamB2() {
	sk.scoreTeamB += 2
}
