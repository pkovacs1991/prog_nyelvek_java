class Half {
	public static void main(String[] args) {
		int from,to;
		String fromString = System.console().readLine("Kerem az also hatart: ");
		from = Integer.parseInt(fromString);
		String toString = System.console().readLine("Kerem az felso hatart: ");
		to = Integer.parseInt(toString);
		System.out.println("Also hatar: "+ from + " felso hatar: " + to);
		
		for(int idx = from; idx <= to; ++idx) {
			System.out.println(idx+ " fele: " + idx / 2.0 );
		}
		
	}

}