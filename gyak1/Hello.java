class Hello {
	public static void main(String[] args) {
		String nev = System.console().readLine();
		System.console().printf("Hello " + nev);
		System.console().printf("Hello %s", nev);
		
	}
}