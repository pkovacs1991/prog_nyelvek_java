/**
 * @author pkovacs
 * @since 2.0
 * @version 2.0

*/

public class IntegerMatrix {
	
	private int rowNum;
	private int colNum;
	private int[][] data;
	
	
	/**
		* <p> This is the constructor of the IntegerMatrix class</p>
		* <p> Store the given 1D array as a matrix </p> 
		* @param rowNum number of rows 
		* @param colNum number of columns
		* @param linearData integers stored in 1D array 
		* @since 1.0
	*/
	public IntegerMatrix(int rowNum, int colNum, int[] linearData) {
		this.rowNum = rowNum;
		this.colNum = colNum;
		data = new int[rowNum][colNum];
		for(int i = 0; i < linearData.length; i++) {
			int row = (int) Math.floor(i / colNum);
			int col = i % colNum;
			System.out.println(i + " " + row + " " + col);
			data[row][col] = i;
		}
		
		//this.linearData = linearData;
	
	}
	
	/**
		* <p> Return the elements of the matrix to string withg proper formatting </p>
		* <p> Formatting: rows delimited with ; columns delimited with ,</p>
		* @return the matrix items converted to String
		* @since 1.0
		
	*/
	public String toString() {
		String result = "";
		//"1,2,3;4,5,6"
		String rowDelim = "";
		String colDelim = "";
		for(int[] row : data) {
			result += rowDelim;
			rowDelim = ";";
			for(int elem : row) {
				result += colDelim;
				colDelim = ",";
				result += elem;
			}
			colDelim = "";
			
		}
		return result;
		
	}
	
		/**
		* <p> Return the elements of the matrix to string withg proper formatting </p>
		* <p> Formatting: rows delimited with ; columns delimited with ,</p>
		* @return the matrix items converted to String
		* @since 1.0
		
	*/
	public String toString2() {
		StringBuilder sb = new StringBuilder();
		String rowDelim = "";
		String colDelim = "";
		String result = "";
		
		for(int[] row : data) {
			sb.append(rowDelim);
			rowDelim = ";";
			for(int elem : row) {
				sb.append(colDelim);
				colDelim = ",";
				sb.append(elem);
			}
			colDelim = "";
		}
		
		return sb.toString();
	}
	

}