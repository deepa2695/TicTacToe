package com.project.TicTacToeGame;

public class TicTacToe {

	public static void main(String[] args) {
		createGameBoard();
	}

	public static String createGameBoard() {

		char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

		String firstRow = "'1','2','3'";

		printGameBoard(board);

		return firstRow;
	}

	public static void printGameBoard(char[][] board) {

		System.out.println("...GAME BOARD...");
		System.out.println(board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
		System.out.println("-+-+-");
		System.out.println(board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
		System.out.println("-+-+-");
		System.out.println(board[2][0] + "|" + board[2][1] + "|" + board[2][2]);

	}

}
