import java.util.Arrays;

public class Swap {

	public static <T> void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
	}
	
	
	public static void main(String[] args ) {
		Integer[] arr1 = {1,2 , 3 , 4};
		swap(arr1, 0, 2);
		System.out.println(Arrays.toString(arr1));
		
		String[] arr2 = {"a" , "b", "c" , "d"};
		swap(arr2, 1,3);
		System.out.println(Arrays.toString(arr2));
	}

}