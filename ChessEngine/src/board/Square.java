package board;

import piece.Piece;

public class Square {
	// which color square is W or B
	private Boolean white;
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
		 * Determines which color
		 * White: X and Y are both even or odd
		 * Black: one cord is even, other is odd
		 */
		if (x%2 == y%2)
			this.white= true;
		else
			this.white= false;
		
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
		return white;
	}
	
	public int getX() { return x;}
	public int getY() { return y;}

	public void setPiece(Piece piece) { this.piece = piece; }
}
