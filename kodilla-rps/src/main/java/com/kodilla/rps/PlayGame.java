package com.kodilla.rps;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class PlayGame {
    public static void playGame() {


        String paper = "paper";
        String scissors = "scissors";
        String stone = "stone";

        ArrayList<List> gameResultsArray = new ArrayList<>();
        gameResultsArray.add(new List(paper, scissors, "Paper is cut by Scissors and you have lost"));
        gameResultsArray.add(new List(paper, stone, "Paper covers Stone and you have won"));
        gameResultsArray.add(new List(scissors, paper, "Scissors are destroyed by Stone and you have lost"));

        // ArrayList<String> result = new ArrayList<>();
        //  result.add("C");
        // result.add("H");
        //  result.add("C");

        String[] result = {"C", "H", "C"};

        HashMap<List, String> gameResultsMap = new HashMap<>();


        for (int i = 0; i < gameResultsArray.size(); i++) {
            gameResultsMap.put(gameResultsArray.get(i), result[i]);
        }

        System.out.println(gameResultsMap);
    }

    public static void makeHumanMove() {
        System.out.println("To start your move, enter a respective key from your keyboard. Please remember: 1 stands for ...");
        Scanner humanMove = new Scanner(System.in);
        boolean condition = false;
        Random random = new Random();

        String[] scores = new String[5];


            while (condition != true) {


                String move = humanMove.next();
                if (move.equals("1")) {
                    System.out.println("You have chosen Paper");
                    int compMove = random.nextInt(3) + 1;
                    if (compMove == 1) {
                        System.out.println("Computer has chosen Paper");
                        System.out.println("It is a draw");
                        scores[0] = "D";
                        System.out.println(scores[0]);
                    } else {
                        if (compMove == 2) {
                            System.out.println("Computer has chosen Scissors");
                            System.out.println("Computer wins");
                            scores[0] = "C";
                        } else {
                            if (compMove == 3) {
                                System.out.println("Computer has chosen Stone");
                                System.out.println("You win");
                                scores[0] = "H";
                            }

//                }
//                if (compMove == 2) {
//                    System.out.println("Computer has chosen Scissors");
                            // System.out.println(List.getHumanToken(1));
                        }
                    }
                } else {
                    System.out.println("stop for now");

                }


                System.out.println(scores[0]);
                //makeHumanMove();
            }

        }
        //void repeatGame(){
        // makeHumanMove();
        //}
    }
}
