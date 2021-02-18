class Distance {
	public static void main(String[] args) {
		double distance = 0;
		
		for(int i = 0; i < args.length - 2 ; i = i+2) {
			Point p1 = new Point(Integer.parseInt(args[i]), Integer.parseInt(args[i+1]));
			Point p2 = new Point(Integer.parseInt(args[i+2]), Integer.parseInt(args[i+3]));
			distance += p1.distance(p2);
			
		}
		System.out.println(distance);
	}


}