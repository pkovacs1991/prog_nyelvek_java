import java.util.HashMap;

public class Bag<T> {

	private HashMap<T, Integer> map = new HashMap<>();
	
	/*public Bag() {
		this.map = new HashMap<>();
	}*/
	
	public void add(T element) {
		Integer count = 1;
		Integer currentCount = map.get(element);
		if(currentCount != null ) {
			count = currentCount + 1 ;
		}
		map.put(element, count);
		
	}
	
	public int countOf(T element) {
		Integer currentCount = map.get(element);
		if(currentCount != null ) {
			return currentCount;
		} else {
			return 0;
		}
	}
	
	public void remove(T element) throws NotInBagException {
		Integer currentCount = map.get(element);
		if(currentCount == null) {
			throw new NotInBagException("Element: " + element + " doesn''t present in Bag."  );
		}
		if(currentCount == 1) {
			map.remove(element);
		} else {
			map.put(element, currentCount - 1);
		}
		
	}
	
	@Override
	public String toString() {
		return map.toString();
	}
}