class Factorial {
	public static void main(String[] args) {
		if(args.length != 1) {
			System.err.println("Nem megfelelo szamu argumentum");
			System.exit(0);
		} else {
			int n = Integer.parseInt(args[0]);
			int fact = fact(n);
			//System.out.println(n + " faktorialisa " + fact);
			System.out.println(n + " faktorialisa " + fact(n));
			System.out.println(n + " faktorialisa " + fact2(n));
		}
		
	}
	
	
	public static int fact2(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fact2(n-1);
	}
	
	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <=n; i++) {
			fact *=  i;
			//fact = fact * i;
		}
		return fact;
		
	}

}