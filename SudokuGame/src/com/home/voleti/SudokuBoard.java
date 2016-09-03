package com.home.voleti;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
@@ Author : Voleti Murthy @@
*/

/*
@@  Sudoku Board main class contains all the methods to initiate, generate and solve the puzzle
**
**
*/
public class SudokuBoard {

		// the default size of Suduko board is 9
	    final static int DEFAULT_SIZE = 9;
	    private int size = 9;
	    private SingleCell [][] totalCells;
	    
	    // private Set<SingleCell> rowSet;   
	    
	    // To check the availability of rows and collumns indexes    
	    private ArrayList<Integer> busyIndices;    

	    /*
	     @@ Constructor of the Sudoku Board with initiates the size of board @@
	     */
	     public SudokuBoard(int size) {
	    	 this.size = size;
	    	 totalCells = new SingleCell[size][size];
	    	 // rowSet = new HashSet<SingleCell>(size);
	    	 busyIndices = new ArrayList<Integer>(size * size);
	     }

	     /*
	     @@ Initiate the in the Sudoku Board with -1 to begin with @@
	     */
	     public void initiateSudokuBoard(){
	    	 
	    	 int value = -1;	    	 
	    	 for (int i = 0; i < this.size; i++) {
	    		  for (int j = 0; j < this.size; j++) {
	    			 SingleCell tempCell = new SingleCell(value, i, j);
	    			 totalCells[i][j] = tempCell;
	    		 }
	    	 }
	    	 System.out.println("Initiated SudokuBoard");    	 
	     }
	   
	     /*
	     @@ Generate some random numbers into the Sudoku Board, so that each time a new
	     **  puzzle will be generated, to play @@
	     */
		public void generateRandomSudokuBoard() {
	    	 int indexRow = 0;
	    	 int indexColl = 0;
	    	 int index = 0;
	    	 
	    	 // Let's generate some random numbers, and place them on the board
	    	 // if the size of the board is 4, then let's generate 4 numbers to place them on the board
	    	 
    		 for (int i = 0; i < this.size; i++) {
	    		 indexRow = (int)(Math.random() * this.size);
	    		 indexColl = (int)(Math.random() * this.size);
	    		 index = indexRow*10 + indexColl;
	    		 busyIndices.add(index);
	    		 SingleCell littleCell = new SingleCell(indexRow+1, indexRow, indexColl);
	    		 totalCells[indexRow][indexColl] = littleCell;
	    	    }
	    	
	    	 Iterator<Integer>  myIt = busyIndices.iterator();
	    	    while( myIt.hasNext()) {
	    	    	myIt.next();
	    	    }
	    	    System.out.println("generate random SudokuBoard");
	    	 	displayTheSudokuBoard(totalCells);    	 
	    	 
	     }
	     
		/*
	     @@ solving the Sudoku Board row by row and then column by column @@
	     **
	     */
	     public void solveTheSudokuBoard() {
	    	 
	    	 // lets check the value of each cell and fill them accordingly
	    	 for (int i = 0; i < this.size; i++){
	    		 Set <Integer> rowSet = new HashSet<Integer>(this.size);
	    		 	/* for (int j = 0; j < this.size; j++) {
	    			 	int value = totalCells[i][j].getValue();
	    			 	if ( ! rowSet.contains(value) ) {
				    		rowSet.add( value);
	    			 	}
	    		 	} // end of for loop j
	    		 	*/
	    			
	    		  // Now, lets check the values in the row set and add the missing numbers	    		 
	    		 	for (int k = 0; k < this.size; k++) {
	    			 	int getValue = totalCells[i][k].getValue();
	    			 	int count = 1;
	    			 	// If the value is  -1, then it empty, let's fill with valid value
	    			 	if ( getValue == -1 )  {
	    			 		for (int l = 0; l < this.size; l++) {   			 			 
	    			 				if ( ! rowSet.contains(count) ) {
	    			 					rowSet.add( count);
	    			 					totalCells[i][k].setValue(count);
	    			 					totalCells[i][k].setRowIndex(i);
	    			 					totalCells[i][k].setRowIndex(k);
	    			 					break;
	    			 				}
	    			 				count++;
	    			 			} // end of for loop which sets new count
	    			 		}  // if value is invalid -1;
	    		 		} // end of for loop k
	    	 	} // end of for loop i
	    	 
	    	 System.out.println("Solving the puzzle SudokuBoard");
	    	 displayTheSudokuBoard(totalCells);
	     }
	      
	     /*
	     @@ Display the values in the Sudoku Board, using the overloaded toString() method @@
	     **
	     */
	     private void displayTheSudokuBoard(SingleCell[][] allCells) {
				// display the contents of the 
	    	 	for (int i = 0; i < this.size; i++) {
	    		 
	    		 for (int j = 0; j < this.size; j++) {
	    			 System.out.print ( allCells[i][j].toString());
	    		 }
	    	  }				
			}
	}
