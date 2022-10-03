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
	 */
	Scanner scan = new Scanner(System.in);
	static char[] gameBoard = new char[10];
	static char player;
	static char computer;
	
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
		game.chooseLetter();
		game.showBoard();
		
		}
		
	}

