package piece;

import board.Board;

public class Bishop extends Piece {

	public Bishop(Boolean isWhite,int x,int y) {
		super(isWhite, x, y);
		// TODO Auto-generated constructor stub
	}

	public String toString()
	{
		if (isWhite)
			return "B";
		return "b";
	}
	public Boolean move(Board board, int toX, int toY)
	{
		hasMoved = true;
		return false;
	}
}
