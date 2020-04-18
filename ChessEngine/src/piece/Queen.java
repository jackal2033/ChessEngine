package piece;

import board.Board;

public class Queen extends Piece {

	public Queen(Boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		if (isWhite)
			return "Q";
		return "q";
	}
	public boolean canMove(Board board, int toX, int toY)
	{
		return true;
	}
}
