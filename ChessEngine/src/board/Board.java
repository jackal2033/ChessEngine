package board;


import piece.*;

public class Board {
	static Square[][] board = new Square[8][8];
	
	public Board() {
		Boolean isWhite;
		Piece newPiece;
		
		for (int x = 0; x < 8; x++)
		{
			for(int y = 0; y < 8; y++)
			{
				//checks if a Piece will be placed on board
				if(y < 2 || y > 5)
				{
					/*
					 * Determines which Color piece will be
					 * Black: y < 2
					 * White: else
					 */
					isWhite= (y < 2)? false : true;
					
					/*
					 * Determines which Piece will be placed based on Y and X cords
					 */
					if (y == 1 || y == 6)
						newPiece = new Pawn(isWhite, x, y);
					else
					{
						if (x == 0 || x == 7)
							newPiece = new Rook(isWhite, x, y);
						else if (x ==1 || x ==6)
							newPiece = new Knight(isWhite, x, y);
						else if (x == 2 || x == 5)
							newPiece = new Bishop(isWhite, x, y);
						else if (x == 3)
							newPiece = new Queen(isWhite, x, y);
						else
							newPiece = new King(isWhite, x, y);
					}
					
					board[x][y] = new Square(x,y,newPiece);
				}
				else
					board[x][y] = new Square(x,y, null);
			}
		}
	}
	
	
	public void printBoard()
	{
		String padded = "";
		
		for (int x = 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				padded = String.format("%-" + 4 + "s", getSquare(y,x).toString());
				System.out.print(padded);
			}
			System.out.println();
		}
	}
	
	public static Square getSquare(int x, int y)
	{
		return board[x][y];
	}
	
	
	
	public static Piece getPiece(int x, int y)
	{
		return getSquare(x,y).getPiece();
	}
	
	public void printLayout()
	{
		char color;
		for(int x= 0; x < 8; x++)
		{
			for (int y = 0; y < 8; y++)
			{
				color = (board[y][x].isWhite()) ? 'W' : 'B';
				System.out.print(color);
			}
			System.out.println();
			
		}
	
	}
}
