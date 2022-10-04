package com.bridgelabz.TicTacToeGame;

/**
 * @author SHREYASH JADHAV
 */
public class Main {
	/**
	 *	created main to run program
	 */
	public static void main(String[] args) {
		/*
		 *	printed welcome message
		 *	created object of class TicTacToeGame
		 *	calling methods initializeBoard, chooseLetter, toss, playGame respectively
		 */
		System.out.println("\n Welcome to Tic-Tac-Toe Game");

		Play play = new Play();
		
		play.initializeBoard();
		play.chooseLetter();
		play.toss();
		play.playGame();
	}
}
