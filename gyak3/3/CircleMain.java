class Circle {
	private double x = 0;
	private double y = 0;
	private double radius = 1;

	public double getArea(){
		return Math.PI*radius*radius;
	}
	
	

}



class CircleMain{
		
		public static void main(String[] args) {
			Circle c = new Circle();
			System.out.println("area= " + c.getArea());
			c.x = 5;
			c.y = 2;
			c.radius = 10;
			System.out.println("area= " + c.getArea());
				
		}
		
	
}