package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose the board size : ");
        Integer size = input.nextInt();
        char[][] board = new char[size][size];
        createBoard(board);
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

