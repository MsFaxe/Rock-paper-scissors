package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;
import lombok.Getter;

@Getter
public class Score {
    private final String ROCK = "ROCK";
    private final String PAPER = "PAPER";
    private final String SCISSORS = "SCISSORS";

    private int playerScore = 0;
    private int computerScore = 0;

    public int[] roundScore(Shape playerShape, Shape computerShape, int[] gameScheme) {
        int player = 0, computer = 0;
        player = getResult(playerShape.getName(), player, gameScheme);
        computer = getResult(computerShape.getName(), computer, gameScheme);

        return new int[]{player, computer};
    }

    private int getResult(String shape, int result, int[] gameScheme) {
        int rock = gameScheme[0];
        int paper = gameScheme[1];
        int scissors = gameScheme[2];

        switch (shape) {
            case ROCK:
                result = rock;
                break;
            case PAPER:
                result = paper;
                break;
            case SCISSORS:
                result = scissors;
        }
        return result;
    }

    public void gameScore(int[] oneRoundScore) {
        playerScore += oneRoundScore[0];
        computerScore += oneRoundScore[1];
    }
}
