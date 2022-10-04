package com.bridgelabz.TicTacToeGame;

/**
 * @author SHREYASH JADHAV
 */
public class Move   extends TicTacToeGame{
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
		if (winingMove() == 0) {
			int position = (int) (Math.random()*9)+1;
			if (gameBoard[position] == ' ') {
				System.out.println("\n **** Computer Played ****");
				gameBoard[position] = computer;
				showBoard();
			} else {
				computerMove();
			}
		}
	}
	
	public char winingMove() {
			if 	((gameBoard[1] == ' ' &&  gameBoard[2] == computer && gameBoard[3] == computer) ||
				   (gameBoard[1] == ' ' &&  gameBoard[4] == computer && gameBoard[7] == computer) ||
				   (gameBoard[1] == ' ' &&  gameBoard[5] == computer && gameBoard[9] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[1] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[3] == ' ' &&  gameBoard[2] == computer && gameBoard[1] == computer) ||
				   (gameBoard[3] == ' ' &&  gameBoard[5] == computer && gameBoard[7] == computer) ||
				   (gameBoard[3] == ' ' &&  gameBoard[6] == computer && gameBoard[9] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[3] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[7] == ' ' &&  gameBoard[5] == computer && gameBoard[3] == computer) ||
				   (gameBoard[7] == ' ' &&  gameBoard[4] == computer && gameBoard[1] == computer) ||
				   (gameBoard[7] == ' ' &&  gameBoard[8] == computer && gameBoard[9] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[7] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[9] == ' ' &&  gameBoard[6] == computer && gameBoard[3] == computer) ||
				   (gameBoard[9] == ' ' &&  gameBoard[8] == computer && gameBoard[7] == computer) ||
				   (gameBoard[9] == ' ' &&  gameBoard[5] == computer && gameBoard[1] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[9] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[2] == ' ' &&  gameBoard[1] == computer && gameBoard[3] == computer) ||
				   (gameBoard[2] == ' ' &&  gameBoard[5] == computer && gameBoard[8] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[2] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[4] == ' ' &&  gameBoard[1] == computer && gameBoard[7] == computer) ||
				   (gameBoard[4] == ' ' &&  gameBoard[5] == computer && gameBoard[6] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[4] = computer;
					showBoard();
			return	1;
		} else if ((gameBoard[6] == computer &&  gameBoard[5] == computer && gameBoard[4] == ' ') ||
				   (gameBoard[6] == computer &&  gameBoard[9] == computer && gameBoard[3] == ' ')) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[6] = computer;
					showBoard();
			 return 1;
		} else if ((gameBoard[8] == ' ' &&  gameBoard[2] == computer && gameBoard[5] == computer) ||
				   (gameBoard[8] == ' ' &&  gameBoard[7] == computer && gameBoard[9] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[8] = computer;
					showBoard();
			return 1;
		} else if ((gameBoard[5] == ' ' &&  gameBoard[2] == computer && gameBoard[8] == computer) ||
				   (gameBoard[5] == ' ' &&  gameBoard[4] == computer && gameBoard[6] == computer) ||
				   (gameBoard[5] == ' ' &&  gameBoard[7] == computer && gameBoard[3] == computer) ||
				   (gameBoard[5] == ' ' &&  gameBoard[5] == computer && gameBoard[1] == computer)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[5] = computer;
					showBoard();
			 return 1;
		} else {
				
			return 0;
		}
			
	}

}
