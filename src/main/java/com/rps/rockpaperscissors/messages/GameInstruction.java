package com.rps.rockpaperscissors.messages;

public class GameInstruction {
    public void loudInstruction() {
        System.out.println("\npress 1 to select \"ROCK\", " +
                "\npress 2 to select \"PAPER\", " +
                "\npress 3 to select \"SCISSORS\", " +
                "\npress x to end of game, " +
                "\npress n to start a new game\n");
    }
}
