package com.rps.rockpaperscissors.model;

import java.util.Scanner;

public class ExitGame {
    public void exit() {
        System.out.println("Are you sure you want exit the game?");
        System.out.println("Y - yes, N - no");

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        if (s.equals("y")) {
            System.exit(0);
        } else if (s.equals("n")) {
            System.out.println("You decided to stay in game, so take your choice: 1, 2 or 3");
        } else {
            System.out.println("Press y or n");
        }
    }
}
