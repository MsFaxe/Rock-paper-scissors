package com.rps.rockpaperscissors;

import com.rps.rockpaperscissors.model.GameLogic;

public class RockPaperScissorsApplication {

    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();
        gameLogic.oneRound();
    }
}
