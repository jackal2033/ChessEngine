package piece;

import board.Board;

public class Bishop extends Piece {

	public Bishop(Boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		if (isWhite)
			return "B";
		return "b";
	}
	
	public boolean canMove(Board board, int toX, int toY)
	{
		return true;
	}
}
