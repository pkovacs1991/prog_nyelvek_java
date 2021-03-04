import utils.Point;

public class PointMain {

	public static void main(String[] args) {
		
		/*double x1 = Double.parseDouble(System.console().readLine());
		double y1 = Double.parseDouble(System.console().readLine());
		double x2 = Double.parseDouble(System.console().readLine());
		double y2 = Double.parseDouble(System.console().readLine());
		double x3 = Double.parseDouble(System.console().readLine());
		double y3 = Double.parseDouble(System.console().readLine());
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		Point[] points = {p1,p2,p3};*/
		
		Point[] points2 = new Point[3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter " + i + "edik x elem:" );
			double x = Double.parseDouble(System.console().readLine());
			System.out.println("Enter " + i + "edik y elem:" );
			double y = Double.parseDouble(System.console().readLine());
			Point p = new Point(x, y);
			points2[i] = p;
		}
		
		double centerX = 0, centerY = 0;
		for(int i = 0; i < 3; ++i) {
			centerX += points2[i].getX();
			centerY += points2[i].getY();
			
		}
		
		centerX /= 3; // centerX = centerX / 3;
		centerY /= 3;
		
		Point center = new Point(centerX, centerY);
		System.out.println("Center " + center.toString());
		System.out.println("Center " + center);
		
	}
	

}