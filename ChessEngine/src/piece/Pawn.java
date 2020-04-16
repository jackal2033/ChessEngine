package piece;

import board.Board;

public class Pawn extends Piece {

	public Pawn(Boolean isWhite,int x,int y) {
		super(isWhite, x, y);
	}
	
	public String toString()
	{
		if (isWhite)
			return "P";
		return "p";
	}
	
	public Boolean move(Board board, int toX, int toY)
	{
		if (canMove(board, toX, toY) == false)
			return false;
		hasMoved = true;
		
		return true;
	}
	
	public Boolean canMove(Board board, int toX, int toY)
	{ 
		int yMove = Math.abs(y - toY);
		int xMove = Math.abs(x - toX);
		//used to calculate next two spots
		int diff = (toY > y) ? 1 : -1;
		//check if range of movement is illegal
		
		if (xMove > 2 || yMove > 2)
			return false;
		
		if (yMove == 2 && hasMoved == true)
			return false;
		
		//check color
		if (Board.getPiece(toX, toY) != null && isWhite == Board.getPiece(toX, toY).getIsWhite())
			return false;
		
		//based on direction, check if move is valid
		//check if moving vertically
		if(toX == x && yMove == 1)
			if (Board.getPiece(toX, toY) != null)
				return false;
		else
			if (Board.getPiece(toX, toY + diff) != null || Board.getPiece(toX, toY + diff + diff) != null  )
				return false;
		if (xMove == 1 && yMove == 1)
				if (isWhite == Board.getPiece(toX, toY).isWhite || Board.getPiece(toX, toY) == null)
					return false;
		return true;
	}

}
