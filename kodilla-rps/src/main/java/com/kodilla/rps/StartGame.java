package com.kodilla.rps;

import java.util.Scanner;

public class StartGame {

    private String name;
    private boolean condition;
    static Scanner scanner = new Scanner(System.in);


    public static void startGame() {
        System.out.println("Let us begin the RPS game");

        System.out.println("Would you like to read the game's instruction?");

        boolean condition = false;

        while (condition != true) {
            String readInstructionChoice = scanner.next();
            if (readInstructionChoice.equals("y") || readInstructionChoice.equals("Y")) {
                System.out.println("Here is the instruction");
                System.out.println("Please hit any key to proceed");
                String readInstructionChoice1 = scanner.next();
                if (readInstructionChoice1.equals("y")) {
                    System.out.println("Let us proceed with the game then");
                    setName();

                }
                //setName();

            } else {
                condition = true;
                System.out.println("Let us proceed with the game then");
            }
        }
    }

    public static void setName() {

        System.out.println("What is your name?");

        boolean condition1 = false;
        while (condition1 != true) {
            String name = scanner.nextLine();
            if (name.length() < 5) {
                System.out.println("Name to short, try again at least 5 characters");
            } else {
                condition1 = true;
                System.out.println("It is nice" + name + " you have joined the game");

                //  StartGame.startGame();
            }
            // private static String getName() {
            //   return name;
            //  }

        }

    }
}



