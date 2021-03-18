class Calc {
	public static void main(String[] args) {
		try {
			if(args.length == 3) {
				double a = Double.parseDouble(args[0]);
				char operator = args[1].charAt(0);
				double b = Double.parseDouble(args[2]);
				System.out.println("" + a + operator + b + " = ");
				switch(operator) {
					case '+' :
						System.out.println(a+b);
						break;
					case '-':
						System.out.println(a-b);
						break;
					case 'x':
						System.out.println(a*b);
						break;
					case '/':
						if(b == 0) {
							throw new ArithmeticException("You cannot divide with zero");
						}
						System.out.println(a/b);
						break;
					default:
						throw new IllegalArgumentException("Invalid operator program arguments provided.");
					
				}
				
				/*if(m == '+') {
					
				} else if 
				...
				else {
					throw new IllegalArgumentException();
				}*/
				
				
				
				
			} else {
				throw new IllegalArgumentException("Invalid number of program arguments provided.");	
			}
			
		} catch(NumberFormatException nfx) {
			System.err.println("The program arguments not number");
		
		} catch(IllegalArgumentException ex) {
			System.err.println(ex.getMessage());
		} catch(ArithmeticException ax) {
			System.err.println(ax.getMessage());
		} 
		
	}
	
}