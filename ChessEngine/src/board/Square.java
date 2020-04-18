package board;

import piece.Piece;

public class Square {
	// which color square is W or B
	private Boolean isWhite;
	/*
	 * X: x coordinate of square
	 */
	private int x;
	// Y coordinate of square
	private int y;
	
	/*
	 * index of the Piece[] currently on square
	 */
	Piece piece;
	
	public Square(int x, int y, Piece piece)
	{
		//assigns x/y cords
		this.x = x;
		this.y= y;
		
		/*
		 * Ternary operator to Determine which color
		 * White: X and Y are both even or odd
		 * Black: one cord is even, other is odd
		 */
		this.isWhite = (x % 2 == y % 2)? true : false;
		this.piece = piece;
	}
	
	
	public String toString()
	{
		if (piece == null)
			return "";
		return piece.toString();
	}


	public Piece getPiece() {
		return piece;
	}
	
	public Boolean isWhite() {
		return isWhite;
	}
	
	public int getX() { return x;}
	public int getY() { return y;}

	public void setPiece(Piece piece) { this.piece = piece; }
	public void clearPiece() { piece = null; }
	
	public String getCords()
	{
		return "X " + String.valueOf(x) + ", Y " + String.valueOf(y);
	}
}
