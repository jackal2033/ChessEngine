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
		Pawn wPawn = new Pawn(true);
		Pawn bPawn = new Pawn(false);
		
		//assign pieces to board
		board.setPiece(2, 1, wPawn);
		board.setPiece(5, 6, bPawn);
		
		Pawn iPawn;
		
		System.out.println("Testing moving forward one while unimpeded...");
		//tests moving forward single space
		result = wPawn.move(board,2,2);
		output = (result && board.checkPiece(2, 2, wPawn)) ? "Passed" : "Failed";
		System.out.println("White ... " + output);
		
		result = bPawn.move(board, 5, 5);
		output = (result) ? "Passed" : "Failed";
		System.out.println("Black ... " + output);
		
		System.out.println();
		System.out.println("Testing moving forward one while impeded.");
		//test moving forward while impeded
		//wPawn: 2,2
		//bPawn: 5,5
		iPawn = new Pawn(true);
		
		board.setPiece(2, 3, iPawn);
		result = wPawn.move(board, 2, 3);
		output= (result)? "Failed" : "Passed";
		System.out.println("White ... " + output);
		

		board.setPiece(5, 4, iPawn);
		result = bPawn.move(board, 5, 4);
		output= (result)? "Failed" : "Passed";
		System.out.println("Black ... " + output);
		
		
		//reset piece to default vales and clear iPawn from board
		wPawn.reset();
		bPawn.reset();
		iPawn.kill(board);
		
		
		//test moving forward two spaces
		System.out.println("\nTesting moving forward two spaces.");
		//wPawn should be at 2,2
		result = wPawn.move(board, 2, 4);
		output= (result)? "Passed" : "Failed";
		System.out.println("White ... " + output);
		
		//bPawn should be at 5,5
		result = bPawn.move(board, 5, 3);
		output= (result)? "Passed" : "Failed";
		System.out.println("Black ... " + output);
		
		
		return rVal;
	}

}
