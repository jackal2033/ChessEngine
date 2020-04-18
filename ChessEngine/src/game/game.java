package game;

import java.util.Scanner;

import board.Board;
import piece.Piece;

public class game {
	static Board board = new Board();
	public static void main(String[] args)
	{
		runner();
		System.out.println("program terminated");
	}
	
	private static Boolean parseCommand(int [] params, String command)
	{
		if (command.equals("exit"))
			return true;
		try
		{
			String[] chunks = command.split(";");
			String[] halves = chunks[0].split(",");
			params[0] = Integer.parseInt(halves[0]);
			params[1] = Integer.parseInt(halves[1]);
			
		
			halves = chunks[1].split(",");
			params[2] = Integer.parseInt(halves[0]);
			params[3] = Integer.parseInt(halves[1]);
			return true;
		}
		
		catch (Exception e){
			return false;
		}
	}
	public Boolean move(int fromX, int fromY, int toX, int toY)
	{
		//checks boundaries
		if(fromX<0 || fromX > 7 || toX<0 || toX > 7 || fromY<0 || fromY > 7 || toY<0 || toY > 7)
			return false;
		
		//checks if there is not a piece at location
		if(Board.getPiece(fromX,fromY) == null)
			return false;
		
		//checks if squares are same color
		if (Board.getSquare(fromX,fromY).isWhite()==Board.getSquare(toX,toY).isWhite())
			return false;
		
		Piece attacker = Board.getPiece(fromX, fromY);
		
		return attacker.move(board, toX, toY);
	}
	
	public static void runner()
	{
		String input = "";
		/*
		 * Contains each part of users input
		 * 0: fromX
		 * 1: fromY
		 * 2: toX
		 * 3: toY
		 */
		int[] params = new int[4];
		int fromX, fromY, toX, toY;
		Piece attacker;
		Scanner scanner = new Scanner(System.in);
		while (input.equals("exit") == false)
		{
			board.printBoard();
			System.out.println("fromX,fromY;toX,toY:");
			input = scanner.nextLine();
			
			if (parseCommand(params, input) == false)
				continue;
			
			if (Board.getPiece(params[0],params[1]) == null)
				continue;
			if (input.equals("exit")) 
				continue;
			fromX = params[0];
			fromY = params[1];
			toX = params[2];
			toY = params[3];
			
			attacker = Board.getPiece(fromX, fromY);
			System.out.println(attacker.move(board, toX, toY));
			
		}
		scanner.close();
	
	}
	
	/*
	 * compToPlayer
	 * 
	 * Switches the X and Y values to alternate between what Player sees, and what computer sees
	 */
	public void convertView(int fromX, int fromY, int toX, int toY)
	{
		int tmp = fromX;
		fromX=fromY;
		fromY=tmp;
		tmp=toX;
		toX = toY;
		toY=tmp;
	}
	
}
