package piece;

import board.Board;

public class Knight extends Piece {

	public Knight(Boolean isWhite,int x,int y) {
		super(isWhite, x, y);
		// TODO Auto-generated constructor stub
	}
	
	public String toString()
	{
		if (isWhite)
			return "KN";
		return "kn";
	}
	public Boolean move(Board board, int toX, int toY)
	{
		hasMoved = true;
		return false;
	}
}
