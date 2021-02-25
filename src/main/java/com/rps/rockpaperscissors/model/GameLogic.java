package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;

import java.util.Arrays;
import java.util.List;

public class GameLogic {
    private final String ROCK = "ROCK";
    private final String PAPER = "PAPER";
    private final String SCISSORS = "SCISSORS";

    private final PlayerMovement player = new PlayerMovement();
    private final ComputerMovement computer = new ComputerMovement();

    public void oneRound() {
        System.out.println("Choose 1, 2 or 3");

        Shape plSh = player.playerTurn();
        Shape comSh = computer.computerTurn();
        System.out.println("Player: " + plSh.getName() + ", " + "\nComputer: " + comSh.getName());

        int[] oneRoundScore = gameScheme(plSh.getName(), comSh.getName());
        score(plSh, comSh, oneRoundScore);
    }

    public int[] gameScheme(String playerShape, String computerShape) {
        List shapes = Arrays.asList(playerShape, computerShape);
        int rock = 0, paper = 0, scissors = 0, win = 1;

        if (playerShape.equals(computerShape)) {
            System.out.println("DEAD-HEAD");
        } else if(shapes.contains(ROCK) && shapes.contains(PAPER)) {
            paper = win;
        } else if (shapes.contains(ROCK) && shapes.contains(SCISSORS)) {
            rock = win;
        } else if (shapes.contains(PAPER) && shapes.contains(SCISSORS)) {
            scissors = win;
        }

        return new int[]{rock, paper, scissors};
    }

    public void score(Shape playerShape, Shape computerShape, int[] gameScheme) {
        int player = 0, computer = 0;
        player = getResult(playerShape.getName(), player, gameScheme);
        computer = getResult(computerShape.getName(), computer, gameScheme);

        System.out.println("Score: " + player + ", " + computer);
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
}
