package _go

import (
	"github.com/stretchr/testify/assert"
	"testing"
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
