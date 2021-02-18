class PointMain{
	public static void main(String[] args) {
		Point p = new Point();
		p.x = 2;
		p.y = 3;
		Point p2 = new Point(2, 3);
		p.move(1,1);
		p2.move(1,1);
		System.out.println("p1 " + p.x + " " + p.y);
		System.out.println("p2 " + p2.x + " " + p2.y);
		
		p.mirror(0,0);
		System.out.println("p1 mirror " + p.x + " " + p.y);
		
		Point origo = new Point(0,0);
		p.mirror(origo);
		System.out.println("p1 mirror " + p.x + " " + p.y);
		System.out.println(p.distance(origo));
		
	}

}