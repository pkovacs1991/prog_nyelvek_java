class Complex {

	double real, im;
	
	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

	public double abs() {
		return Math.sqrt(real * real + im * im);
	}
	
	public void add(Complex c) {
		real += c.real;
		im += c.im;
	}
	
	public void sub(Complex c) {
		real -= c.real;
		im -= c.im;
	}
	
	public void mul(Complex c) {
		double newReal = this.real * c.real - this.im*c.im ;
		double newIm = this.real * c.im + this.im * c.real;
		this.real = newReal;
		this.im = newIm;
		
	}

}