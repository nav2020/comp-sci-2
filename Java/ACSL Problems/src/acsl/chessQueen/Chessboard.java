package acsl.chessQueen;
import java.util.*;

public class Chessboard {
	private ArrayList<Position> board = new ArrayList<Position>();
	private ArrayList<Position> pieces = new ArrayList<Position>();
	
	public Chessboard(){
		for(int i = 1; i <= 8; i++){
			for(int j = 1; j <= 8; j++){
				board.add(new Position(i, j));
			}
		}
	}
	public void addPiece(Position p){
		for(Position x : board){
			if (x == p){
				x.insertPiece();
			}
		}
		pieces.add(p);
	}
	public int size() {
		return board.size();
	}
	public ArrayList<Position> getList(){
		return board;
	}
	public ArrayList<Position> getPieces(){
		return pieces;
	}
}
