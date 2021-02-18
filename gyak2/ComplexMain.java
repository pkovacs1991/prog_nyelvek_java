class ComplexMain{ 
	public static void main(String[] args) {
		Complex c1 = new Complex(3 , -2);
		Complex c2 = new Complex(1, 4);
		
		System.out.println("abs(3 -2 i) = " + c1.abs());
		c1.add(c2);
		System.out.println("c1 + c2 = " + c1.real + " " + c1.im);
		c1.sub(c2);
		System.out.println("c1 - c2 = " + c1.real + " " + c1.im);
		c1.mul(c2);
		System.out.println("c1 * c2 = " + c1.real + " " + c1.im);
	}

}