package circle;
import java.io.*;
import circle.utils.Point;

public class Circle {
	private double x = 0;
	private double y = 0;
	private double radius = 1;

	public Circle(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Circle radius: " + radius + " not positive");
		}
		this.radius = radius;
	}
	
	public Point getCenter() {
		Point center = new Point(x,y);
		
		//Point center = new Point();
		//center.setX(x);
		//center.setY(y);
		return center;
	}
	
	public static Circle readFromFile(String fileName)  {
		BufferedReader in = null;
		try{
		FileReader fr = new FileReader(fileName);
		in = new BufferedReader(fr);
		double x = Double.parseDouble(in.readLine()); 
		double y = Double.parseDouble(in.readLine()); 
		double radius = Double.parseDouble(in.readLine()); 
			in.close();
			return new Circle(x, y, radius);
		} catch (FileNotFoundException ex) {
				System.err.println("file not found");
		} catch (IOException ex) {	
				System.err.println("error during read");
		}  finally {
			try{
				in.close();
				
			} catch (Exception ex) {
				
			}
			
		}
			
		return new Circle(0, 0, 1);

	}
	
	public void saveToFile(String fileName) throws FileNotFoundException,IOException {
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
		out.println(x);
		out.println(y);
		out.println(radius);
		out.flush();
	}
	

	public String toString() {
		return "(" + x + "," + y + "," + radius + ")";
	}

}
