class Greeting2{ 
	public static void main( String[] args) {
		if(args.length > 0) {
		String nev = args[0];
		System.out.println("Hello " + nev);
		} else {
			System.out.println("Nincs eleg argumentum");
		}
	}

}