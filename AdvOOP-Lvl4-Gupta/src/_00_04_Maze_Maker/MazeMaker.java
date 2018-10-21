package _00_04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
		Cell rand = maze.cells[randGen.nextInt(w)][randGen.nextInt(h)];
		
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(rand);
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
		currentCell.setBeenVisited(true);
		//B. check for unvisited neighbors using the cell
		ArrayList<Cell> notVisited = getUnvisitedNeighbors(currentCell);
		System.out.println(notVisited.size());
		if(notVisited.size() != 0) {
			Cell rand2 = notVisited.get(randGen.nextInt(notVisited.size()));
			uncheckedCells.push(rand2);
			removeWalls(currentCell, rand2);
			currentCell = rand2;
			currentCell.setBeenVisited(true);
			selectNextPath(currentCell);
			
		} else if (notVisited.size() == 0) {
			if(uncheckedCells.isEmpty() == false) {
				currentCell = uncheckedCells.pop();
				selectNextPath(currentCell);
		}
		}
	}
		//C. if has unvisited neighbors,
		
			//C1. select one at random.
			
			//C2. push it to the stack
		
			//C3. remove the wall between the two cells

			//C4. make the new cell the current cell and mark it as visited
			
			
		//D. if all neighbors are visited
		
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
	
				// D1c. call the selectNextPath method with the current cell

				
			
		

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2) {
		if (c1.getX() == c2.getX()) {
			if (c1.getY() > c2.getY()) {
				c2.setSouthWall(false);
				c1.setNorthWall(false);
			} else {
				c2.setNorthWall(false);
				c1.setSouthWall(false);
			}
		}
		else {
			if (c1.getX() > c2.getX()) {
				c1.setWestWall(false);
				c2.setEastWall(false);
			} else {
				c1.setEastWall(false);
				c2.setWestWall(false);
			}
		}
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		ArrayList<Cell> unvisitedNeighbors = new ArrayList<>();
		Cell empty = new Cell(-2, -5);
		Cell left = empty;
		Cell right = empty;
		Cell up = empty;
		Cell down = empty;
		
		if(c.getX() - 1 >= 0) {
			left = maze.cells[(c.getX() - 1)][c.getY()];
		}
		
		if(c.getX() + 1 <= (width - 1)) {
			right = maze.cells[(c.getX() + 1)][c.getY()];
		}
		
		if(c.getY() - 1 >= 0) {
			up = maze.cells[c.getX()][(c.getY() - 1)];
		}
		
		if(c.getY() + 1 <= (height - 1)) {
			down = maze.cells[c.getX()][(c.getY()+1)];
		}
		
		if((left != empty)&&(left.hasBeenVisited() == false)) {
			unvisitedNeighbors.add(left);
		}
		
		if((right.hasBeenVisited() == false) && (right != empty)) {
			unvisitedNeighbors.add(right);
		}
		
		if((up.hasBeenVisited() == false) && (up != empty)) {
			unvisitedNeighbors.add(up);
		}
		
		if((down.hasBeenVisited() == false)&&(down != empty)) {
			unvisitedNeighbors.add(down);
		}
		
		return unvisitedNeighbors;
	}
}