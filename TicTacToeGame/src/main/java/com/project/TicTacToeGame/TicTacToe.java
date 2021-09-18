package com.project.TicTacToeGame;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		createGameBoard();
	}

	public static String createGameBoard() {

		char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' } };

		String firstRow = "'1','2','3'";

		printGameBoard(board);
		
		String input = askUserToEnterNumber();
		
		return firstRow;
	}

	protected static String askUserToEnterNumber() {
		String inputNumber;
		try(Scanner scanner = new Scanner(System.in)){
			
			System.out.println("Please enter the number between 1-9 that you want to play:");
			inputNumber = scanner.nextLine();
			System.out.println(inputNumber);
			
		}
		return inputNumber;
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
