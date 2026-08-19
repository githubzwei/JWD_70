package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
public static void main(String[] args) {
	Map<String, String> map = new HashMap<String, String>();
	map.put("1", "Java");
	map.put("2", "PHP");
	map.put("2", "CSS");
	
	System.out.println(map);
	
	for(Entry<String, String> entry:map.entrySet()) {
		System.out.println(entry.getKey()+" - "+entry.getValue());
	}
}
}
