package acsl.chessQueen;
import java.util.*;

public class Chess {

	/**
	 * @author Drew Higgins
	 * ACSL Chess Queen
	 * 10/31/2013
     *           _
     *          /))
     *       __(((__
     *     .' _`""`_`'.
     *    /  /\\  /\\  \
     *   |  /)_\\/)_\\  |
     *   |  _  _()_  _  |
     *   |  \\/\\/\\//  |
     *    \  \/\/\/\/  /
     *     '.___..___.'
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Chessboard board = new Chessboard();
		System.out.println("Enter your input: ");
		String input = reader.nextLine();
		input = input.replaceAll(",", "");
		
		for(int i = 0; i < input.length() - 2; i++){
			if(input.charAt(i+1) != 0 && input.charAt(i+2) != 0){
				board.addPiece(new Position(i, (i+1)));
			}
		}
		ArrayList<Position> chessBoard = board.getList();
		ArrayList<Position> pieceList = board.getPieces();
		for(Position p : chessBoard){
			ArrayList<Position> availableCaptures = p.findAvailableMoves(p);
			boolean hasAllThePieces = false;
			if(pieceList.containsAll(availableCaptures)){
				hasAllThePieces = true;
			}
			else{
				hasAllThePieces = false;
				break;
			}
			if(hasAllThePieces){
				System.out.println("(" +p.getX()+ "," +p.getY()+ ")");
				return;
			}
		}
		
		System.out.println("None");
	}

}
