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
@@ SingleCell Test class to test the SingleCell calls and its methods  @@
**
*/
public class SingleCellTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SingleCell mycell = new SingleCell(4);
		mycell.setRowIndex(0);
		mycell.setColIndex(0);
		mycell.toString();
		
		fail("Not yet implemented");
	}

}
