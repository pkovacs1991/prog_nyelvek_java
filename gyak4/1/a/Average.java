public class Average {
	
	public static void main(String[] args) {
		//double[] array2 = new double[5];
		double[] array = {1.3, 5.2, 7.7, -2.3, 23.45};
		double sum = 0;
		for(int i =0; i < array.length; ++i) {
			sum += array[i];
		}
		double avg = sum / array.length;
		double[] diffFromAvg = {0,0,0,0,0};
		for(int i = 0; i < array.length; ++i) {
				diffFromAvg[i] = Math.abs(avg - array[i]);
		}
		int minIdx = 0;
		
		for(int i = 1; i< array.length; ++i){
			if(diffFromAvg[i] < diffFromAvg[minIdx]) {
				minIdx = i;
			}
		}
		
		/*double min = diffFromAvg[0];
		for(int i = 1 ; i < array.length; ++i  ) {
			if(diffFromAvg[i] < min) {
				min = diffFromAvg[i];
			}
		}*/
		
		System.out.println("Az atlag: " + avg + " a legkozelebbi elem" + array[minIdx] );
		
	}

}