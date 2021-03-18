package circle;
import java.io.*;
import circle.utils.Point;

class CircleMain{
		
		public static void main(String[] args) {
			try {
				Circle circle = Circle.readFromFile("circle.txt");
				Circle circle2 = Circle.readFromFile("circle222.txt");
				
				circle.saveToFile("circle.out");
				
				System.out.println(circle);
				System.out.println(circle2);
			} catch (FileNotFoundException ex) {
				System.err.println("file not found");
			} catch (IOException ex) {	
				System.err.println("error during read");
			} 
			
			
		}
		
	
}