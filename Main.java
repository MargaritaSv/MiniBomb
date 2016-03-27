package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the board size : ");
        System.out.println(" .....  Easy ; Medium ;Hard ");

        Integer size = input.nextInt();
        String choice = input.next().trim().toLowerCase();

        char[][] board = new char[size][size];
        createBoard(board);

        if (choice.equals("easy")) {
            //TODO: calculated
        } else if (choice.equals("medium")) {

        } else if (choice.equals("hard")) {

        } else {
            //TODO: other choice etc error ...  while
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

