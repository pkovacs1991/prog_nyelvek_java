class Circle {
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

}



class CircleMain{
		
		public static void main(String[] args) {
			Circle c = new Circle(5,2,10);
			System.out.println("area= " + c.getArea());
			//c.setX(5);
			//c.setY(2);
			c.setRadius(1);
			System.out.println("area= " + c.getArea());
			//c.setRadius(0);
		}
		
	
}