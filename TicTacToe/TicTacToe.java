package TicTacToe;

import java.util.*;
public class TicTacToe {
	
	static String[] board;
	static String turn;
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Scanner play = new Scanner(System.in);
		board = new String[9];
		turn = "X";
		String winner = null;

		for (int a = 0; a < 9; a++) {
			board[a] = String.valueOf(a + 1);
		}

		System.out.println("Let's play Tic Tac Toe!");
		printBoard();

		System.out.println("X will play first. Enter a slot number to place X in:");

		while (winner == null) {
			int input;
					
			//checks if input is valid
			try {
				input = in.nextInt();
				if (!(input > 0 && input <= 9)) {
					System.out.println("That's not a slot number; re-enter slot number:");
					continue;
				}
			}
			catch (Exception e) {
				System.out.println("Invalid input; re-enter slot number:");
				in.next();
				continue;
			}
					
			//logic of turns, replaces slot with Xs or Os
			if (board[input - 1].equals(String.valueOf(input))) {
				board[input - 1] = turn;
					if (turn.equals("X")) {
						turn = "O";
					}
					else {
						turn = "X";
					}
		
					printBoard();
					winner = checkWinner();
			}
			else {
			System.out.println("Oof, Slot already taken; re-enter slot number:");
			}
		}
			
		//prints draw if no one wins
		if (winner.equalsIgnoreCase("draw")) {
			System.out.println("It's a draw! Thanks for playing.");
		}
			
		//prints congratulations
		else {
			System.out.println("Congratulations! " + winner + "'s won!");
		}
		
		//play again option
		System.out.println("\nPlay again? (Y/N)");
		String againPlay= play.next();
 
			if(againPlay.equalsIgnoreCase("Y")){
				main(null);
			} else {
				System.out.println("Thanks for playing!");
			}
	}

	//Checks Winner
	static String checkWinner()
	{
		for (int a = 0; a < 8; a++) {
			String line = null;

			switch (a) {
			case 0:
				line = board[0] + board[1] + board[2];
				break;
			case 1:
				line = board[3] + board[4] + board[5];
				break;
			case 2:
				line = board[6] + board[7] + board[8];
				break;
			case 3:
				line = board[0] + board[3] + board[6];
				break;
			case 4:
				line = board[1] + board[4] + board[7];
				break;
			case 5:
				line = board[2] + board[5] + board[8];
				break;
			case 6:
				line = board[0] + board[4] + board[8];
				break;
			case 7:
				line = board[2] + board[4] + board[6];
				break;
			}
		
			//For X winner
			if (line.equals("XXX")) {
				return "X";
			}	
			// For O winner
			else if (line.equals("OOO")) {
				return "O";
			}
		}
		
		//checks if draw
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(
					String.valueOf(a + 1))) {
				break;
			}
			else if (a == 8) {
				return "draw";
			}
		}

		// Enters the Xs and Os on the input place
		System.out.println(turn + "'s turn; enter a slot number to place "+ turn + " in:");
		return null;
	}
		
	//prints board
	static void printBoard()
	{
		System.out.println();
		System.out.println("  " + board[0] + " | " + board[1] + " | " + board[2] + "  ");
		System.out.println(" ---+---+--- ");
		System.out.println("  " + board[3] + " | " + board[4] + " | " + board[5] + "  ");
		System.out.println(" ---+---+--- ");
		System.out.println("  " + board[6] + " | " + board[7] + " | " + board[8] + "  ");
		System.out.println();
	}
}

