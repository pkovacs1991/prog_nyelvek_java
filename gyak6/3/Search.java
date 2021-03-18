import java.io.*;

public class Search {
	
	public static void main(String[] args) {
		BufferedReader in = null;
		try {
			String fileName = args[0];
			BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the string what you want to search");
			String pattern = consoleReader.readLine();
			FileReader fr = new FileReader(fileName);
			in = new BufferedReader(fr);
			String thisLine = null;
			int counter = 0;
			while( (thisLine = in.readLine()) != null) {
				if (thisLine.contains(pattern)) {
					counter++;
				}
				
				
			}
			
		System.out.println(pattern + " contains " + counter + " times");
		} catch (FileNotFoundException ex) {
			System.err.println("file not found");
		} catch (IOException ex) {	
			System.err.println("error during read");
		} finally {
			try{
				in.close();
				
			} catch (IOException ex) {
				
			}
		}
		
	}
	

}