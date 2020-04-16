/**
 * 
 */
package piece;

import board.Board;
import board.Square;

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
	
	public Boolean getIsWhite()
	{
		return isWhite;
		
	}
}
