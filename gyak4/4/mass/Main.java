package mass;

import mass.util.Point;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Kerem adja meg hogy mennyi pontot szeretne felvenni:");
		int N = Integer.parseInt(System.console().readLine());
		
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
		
		Point[] points2 = new Point[N];
		for(int i = 0; i < points2.length; i++) {
			System.out.println("Enter " + i + "edik x elem:" );
			double x = Double.parseDouble(System.console().readLine());
			System.out.println("Enter " + i + "edik y elem:" );
			double y = Double.parseDouble(System.console().readLine());
			Point p = new Point(x, y);
			points2[i] = p;
		}
		
		Point center = Point.center(points2);
		System.out.println("Center " + center.toString());
		System.out.println("Center " + center);
		System.out.println("Static idx " + Point.idx);
		
	}
	

}