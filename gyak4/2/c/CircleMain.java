package circle;

import circle.utils.Point;

class CircleMain{
		
		public static void main(String[] args) {
			Circle c = new Circle(5,2,10);
			System.out.println("area= " + c.getArea());
			//c.setX(5);
			//c.setY(2);
			c.setRadius(1);
			System.out.println("area= " + c.getArea());
			Point center = c.getCenter();
			System.out.println(center.getX());
			System.out.println(center.getY());
			//c.setRadius(0);
		}
		
	
}