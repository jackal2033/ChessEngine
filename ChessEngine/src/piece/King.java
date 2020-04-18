package piece;

import board.Board;

public class King extends Piece {

	public King(Boolean isWhite,int x,int y) {
		super(isWhite, x, y);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		if (isWhite)
			return "KI";
		return "ki";
	}
	public boolean canMove(Board board, int toX, int toY)
	{
		return true;
	}
}
