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
	 * 	taken integer turn to store who play first
	 */
	Scanner scan = new Scanner(System.in);
	static char[] gameBoard = new char[10];
	static char player;
	static char computer;
	static int turn;
	
	/**
	 *	created showBoard method to print board
	 */
	public void showBoard() {
		/*
		 * 	created simple design of board and printing value of elements in it
		 * 	and at right side showing sample position numbers of board
		 */
		System.out.println("\n *** Current Board ***  |  *** Position Number ***");
		System.out.println("     -------------      |       -------------");
		System.out.println("     | " + gameBoard[1] + " | " + gameBoard[2] + " | " + gameBoard[3] + " |      |       | 1 | 2 | 3 |");
		System.out.println("     -------------      |       -------------");
		System.out.println("     | " + gameBoard[4] + " | " + gameBoard[5] + " | " + gameBoard[6] + " |      |       | 4 | 5 | 6 |");
		System.out.println("     -------------      |       -------------");
		System.out.println("     | " + gameBoard[7] + " | " + gameBoard[8] + " | " + gameBoard[9] + " |      |       | 7 | 8 | 9 |");
		System.out.println("     -------------      |       -------------");
	}
	
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
	 *	created chooseLetter method to assign letters to player and computer
	 */
	public void chooseLetter() {
		/*
		 *	tacking user input for player letter
		 *	if 'x' is entered then computer will get 'o'
		 *	else computer get 'x'
		 */
		System.out.print("\n Choose Player letter x or o : ");
		player = scan.next().charAt(0);
		if (player == 'x') {
			computer = 'o';
		} else {
			computer = 'x';
		}
		System.out.println("\n Player : " + player + "   and   Computer : " + computer);
	}
	
	/**
	 *	created changeTurn method to change turn of game
	 */
	public void changeTurn() {
		showBoard();
		if(turn == 1) {
			turn = 0;
			System.out.println("\n **** Computer will play first ****");
		} else {
			turn = 1;
			System.out.println("\n **** Player will play first ****");
		}
	}
	
	/**
	 *	created toss method to choose who will play first
	 */
	public void toss() {
		/*
		 *	taking option by using Math.random()
		 *	if get option = 1, then player will make first move
		 *	else computer will make first move
		 */
		showBoard();
		turn = (int) (Math.random()*2);
		if (turn == 1) {
			System.out.println("\n **** Player will play first ****");
		} else {
			System.out.println("\n **** Computer will play first ****");
		}
	}
		
}

