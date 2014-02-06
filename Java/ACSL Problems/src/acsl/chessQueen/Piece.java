package acsl.chessQueen;

public class Piece {
	private Position location;
	public Piece(Position P){
		location = P;
	}
	
	public Position getPosition(){
		return location;
	}
}
