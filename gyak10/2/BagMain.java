import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BagMain{

	public static void main(String[] args) {
		File input = new File("input.txt");
		//File input = new File(args[0]);
		Bag<String> bag = new Bag<>();
		try(Scanner sc = new Scanner(input)) {
			while(sc.hasNextLine()) {
				bag.add(sc.nextLine());
				
			}
			
			
		} catch (FileNotFoundException ex) {
			System.out.println("print.txt not found");
			
		}
		System.out.println("Word statistics " + bag);
	}


}