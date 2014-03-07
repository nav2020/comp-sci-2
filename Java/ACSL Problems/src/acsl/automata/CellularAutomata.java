package acsl.automata;

public class CellularAutomata {
	public static boolean[][] grid = new boolean[10][10];
	public static void main(String[] args) {
		grid[0][0] = true;
		grid[1][0] = true;
		grid[2][3] = true;
		grid[3][4] = true;
		grid[4][2] = true;
		grid[4][5] = true;
		grid[4][9] = true;
		grid[5][1] = true;
		grid[5][3] = true;
		grid[5][4] = true;
		grid[5][7] = true;
		grid[6][2] = true;
		grid[6][8] = true;
		grid[6][9] = true;
		grid[7][1] = true;
		grid[7][9] = true;
		grid[8][0] = true;
		grid[8][9] = true;
		grid[9][9] = true;
		
		
	}
	
	public static int getNumNeighbors(int r, int c){
		int neighbors = 0;
		if(grid[r-1][c-1]){
			neighbors++;
		}
		if(grid[r-1][c]){
			neighbors++;
		}
		if(grid[r-1][c+1]){
			neighbors++;
		}
		if(grid[r][c-1]){
			neighbors++;
		}
		if(grid[r][c+1]){
			neighbors++;
		}
		if(grid[r+1][c-1]){
			neighbors++;
		}
		if(grid[r+1][c]){
			neighbors++;
		}
		if(grid[r+1][c+1]){
			neighbors++;
		}
		return neighbors;
	}

}
