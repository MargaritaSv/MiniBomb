package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final char bomb = '@';

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the board size : ");
        System.out.println(" .....  Easy ; Medium ;Hard ");

        int size = 3; //input.nextInt();
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

        generateMinis(board, minis, size);
        System.out.println();
        createBoard(board);

        boolean isLive = true;
        while (isLive) {
            int moves = blocks - minis;
            while (moves > 0) {
                System.out.println("Choose a row:");
                int row = input.nextInt();
                System.out.println("Choose a column:");
                int col = input.nextInt();

                if (board[row][col] == bomb) {
                    System.out.println("You are the next kamikadze! :D ");
                    isLive = false;
                    break;
                } else if (board[row][col] == 'V') {
                    System.out.println("You can't twice or choose the same square./nThis will take you one live.");
                    moves--;
                } else {
                    board[row][col] = 'V';
                }

                createBoard(board);
            }
        }

    }

    private static char[][] generateMinis(char[][] board, int minis, int size) {
        Random rnd = new Random();

        while (minis > 0) {
            int row = rnd.nextInt(size);
            int col = rnd.nextInt(size);
            if (board[row][col] != bomb) {
                board[row][col] = bomb;
                minis--;
            }
        }
        return board;
    }

    public static void createBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print("_" + board[i][j]);
            }
            System.out.println();
        }
    }

}

