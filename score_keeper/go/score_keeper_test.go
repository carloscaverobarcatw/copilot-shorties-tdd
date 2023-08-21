package _go

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

func TestEmptyScoreForAMatchWithNoPoints(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "000:000"
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}

func TestScoreForAMatchWithOnePoint(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "001:000"
	scoreKeeper.ScoreTeamA1()
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}

func TestScoreForAMatchWithTwoPoints(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "002:000"
	scoreKeeper.ScoreTeamA2()
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}

func TestScoreForAMatchWithThreePoints(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "003:000"
	scoreKeeper.ScoreTeamA3()
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}

func TestScoreForAMatchWithOnePointTeamB(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "000:001"
	scoreKeeper.ScoreTeamB1()
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}

func TestScoreForAMatchWithTwoPointsTeamB(t *testing.T) {
	scoreKeeper := NewScoreKeeper()
	expectedScore := "000:002"
	scoreKeeper.ScoreTeamB2()
	actualScore := scoreKeeper.GetScore()
	assert.Equal(t, expectedScore, actualScore)
}
