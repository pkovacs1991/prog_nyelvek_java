package utils;

public class Point {
	
	private double x,y;
	public static int idx = 1;
	private int currentIdx;
	public Point(){
		currentIdx = idx++;
		System.out.println("curr " + currentIdx);
		System.out.println("stat idx " + idx);
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
		currentIdx = idx++;
		System.out.println("curr " + currentIdx);
		System.out.println("stat idx " + idx);
	}
	
	
	public void move(double dx, double dy) {

		x+=dx;
		y+=dy;
	}
	
	public void mirror(double cx, double cy) {
		x = 2*cx - x;
		y = 2*cy - y;
	}
	
	public void mirror(Point p) {
		x = 2*p.x - x;
		y = 2*p.y - y;
	}
	
	public double distance(Point p) {
		double dx = x - p.x;
		double dy = y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
	
	public static Point center(Point[] points) {
		int length = points.length;
		double centerX = 0, centerY = 0;
		for(int i = 0; i < length; ++i) {
			centerX += points[i].getX();
			centerY += points[i].getY();
			
		}
		
		centerX /= length; // centerX = centerX / 3;
		centerY /= length;
		
		return new Point(centerX, centerY);
	}
	
	
	
	public double getX() {
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
		
	@Override
	public String toString() {
		return "id: " + currentIdx + " (" + x + "," + y + ")";
		
	}
	
}