import java.util.ArrayList;
import java.util.Collections;

class Main {

	public static void main(String[] args) {
		ArrayList<Point> list = new ArrayList<>();
		list.add(new Point(1,2));
		list.add(new Point(4,5));
		list.add(new Point(4,-3));
		list.add(new Point(4,2));
		list.add(new Point(4,6));
		list.add(new Point(2,7));
		list.add(new Point(2,6));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}