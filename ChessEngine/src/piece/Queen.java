package piece;

import board.Board;

public class Queen extends Piece {

	public Queen(Boolean isWhite,int x,int y) {
		super(isWhite, x, y);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		if (isWhite)
			return "Q";
		return "q";
	}
	public Boolean move(Board board, int toX, int toY)
	{
		hasMoved = true;
		return false;
	}
}
