package piece;

import board.Board;

public class Knight extends Piece {

	public Knight(Boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		if (isWhite)
			return "KN";
		return "kn";
	}
	public boolean canMove(Board board, int toX, int toY)
	{
		return true;
	}
}
