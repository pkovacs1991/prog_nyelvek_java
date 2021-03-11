public class Test {

	public static void main(String[] args) {
		Print print = new Print("hello");
		System.out.println(print);
		System.out.println(print.toString());
		
		
	}

}

class Print {
	private String text;
	
	public Print(String text) {
		this.text = text;
	}
	
	@Override
	public String toString() {
		return text;
	}
	
}