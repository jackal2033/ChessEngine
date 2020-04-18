package tests;
import board.*;
import piece.Pawn;
import piece.Piece;

public class PawnTests {

	public static void main(String[] args) {
		Board board = new Board();
		String result;
		
		System.out.print("Testing piece placement ... ");
		result = (moveForward(board))? "Passed" : "Failed";
		//System.out.println(result);

	}
	
	private static boolean moveForward(Board board)
	{
		boolean result, rVal = true;
		String output;
		board.clearBoard();
		
		//create pieces
		Pawn wPawn = new Pawn(true, 2, 1);
		Pawn bPawn = new Pawn(false, 2, 6);
		
		//assign pieces to board
		board.setPiece(2, 1, wPawn);
		board.setPiece(2, 6, bPawn);
		
		Pawn iPawn;
		
		System.out.println("Testing moving forward one while unimpeded...");
		//tests moving forward single space
		result = wPawn.move(board,2,2);
		output = (result) ? "Passed" : "Failed";
		System.out.println("White ... " + output);
		
		result = bPawn.move(board, 2, 5);
		output = (result) ? "Passed" : "Failed";
		System.out.println("Black ... " + output);
		
		System.out.println();
		System.out.println("Testing moving forward one while impeded.");
		//test moving forward while impeded
		iPawn = new Pawn(true, 2 , 2);
		board.setPiece(2, 2, iPawn);
		result = wPawn.move(board, 0, 1);
		output= (result)? "Failed" : "Passed";
		System.out.println("White ... " + output);
		

		iPawn = new Pawn(true, 0 , 1);
		board.setPiece(0, 1, iPawn);
		result = wPawn.move(board, 0, 1);
		output= (result)? "Failed" : "Passed";
		System.out.println("White ... " + output);
		
		
		//reset piece to default vales 
		wPawn.reset();
		bPawn.reset();
		
		//test moving forward two spaces
		
		
		return rVal;
	}

}
