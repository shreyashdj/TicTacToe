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
		System.out.println("\n Player : " + player + "   and   Computer : " + computer);
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
		System.out.print("\n Enter Player Position : ");
		int position = scan.nextInt();
		if (gameBoard[position] == ' ') {
			System.out.println("\n **** Player Played ****");
			gameBoard[position] = player;
			showBoard();
			check();
		} else {
			System.out.println(" Position is not empty");
			playerMove();
		}
	}
	
	/**
	 *	created computerMove method in which computer can make move
	 */
	public void computerMove(){
		/*
		 *	taking position by using Math.random()
		 *	if position is empty make move
		 *	else call method again
		 */
		int position = (int) (Math.random()*9)+1;
		if (gameBoard[position] == ' ') {
			System.out.println("\n **** Computer Played ****");
			gameBoard[position] = computer;
			showBoard();
			check();
		} else {
			computerMove();
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
		option = (int) (Math.random()*2);
		if (option == 1) {
			System.out.println("\n **** Player will play first ****");
		} else {
			System.out.println("\n **** Computer will play first ****");
		}
	}
	
	/**
	 *	created check method to check winner or tie or change turn
	 */
	public void check() {
		if ((gameBoard[1] + gameBoard[2] + gameBoard[3]) == 'x'+'x'+'x' ||
			(gameBoard[4] + gameBoard[5] + gameBoard[6]) == 'x'+'x'+'x' ||
			(gameBoard[7] + gameBoard[8] + gameBoard[9]) == 'x'+'x'+'x' ||
			(gameBoard[1] + gameBoard[4] + gameBoard[7]) == 'x'+'x'+'x' ||
			(gameBoard[2] + gameBoard[5] + gameBoard[8]) == 'x'+'x'+'x' ||
			(gameBoard[3] + gameBoard[6] + gameBoard[9]) == 'x'+'x'+'x' ||
			(gameBoard[1] + gameBoard[5] + gameBoard[9]) == 'x'+'x'+'x' ||
			(gameBoard[3] + gameBoard[5] + gameBoard[7]) == 'x'+'x'+'x' ) {
			if (player == 'x') {
				System.out.println("\n **** Player Win ! ****");
			} else {
				System.out.println("\n **** Computer Win ! ****");
			}
			System.out.println("\n 1. Play New Game \n 2. Exit");
			System.out.print(" Enter choice no. : ");
			int choice = scan.nextInt();
			if (choice == 1) {
				initializeBoard();
				changeTurn();
				play();
			} else {
				System.out.println("\n **** Thanks for Playing ****");
				System.exit(0);

			}
			
		} else if ((gameBoard[1] + gameBoard[2] + gameBoard[3]) == 'o'+'o'+'o' ||
				   (gameBoard[4] + gameBoard[5] + gameBoard[6]) == 'o'+'o'+'o' ||
				   (gameBoard[7] + gameBoard[8] + gameBoard[9]) == 'o'+'o'+'o' ||
				   (gameBoard[1] + gameBoard[4] + gameBoard[7]) == 'o'+'o'+'o' ||
				   (gameBoard[2] + gameBoard[5] + gameBoard[8]) == 'o'+'o'+'o' ||
				   (gameBoard[3] + gameBoard[6] + gameBoard[9]) == 'o'+'o'+'o' ||
				   (gameBoard[1] + gameBoard[5] + gameBoard[9]) == 'o'+'o'+'o' ||
				   (gameBoard[3] + gameBoard[5] + gameBoard[7]) == 'o'+'o'+'o' ) {
				if (player == 'o') {
					System.out.println("\n **** Player Win ! ****");
				} else {
					System.out.println("\n **** Computer Win ! ****");
				}
				System.out.println("\n 1. Play New Game \n 2. Exit");
				System.out.print(" Enter choice no. : ");
				int choice = scan.nextInt();
				if (choice == 1) {
					initializeBoard();
					changeTurn();
					play();
				} else {
					System.out.println("\n **** Thanks for Playing ****");
					System.exit(0);;
				}

		} else if (gameBoard[1] != ' ' && gameBoard[2] != ' ' && gameBoard[3] != ' ' &&
				gameBoard[4] != ' ' && gameBoard[5] != ' ' && gameBoard[6] != ' ' &&
				gameBoard[7] != ' ' && gameBoard[8] != ' ' && gameBoard[9] != ' ' ) {
				System.out.println("\n **** Game Tie ****");
				System.out.println("\n 1. Play New Game \n 2. Exit");
				System.out.print(" Enter choice no. : ");
				int choice = scan.nextInt();
				if (choice == 1) {
					initializeBoard();
					changeTurn();
					play();
				} else {
					System.out.println("\n **** Thanks for Playing ****");
					System.exit(0);;
				}
			}	
	}
	
	public void play() {
		if (option == 1) {
			playerMove();
			for (int i = 1; i <= 4; i++) {
				computerMove();
				playerMove();
			}
		} else {
			computerMove();
			for (int i = 1; i <= 4; i++) {
				playerMove();
				computerMove();
			}
		}
	}
	
	public void changeTurn() {
		showBoard();
		if(option == 1) {
			option = 0;
			System.out.println("\n **** Computer will play first ****");
		} else {
			option = 1;
			System.out.println("\n **** Player will play first ****");
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
		game.chooseLetter();
		game.toss();
		game.play();
	}
		
}

