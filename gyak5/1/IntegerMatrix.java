public class IntegerMatrix {
	
	private int rowNum;
	private int colNum;
	private int[][] data;
	
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