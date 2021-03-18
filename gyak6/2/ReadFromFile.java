import java.io.*;

public class ReadFromFile{

	public static void main(String[] args) {
		//File file = new File("in.txt");
		//FileReader fr = new FileReader(file);
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			FileReader fr = new FileReader("in.txt");
			in = new BufferedReader(fr);
			String thisLine = null;
			out = new PrintWriter(new BufferedWriter(new FileWriter("foo.out")));
			while( (thisLine = in.readLine()) != null) {
				String[] numbers = thisLine.split(",");
				int sum = 0;
				for(String strNumber : numbers) {
					int number = Integer.parseInt(strNumber);
					sum+= number;
				}
				//System.out.println(sum);
				out.println(sum);
				
				out.flush();
				
			}
			
 		} catch (FileNotFoundException ex) {
			System.err.println("file not found");
		} catch (IOException ex) {	
			System.err.println("error during read");
		} finally {
			try{
				in.close();
				out.close();
			} catch (IOException ex) {
				
			}
		}
		
	}



}