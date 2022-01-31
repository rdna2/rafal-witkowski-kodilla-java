package com.kodilla.rps;

import static com.kodilla.rps.StartGame.*;
import static com.kodilla.rps.StartGame.setName;
import static java.lang.Character.getName;

public class RpsRunner {
    public static void main(String[] args) {
        StartGame game = new StartGame();

        StartGame.startGame();

        setName();

        //getName();

        PlayGame newGame = new PlayGame();

        PlayGame.makeHumanMove();
        PlayGame.playGame();
    }
}

