import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ExtendedString temp1 = new ExtendedString("abcd abdc");
		ExtendedString temp2 = new ExtendedString("qwe qwe");
		System.out.println("temp1 compareto temp2 " + temp1.compareTo(temp2));
		System.out.println("temp2 compareto temp1 " + temp2.compareTo(temp1));
		
		Iterator<Character> it = temp1.iterator();
		
		while(it.hasNext()) {
			char ch = it.next();
			System.out.println(ch);
		}
		
		System.out.println("------------------------------------------------------");
		
		it = temp1.iterator();
		if(it.hasNext()) {
			it.remove();
		}
		
		while(it.hasNext()) {
			char ch = it.next();
			System.out.println(ch);
		}
		
		ArrayList<ExtendedString> list = new ArrayList<>();
		list.add(new ExtendedString("This is a very long sentence"));
		list.add(temp1);
		list.add(temp2);
		list.add(new ExtendedString("world"));
		list.add(new ExtendedString("hello"));
		list.add(new ExtendedString("java"));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
	}

}