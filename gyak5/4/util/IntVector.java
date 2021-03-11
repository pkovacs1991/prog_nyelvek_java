package util;

import java.util.Arrays;

public class IntVector {
    int[] numbers;

    public IntVector(int[] numbers) {
		this.numbers = new int[numbers.length];
		/*for(int i = 0; i< numbers.length; i++) {
			this.numbers[i] = numbers[i];
        }*/
		this.numbers = Arrays.copyOf(numbers, numbers.length);
		
		//this.numbers = numbers;
    }

    public void add(int n) {
        for (int i = 0; i < numbers.length; i++)
            numbers[i] += n;
    }

    public String toString() {
        //return Arrays.toString(numbers);
		
		StringBuilder sb = new StringBuilder();
		String delim = "";
		sb.append("[");
		for(int n : numbers) {
			sb.append(delim);
			sb.append(n);
			delim = " ";
		}
		sb.append("]");
		return sb.toString();
    }
}