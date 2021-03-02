package com.rps.rockpaperscissors;

import com.rps.rockpaperscissors.messages.GameInstruction;
import com.rps.rockpaperscissors.model.Start;

//@SpringBootApplication
public class RockPaperScissorsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RockPaperScissorsApplication.class, args);

        GameInstruction gameInstruction = new GameInstruction();
        gameInstruction.loudInstruction();

        Start newGame = new Start();
        newGame.runGame();
    }
}
