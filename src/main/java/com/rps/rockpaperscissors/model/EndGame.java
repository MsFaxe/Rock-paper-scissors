package com.rps.rockpaperscissors.model;

import com.rps.rockpaperscissors.messages.Command;

import java.util.Scanner;

public class EndGame {
    private final Scanner scanner = new Scanner(System.in);
    private final Command command = new Command();

    public void end(String s) {
        command.confirmChoice();

        String confirm = scanner.next();
        if (confirm.equals("n")) {
            System.out.println("You decided to stay in game, so take your choice: 1, 2 or 3");
        } else if (confirm.equals("y") && s.equals("x")) {
            System.exit(0);
        } else if (confirm.equals("y") && s.equals("n")) {
            System.out.println("\nNEW GAME!");
            Start newGame = new Start();
            newGame.runGame();
        } else {
            System.out.println("Press y or n");
        }
    }
}
