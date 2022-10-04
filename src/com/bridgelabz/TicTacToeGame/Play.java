/**
 * 
 */
package com.bridgelabz.TicTacToeGame;

/**
 * @author SHREYASH JADHAV
 */
public class Play  extends Move{
	/**
	 *	created check method to check winner or tie or change turn
	 */
	public void check(){
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
			check();
			for (int i = 1; i <= 4; i++) {
				computerMove();
				check();
				playerMove();
				check();
			}
		} else {
			computerMove();
			check();
			for (int i = 1; i <= 4; i++) {
				playerMove();
				check();
				computerMove();
				check();
			}
		}
	}
}
