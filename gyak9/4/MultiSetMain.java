import java.util.HashMap;

public class MultiSetMain {



	public static void main(String[] args) {
		MultiSet set1 = new MultiSet();
		set1.put("java");
		set1.put("java");
		set1.put("javascript");
		set1.put("c++");
		System.out.println(set1.getData());
		MultiSet set2 = new MultiSet();
		set2.put("java");
		set2.put("javascript");
		set2.put("c++");
		set2.put("python");
		set2.put("python");
		set2.put("bash");
		System.out.println(set2.getData());
		
		MultiSet intersect = set1.intersect(set2);
		System.out.println(intersect.getData());
		
		HashMap<String, Integer> intersectData = intersect.getData();
		intersectData.put("ruby", 10);
		System.out.println(intersectData);
		System.out.println(intersect.getData());
		
		
	}


}