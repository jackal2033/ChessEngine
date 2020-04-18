package tests;

import board.*;
import piece.*;

public class BoardTests {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board board = new Board();
		String result;
		
		System.out.print("Testing piece placement ... ");
		result = (verifyPieces(board)) ? "Passed" : "Failed";
		System.out.println(result);
		
		System.out.print("Testing colors on board ... ");
		result = (verifyColors(board)) ? "Passed" : "Failed";
		System.out.println(result);
	}
	
	/*'
	 * verifies placement of pieces on board
	 */
	private static Boolean verifyPieces(Board board) 
	{ 
		Boolean isWhite;
		Board testBoard = new Board();
		testBoard.clearBoard();
		Piece piece;
		Square square;
		boolean rVal = true;
		for(int x = 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				square = Board.getSquare(x, y);
				piece = square.getPiece();
				Piece checkPiece;
				isWhite= (y < 2)? false : true;
				// tests pawns
				if (y ==1 || y == 6)
					checkPiece = new Pawn(isWhite);
				
				// tests squares without pieces
				else if (y > 1 && y < 6)
					checkPiece = null;
				
				//tests remaining pieces
				else if (x == 0 || x == 7)
					checkPiece = new Rook(isWhite);
				else if (x ==1 || x ==6)
					checkPiece = new Knight(isWhite);
				else if (x == 2 || x == 5)
					checkPiece = new Bishop(isWhite);
				else if (x == 3)
					checkPiece = new Queen(isWhite);
				else
					checkPiece = new King(isWhite);
				try
				{
					if(piece != null && checkPiece != null)
					{
						testBoard.setPiece(x, y, checkPiece);
						if (piece.equals(checkPiece) == false)
						{
							System.out.println(square.getCords() + " has failed piece check.");
							System.out.println("Piece should be: " + checkPiece.toString() + " is " + piece.toString());
							System.out.println();
							rVal = false;
						}
					}
					else if ((piece == null && checkPiece != null) || (piece != null && checkPiece == null))
					{
						System.out.println(square.getCords() + "should be null but is not");
						rVal = false;
					}
				}
				catch (Exception e)
				{
					System.out.println(square.getCords() + " has errored out with an " + e.toString());
				}
			}
		}
		return rVal;
	}
	
	private static boolean verifyColors(Board board)
	{
		boolean isWhite;
		for (int x = 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				isWhite = (x % 2 == y % 2) ? true : false;
				if (Board.getSquare(x, y).isWhite() != isWhite)
					return false;
			}
		}
		
		return true;
	}
}
