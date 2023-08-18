package _go

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
}

// create a constructor for ScoreKeeper
func NewScoreKeeper() ScoreKeeper {
	return ScoreKeeper{}
}

// create a method called getScore() that returns a string
func (sk *ScoreKeeper) GetScore() string {
	return "000:000"
}
