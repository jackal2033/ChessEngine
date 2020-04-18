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
	
	public Square(Piece piece)
	{
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
