# Cellular Automata
# Drew Higgins

grid = [[0 for x in xrange(10)] for x in xrange(10)] 

class Grid:
	def __init__(self):
		grid[0][0] = 1
		grid[1][0] = 1
		grid[2][3] = 1
		grid[3][4] = 1
		grid[4][2] = 1
		grid[4][5] = 1
		grid[4][9] = 1
		grid[5][1] = 1
		grid[5][3] = 1
		grid[5][4] = 1
		grid[5][7] = 1
		grid[6][2] = 1
		grid[6][8] = 1
		grid[6][9] = 1
		grid[7][1] = 1
		grid[7][9] = 1
		grid[8][0] = 1
		grid[8][9] = 1
		grid[9][9] = 1
	def getNumAliveNeighbors(self,r,c):
		numNeighbors = 0
		if(r-1 > 0 and c-1 > 0):
			if(grid[r-1][c-1] = 1):
				numNeighbors+=1
		if(c-1 > 0):
			if(grid[r][c-1] = 1):
				numNeighbors+=1
		if(r+1 < 9 and c-1 > 0):
			if(grid[r+1][c-1] = 1):
				numNeighbors+=1
		if(r-1 > 0 and c > 0):
			if(grid[r-1][c] = 1):
				numNeighbors+=1
		if(r+1 < 9):
			if(grid[r+1][c] = 1):
				numNeighbors+=1
		if(r-1 > 0 and c+1 < 9):
			if(grid[r-1][c+1] = 1):
				numNeighbors+=1
		if(c+1 < 9):
			if(grid[r][c+1] = 1):
				numNeighbors+=1
		if(r+1 < 9 and c+1 < 9):
			if(grid[r+1][c+1] = 1):
				numNeighbors+=1
		return numNeighbors
	def printGrid(self):
		for r in grid:
			print ""
			for c in r:
				print str(c) + " ",
# Main
g = Grid()
# input_data = input("Enter input: ")
input_data = [2, 2, 4, 2, 3, 4, 1, 5, 2]
rules = [input_data[i] for i in range(1, input_data[0] + 1)]
print rules
