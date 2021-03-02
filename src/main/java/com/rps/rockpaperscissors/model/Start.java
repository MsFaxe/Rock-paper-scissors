package com.rps.rockpaperscissors.model;

import lombok.Getter;

import java.util.Scanner;

@Getter
public class Start {
    private String name;
    private int rounds = 0;

    public void runGame() {
        enterYourName();
        enterTheNumberOfRounds();

        GameLogic gameLogic = new GameLogic();
        gameLogic.game(getRounds());
    }

    public void enterYourName() {
        System.out.println("Enter your name, please.");
        Scanner scanner = new Scanner(System.in);
        name = scanner.next();
        System.out.print("Hi " + getName());
    }

    public void enterTheNumberOfRounds() {
        System.out.println("! Enter number of round, please.");
        Scanner scanner = new Scanner(System.in);
        try {
            rounds = scanner.nextInt();
            System.out.println(getName() + ", you will play " + rounds + " rounds against the computer. Good luck :)");
        } catch (Exception e) {
            System.out.print("Error");
            enterTheNumberOfRounds();
        }
    }
}
