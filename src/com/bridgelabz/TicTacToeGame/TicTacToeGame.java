package com.bridgelabz.TicTacToeGame;

import java.util.Arrays;

public class TicTacToeGame {
	
	public static void Gameboard (){
		
	char[] board = new char[10];		// initialized char array board of size 10
	
	/*
	 * 	using for loop storing empty space at elements position
	 */
	
	for(int i=0; i<board.length; i++) {
		board[i] = ' ';
	}
	System.out.println(Arrays.toString(board));

	
	}
	
	public static void main(String[] args) {

		System.out.println("Welcome to Tic-Tac-Toe Game");
		
		Gameboard();
		
	}

}
