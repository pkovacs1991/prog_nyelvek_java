
import stringutils.IterLetter;

public class IterMain {

	public static void main(String[] args) {
		IterLetter iter = new IterLetter("hello");
		
		iter.printNext();
		iter.printNext();
		iter.restart();
		while(iter.hasNext()) {
			iter.printNext();
		}
		
		System.out.println("-----------------");
		iter.printNext();
		
		IterLetter iter2 = new IterLetter(null);
	
		
	}

}