package com.home.voleti;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
@@ Author: Voleti Murthy @@
**
*/
/*
@@ SudokuBoard  Test class to test the Sudoku Board game and its methods  @@
**
*/

public class SudokuBoardTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		
		SudokuBoard myGame = new SudokuBoard(4);
		myGame.initiateSudokuBoard();
		myGame.generateRandomSudokuBoard();
		myGame.solveTheSudokuBoard();
		
		// fail("Not yet implemented");
	}

}
