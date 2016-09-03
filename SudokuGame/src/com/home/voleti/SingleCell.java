package com.home.voleti;

/*
@@  Author Voleti Murthy @@
**
**
*/

/*
@@  Sudoku Board, SingleCell class that holds value and the position of the cell
**  on the Board
**  
**
*/
public class SingleCell {	
	    int value = -1;
	    int rowIndex = 0;
	    int colIndex = 0;
		boolean isEditable = true;

	    public SingleCell(int value){
	        this.value = value;
	    }
	    
	    public SingleCell(int value, int row, int col){
	        this.value = value;
	        this.rowIndex = row;
	        this.colIndex = col;
	    }
       
	    public int getRowIndex() {
			return rowIndex;
		}

		public void setRowIndex(int rowIndex) {
			this.rowIndex = rowIndex;
		}

		public int getColIndex() {
			return colIndex;
		}

		public void setColIndex(int colIndex) {
			this.colIndex = colIndex;
		}
	    
	    public int getValue() {
			return value;
		}

		public void setValue(int value) {
			this.value = value;
		}

		public void setEditable(boolean isEditable) {
			this.isEditable = isEditable;
		}

		public boolean isPresent(){
	        if(value != -1)
	        	return true;
	        else 
	        	return false;
	    }
	    public boolean isEditable(){
	        return isEditable;
	    }
	    
	    @Override
	    /*
	    @@  toString() method Overriding to print values of the cell
	    ** 
	    **
	    */
	    public String toString() {
	      return (new StringBuilder(" [ ").append(this.getRowIndex())
	          .append(" ] [ ").append(this.getColIndex())
	          .append(" ] = ").append(this.getValue())
	          .append("\n")
	          ).toString();
	    }

	}
