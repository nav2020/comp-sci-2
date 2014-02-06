package acsl.chessQueen;

import java.util.ArrayList;

public class Position {
	private int xPos;
	private int yPos;
	private boolean hasPiece;
	
	public Position(int x, int y){
		xPos = x;
		yPos = y;
		hasPiece = false;
	}
	
	public int getX(){
		return xPos;
	}
	public int getY(){
		return yPos;
	}
	public boolean hasPiece(){
		return hasPiece;
	}
	public void insertPiece(){
		hasPiece = true;
	}
	public void setX(int x){
		xPos = x;
	}
	public void setY(int y){
		yPos = y;
	}
	public void setCoordinates(int x, int y){
		xPos = x;
		yPos = y;
	}
	public void reset(){
		xPos = 0;
		yPos = 0;
	}
	public void print(){
		System.out.println(xPos +","+ yPos);
	}
	public ArrayList<Position> findAvailableMoves(Position p){
		ArrayList<Position> capture = new ArrayList<Position>();
		ArrayList<Position> moves = new ArrayList<Position>();
			for(int i = 1;i <= 8;i++){
				capture.add(new Position(p.getX(),i));
			}
			for(int i = 1; i <= 8;i++){
				capture.add(new Position(i,p.getY()));
			}
			for(int i = 1; i <= 8;i++){
				capture.add(new Position(p.getX() + i,p.getY() + i));
			}
			for(int i = 1; i <= 8;i++){
				capture.add(new Position(p.getX() - i,p.getY() + i));
			}
			for(int i = 1; i <= 8;i++){
				capture.add(new Position(p.getX() - i,p.getY() - i));
			}
			for(int i = 1; i <= 8;i++){
				capture.add(new Position(p.getX() + i,p.getY() - i));
			}
			for(Position a: capture){
				if((a.getX() > 0 && a.getX() < 9) && (a.getY() > 0 && a.getY() < 9)){
					if(a.getX() == p.getX() && a.getY() == p.getY()){
						
					}
					else{
						moves.add(a);
					}
				}
			}
			return moves;
	}
}
