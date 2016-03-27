package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the board size : ");
        System.out.println(" .....  Easy ; Medium ;Hard ");

        Integer size = 8; //input.nextInt();
        String choice = "easy";//input.next().trim().toLowerCase();

        char[][] board = new char[size][size];
        createBoard(board);

        int blocks = (int) Math.pow(size, 2);
        int minis;
        switch (choice) {
            case "easy": {
                minis = (int) Math.round(blocks * 0.15);
                break;
            }
            case "medium": {
                minis = (int) Math.round(blocks * 0.5);
                break;
            }
            case "hard": {
                minis = (int) Math.round(blocks * 0.8);
                break;
            }
            default:
                throw new IllegalArgumentException("Choose between this three choices");
        }
    }

    public static void createBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("X" + board[i][j]);
            }
            System.out.println();
        }
    }

}

