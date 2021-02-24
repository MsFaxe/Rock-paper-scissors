package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.shape.Shape;

public class GameLogic {
    private final PlayerMovement player = new PlayerMovement();
    private final ComputerMovement computer = new ComputerMovement();

    public void oneRound() {
        System.out.println("Choice 1, 2 or 3");
        Shape playerShape = player.PlayerTurn();
        Shape computerShape = computer.computerTurn();

        System.out.println(playerShape.getName() + ", " +  computerShape.getName());
    }
}
