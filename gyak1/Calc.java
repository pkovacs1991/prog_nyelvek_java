class Calc {
	public static void main(String[] args) {
		if(args.length == 2) {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println("a=" + a);
			System.out.println("b=" + b);
			System.out.println("a+b=" + (a+b));
			System.out.println("a-b=" + (a-b));
			System.out.println("a*b=" + (a*b));
			if(b != 0) {
				System.out.println("a/b=" + (a/b));
				System.out.println("a%b=" + (a%b));
			}
			
			
		} else {
			System.out.println("Nincs eleg argumentum");
			System.exit(0);
		}
		System.out.println("aa");	
	}
	
}