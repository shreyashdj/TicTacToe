package com.bridgelabz.TicTacToeGame;

/**
 * @author SHREYASH JADHAV
 */
public class Move extends TicTacToeGame{
	/**
	 *	created playerMove method in which player can make move
	 */
	public void playerMove() {
		/*	
		 * 	calling showBoard method
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
		 *	calling winingMove method to check computer can win or not, if it returns false
		 *	call  winingMove method to check player can win or not, if it returns false
		 *	call checkCorners method to check empty corners, if it returns false
		 *	check center position, if empty computer will make move, else
		 *	computer will make move at any of side positions
		 */
		if (winingMove(computer, computer) == false) {
			if (winingMove(player, computer) == false) {
				if (checkCorners() == false) {
					if (gameBoard[5] == ' ') {
						System.out.println("\n **** Computer Played ****");
						gameBoard[5] = computer;
						showBoard();
					} else {
					
						for (int i = 2; i <= 8; i=i+2) {
							if(gameBoard[i] == ' ') {
								System.out.println("\n **** Computer Played ****");
								gameBoard[i] = computer;
								showBoard();
								break;
							} 
						}
					}
				}
			}
		}
	}
	
	/**
	 *	created winingMove method to check if player or computer can win at next move
	 *	return type is boolean
	 */
	public boolean winingMove(char char1, char char2) {
		/*
		 *	if computer can win then computer will make move and return true
		 *	if player can win then computer will make move to block it and return true
		 *	if no one can win then return false
		 */
			if 	((gameBoard[1] == ' ' &&  gameBoard[2] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[1] == ' ' &&  gameBoard[4] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[1] == ' ' &&  gameBoard[5] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[1] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[3] == ' ' &&  gameBoard[2] == char1 && gameBoard[1] == char1) ||
				   (gameBoard[3] == ' ' &&  gameBoard[5] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[3] == ' ' &&  gameBoard[6] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[3] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[7] == ' ' &&  gameBoard[5] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[7] == ' ' &&  gameBoard[4] == char1 && gameBoard[1] == char1) ||
				   (gameBoard[7] == ' ' &&  gameBoard[8] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[7] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[9] == ' ' &&  gameBoard[6] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[9] == ' ' &&  gameBoard[8] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[9] == ' ' &&  gameBoard[5] == char1 && gameBoard[1] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[9] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[2] == ' ' &&  gameBoard[1] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[2] == ' ' &&  gameBoard[5] == char1 && gameBoard[8] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[2] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[4] == ' ' &&  gameBoard[1] == char1 && gameBoard[7] == char1) ||
				   (gameBoard[4] == ' ' &&  gameBoard[5] == char1 && gameBoard[6] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[4] = char2;
					showBoard();
			return	true;
		} else if ((gameBoard[6] == ' ' &&  gameBoard[5] == char1 && gameBoard[4] == char1) ||
				   (gameBoard[6] == ' ' &&  gameBoard[9] == char1 && gameBoard[3] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[6] = char2;
					showBoard();
			 return true;
		} else if ((gameBoard[8] == ' ' &&  gameBoard[2] == char1 && gameBoard[5] == char1) ||
				   (gameBoard[8] == ' ' &&  gameBoard[7] == char1 && gameBoard[9] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[8] = char2;
					showBoard();
			return true;
		} else if ((gameBoard[5] == ' ' &&  gameBoard[2] == char1 && gameBoard[8] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[4] == char1 && gameBoard[6] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[7] == char1 && gameBoard[3] == char1) ||
				   (gameBoard[5] == ' ' &&  gameBoard[5] == char1 && gameBoard[1] == char1)) {
					System.out.println("\n **** Computer Played ****");
					gameBoard[5] = char2;
					showBoard();
			 return true;
		} else {
				
			return false;
		}
			
	}
	
	/**
	 *	created checkCorners method to check corners are empty or not
	 */
	public boolean checkCorners() {
		/*
		 *	using for loop checking corners, if any corner is empty
		 *	computer will make move and return true else return false
		 */
		boolean played = false;
		
		for (int i = 1; i <= 9; i=i+2) {
			if(i != 5 && gameBoard[i] == ' ') {
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
