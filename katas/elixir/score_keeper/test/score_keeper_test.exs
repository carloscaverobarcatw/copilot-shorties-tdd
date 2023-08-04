defmodule ScoreKeeperTest do
  use ExUnit.Case
  doctest ScoreKeeper

  test "greets the world" do
    assert ScoreKeeper.hello() == :world
  end
end
