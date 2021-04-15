import java.util.HashMap;

public class MultiSet {

	private HashMap<String, Integer> data;
	
	public MultiSet() {
		this.data = new HashMap<>();
	}
	
	public MultiSet(HashMap<String, Integer> data) {
		this.data = new HashMap<>(data);
	}
	
	public HashMap<String, Integer> getData() {
		return new HashMap<>(data);
	}
	
	public void put(String item) {
		if(data.containsKey(item)) {
			int mult = data.get(item) + 1;
			data.replace(item, mult);
		} else {
			data.put(item, 1);
			
		}
			
	}
	
	public MultiSet intersect(MultiSet other) {
		HashMap<String, Integer> resultData = new HashMap<>();
		for(String key : data.keySet()) {
			if(other.getData().containsKey(key)) {
				resultData.put(key, Math.min(this.data.get(key), other.getData().get(key)));
			}
			
		}
		
		return new MultiSet(resultData);
		
	}

}