import java.util.ArrayList;

public class Main{

	public static ArrayList<String> getStrSameBeginningAndEnding(ArrayList<String> list) {
		ArrayList<String> result = new ArrayList<>();
		for(String element : list) {
			final int length = element.length();
			if(length > 0 && element.charAt(0) == element.charAt(length - 1)) {
				result.add(element);
			
			}
			
		}
		
		return result;
		
	}


	public static void removeStrDifferBeginningAndEnding(ArrayList<String> list) {
		list.removeIf(element -> element.length() == 0 || 
			element.charAt(0) != element.charAt(element.length() -1 ));
		
	}


	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("c++");
		list.add("ada");
		list.add("");
		list.add("aa____________abba");
		
		System.out.println(list);
		System.out.println(getStrSameBeginningAndEnding(list));
		removeStrDifferBeginningAndEnding(list);
		System.out.println(list);
	}


}