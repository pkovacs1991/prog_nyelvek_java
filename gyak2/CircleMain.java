class CircleMain {

	public static void main(String[] args) {
		Circle circle = new Circle(1,1,2);
		System.out.println("area= " + circle.getArea());
		circle.enlarge(2);
		System.out.println("area= " + circle.getArea());
		
	}


}