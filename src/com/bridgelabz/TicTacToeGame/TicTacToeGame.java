package com.bridgelabz.TicTacToeGame;

import java.util.Scanner;
/**
 * @author SHREYASH JADHAV
 */
public class TicTacToeGame {
	/*
	 *	created object of class Scanner
	 * 	initialized char array gameBoard of size 10
	 * 	taken char type variables player and computer
	 * 	taken integer type variable option
	 */
	Scanner scan = new Scanner(System.in);
	static char[] gameBoard = new char[10];
	static char player;
	static char computer;
	static int option;
	
	/**
	 * created initializeBoard method to Initialize Board with empty space
	 */
	public void initializeBoard () {		
		/*
		 * 	using for loop storing empty space at elements position
		 */
		for(int i = 1; i < gameBoard.length; i++) {
			gameBoard[i] = ' ';
		}
	}
	
	/**
	 *	created showBoard method to print board
	 */
	public void showBoard() {
		/*
		 * 	created simple design of board and printing value of elements in it
		 */
		System.out.println("\n -------------");
		System.out.println(" | " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + " |");
		System.out.println(" -------------");
		System.out.println(" | " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + " |");
		System.out.println(" -------------");
		System.out.println(" | " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + " |");
		System.out.println(" -------------");
	}
	
	/**
	 *	created chooseLetter method to assign letters to player and computer
	 */
	public void chooseLetter() {
		/*
		 *	tacking user input for player letter
		 *	if 'x' is entered then computer will get 'o'
		 *	else computer get 'x'
		 */
		System.out.print("\n Enter the player letter x or o : ");
		player = scan.next().charAt(0);
		if (player == 'x') {
			computer = 'o';
		} else {
			computer = 'x';
		}
		System.out.println("\n Player : " + player + " and Computer : " + computer);
	}
	
	/**
	 *	created playerMove method in which player can make move
	 */
	public void playerMove() {
		/*	calling showBoard method
		 *	taking user input for position
		 *	if position is empty make move
		 *	else call method again
		 */
		showBoard();
		System.out.print("\n Enter Player Position : ");
		int position = scan.nextInt();
		if (gameBoard[position] == ' ') {
			gameBoard[position] = player;
		} else {
			System.out.println(" Position is not empty");
			playerMove();
		}
	}
	
	/**
	 *	created computerMove method in which computer can make move
	 */
	public void computerMove(){
		int position = (int) (Math.random()*9)+1;
		if (gameBoard[position] == ' ') {
			gameBoard[position] = computer;
		} else {
			computerMove();
		}
	}
	
	/**
	 *	created method to choose who will play first
	 */
	public void toss() {
		option = (int) (Math.random()*2);
		if (option == 1) {
			System.out.println("\n player will play first");
			playerMove();
		} else {
			System.out.println("\n computer will play first");
			computerMove();
		}
	}
	
	/**
	 *	created main to run program
	 */
	public static void main(String[] args) {
		/*
		 *	printed welcome message
		 *	created object of class TicTacToeGame
		 *	calling methods initializeBoard, initializeBoard, chooseLetter
		 */
		System.out.println("\n Welcome to Tic-Tac-Toe Game");
		
		TicTacToeGame game = new TicTacToeGame();

		game.initializeBoard();
		game.showBoard();
		game.chooseLetter();
		game.toss();
		if (option == 1) {
			for (int i = 1; i <= 4; i++) {
				game.computerMove();
				game.playerMove();
			}
		} else {
			for (int i = 1; i <= 4; i++) {
				game.playerMove();
				game.computerMove();
			}
		}
		game.showBoard();
	}
		
}

