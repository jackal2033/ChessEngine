/**
 * 
 */
package piece;

import board.Board;

/**
 * @author Chase
 * Contains shared data members and logic for pieces, and allows for overloading
 */
public class Piece {
	Boolean isWhite;
	int x,y;
	Boolean hasMoved = false;
	
	/*
	 * Constructor for Piece
	 * 
	 * @param isWhite: true-> white; false-> black
	 * @param x: x coord
	 * @param y: y coord
	 */
	public Piece(Boolean isWhite,int x,int y)
	{
		this.isWhite = isWhite;
		this.x = x;
		this.y = y;
	}
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "";
	}
	
	public Boolean canMove(Board board, int toX, int toY)
	{
		return isWhite == Board.getPiece(toX, toY).getIsWhite();
	}
	
	public Boolean move(Board board, int toX, int toY)
	{
		hasMoved = true;
		
		
		return false;
	}
	
	public Boolean getIsWhite() { return isWhite; }
	public int getX() { return x; }
	public int getY() { return y; }
	public boolean getHasMoved() { return hasMoved; }
	public boolean equals(Piece checkPiece)
	{
		if(checkPiece.getX() == x && checkPiece.getY() == y && checkPiece.getHasMoved() == hasMoved && checkPiece.getIsWhite() == isWhite)
			return true;
		return true;
	}
}
