import java.util.Iterator;

public class ExtendedString implements Comparable<ExtendedString>, Iterable<Character> {

	private String data;
	
	public ExtendedString(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return data;
	}
	
	@Override
	public int compareTo(ExtendedString that) {
		return this.data.length() - that.data.length();
	}
	
	
	@Override
	public Iterator iterator() {
		return new ExtendedStringIterator(this.data);
	}
	
}
