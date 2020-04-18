/**
 * 
 */
package piece;

import board.Board;

/**
 * @author Chase
 * Contains shared data members and logic for pieces, and allows for overloading
 */
public abstract class Piece {
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
	public Piece(Boolean isWhite)
	{
		this.isWhite = isWhite;
	}
	
	public Piece() {
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		return "";
	}
	
	protected abstract boolean canMove(Board board, int toX, int toY);
	
	public Boolean move(Board board, int toX, int toY)
	{
		if (canMove(board, toX, toY) == false)
			return false;
		//move before changing hasMoved
		board.setPiece(toX, toY, this);
		board.clearPiece(x,y);
		
		this.x = toX;
		this.y = toY;
		hasMoved = true;
		
		return true;
	}
	
	public Boolean getIsWhite() { return isWhite; }
	public void setIsWhite(boolean isWhite) { this.isWhite = isWhite; }
	public int getX() { return x; }
	public int getY() { return y; }
	public void setX(int x) {this.x = x;}
	public void setY(int y) { this.y = y;}
	public void setCords(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public boolean getHasMoved() { return hasMoved; }
	public void reset() { hasMoved = false; }
	
	public boolean equals(Piece checkPiece)
	{
		if(checkPiece.getX() == x && checkPiece.getY() == y && checkPiece.getHasMoved() == hasMoved && checkPiece.getIsWhite() == isWhite)
			return true;
		return true;
	}
}
