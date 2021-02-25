package stringutils;

public class IterLetter {

	private String str;
	private int counter;
	public IterLetter(String str) {
		if(str == null) {
			throw new IllegalArgumentException("String nem lehet null");
		}
		this.str = str;
		this.counter = 0;
	}
	
	public void restart() {
		this.counter = 0;
	}
	
	public boolean hasNext(){
		return counter < str.length();
	}
		
	public void printNext() {
		if(hasNext()) {
		System.out.println(str.charAt(counter++));
		}
	}


}