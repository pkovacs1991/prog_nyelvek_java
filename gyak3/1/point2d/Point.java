package point2d;

class Point {
	
	double x,y;
	public Point(){
		
	}
	
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	
	 void move(double dx, double dy) {
		x+=dx;
		y+=dy;
	}
	
	 void mirror(double cx, double cy) {
		x = 2*cx - x;
		y = 2*cy - y;
	}
	
	 void mirror(Point p) {
		x = 2*p.x - x;
		y = 2*p.y - y;
	}
	
	 double distance(Point p) {
		double dx = x - p.x;
		double dy = y - p.y;
		return Math.sqrt(dx*dx + dy*dy);
	}
	
}