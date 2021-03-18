class Calc {
	public static void main(String[] args) {
		if(args.length == 3) {
			double a = Double.parseDouble(args[0]);
			char operator = args[1].charAt(0);
			double b = Double.parseDouble(args[2]);
			System.out.println("" a + operator + b + " = ");
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
						throw new ArithmeticException();
					}
					System.out.println(a/b);
					break;
				default:
					throw new IllegalArgumentException();
				
			}
			
			/*if(m == '+') {
				
			} else if 
			...
			else {
				throw new IllegalArgumentException();
			}*/
			
			
			
			
		} else {
			throw new IllegalArgumentException();	
		}
		
	}
	
}