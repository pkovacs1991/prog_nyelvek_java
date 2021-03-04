public class Average {
	
	public static void main(String[] args) {
		System.out.println("Enter N:");
		int N = Integer.parseInt(System.console().readLine());
		
		
		
		
		//double[] array2 = new double[5];
		double[] array = new double[N];
		for(int i = 0; i < N; ++i) {
			System.out.println("Enter " + i + "edik elem:" );
			array[i] = Double.parseDouble(System.console().readLine());
		}
		
		
		double sum = 0;
		for(int i =0; i < array.length; ++i) {
			sum += array[i];
		}
		double avg = sum / array.length;
		
		double[] diffFromAvg = new double[N];
		
		for(int i = 0; i < array.length; ++i) {
				diffFromAvg[i] = Math.abs(avg - array[i]);
		}
		int minIdx = 0;
		
		for(int i = 1; i< array.length; ++i){
			if(diffFromAvg[i] <= diffFromAvg[minIdx]) {
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