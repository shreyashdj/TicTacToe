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
		if (winingMove(computer, computer) == 0) {
			if (winingMove(player, computer) == 0) {
				if (checkCorners() == false) {
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
		}
	}
	
	public char winingMove(char char1, char char2) {
			if 	((gameBoard[1] == ' ' &&  gameBoard[2] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[1] == ' ' &&  gameBoard[4] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[1] == ' ' &&  gameBoard[5] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[1] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[3] == ' ' &&  gameBoard[2] == char1 && gameBoard[1] == char1) ||
				   (gameBoard[3] == ' ' &&  gameBoard[5] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[3] == ' ' &&  gameBoard[6] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[3] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[7] == ' ' &&  gameBoard[5] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[7] == ' ' &&  gameBoard[4] == char1 && gameBoard[1] == char1) ||
				   (gameBoard[7] == ' ' &&  gameBoard[8] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[7] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[9] == ' ' &&  gameBoard[6] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[9] == ' ' &&  gameBoard[8] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[9] == ' ' &&  gameBoard[5] == char1 && gameBoard[1] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[9] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[2] == ' ' &&  gameBoard[1] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[2] == ' ' &&  gameBoard[5] == char1 && gameBoard[8] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[2] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[4] == ' ' &&  gameBoard[1] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[4] == ' ' &&  gameBoard[5] == char1 && gameBoard[6] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[4] = char2;
					showBoard();
			return	1;
		} else if ((gameBoard[6] == ' ' &&  gameBoard[5] == char1 && gameBoard[4] == char1) ||
				   (gameBoard[6] == ' ' &&  gameBoard[9] == char1 && gameBoard[3] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[6] = char2;
					showBoard();
			 return 1;
		} else if ((gameBoard[8] == ' ' &&  gameBoard[2] == char1 && gameBoard[5] == char1) ||
				   (gameBoard[8] == ' ' &&  gameBoard[7] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[8] = char2;
					showBoard();
			return 1;
		} else if ((gameBoard[5] == ' ' &&  gameBoard[2] == char1 && gameBoard[8] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[4] == char1 && gameBoard[6] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[7] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[5] == char1 && gameBoard[1] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[5] = char2;
					showBoard();
			 return 1;
		} else {
				
			return 0;
		}
			
	}
	
	public boolean checkCorners() {
		boolean played = false;
		for (int i = 1; i <= 9; i=i+2) {
			if(i != 5 && gameBoard[i] == ' ' ) {
				System.out.println("\n **** Computer Played ****");
				gameBoard[i] = computer;
				showBoard();
				played = true;
				break;
			} 
		}
		return played;
	}

}
