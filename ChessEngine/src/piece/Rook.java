package piece;

import board.Board;

public class Rook extends Piece {

	public Rook(Boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		if (isWhite)
			return "R";
		return "r";
	}
	public boolean canMove(Board board, int toX, int toY)
	{
		return true;
	}
}
