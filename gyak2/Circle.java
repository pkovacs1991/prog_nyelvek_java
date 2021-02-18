public class Circle { 
	
	double x,y,r;
	
	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void enlarge(double f) {
		this.r *= f;
	}

	public double getArea() {
		return Math.PI * r * r;
	}

}