package example.ch06._3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer, Integer> m1 = new Hashtable<>();
//		m1.put(null, null); //Hashtable 不允許 null key and value， runtime 丟出 NullPointerException
		
		Map<Integer, Integer> m2 = new HashMap<>();
		m2.put(null, null); //HashMap 允許 null key and value
		
		Map<Integer, Integer> m3 = new TreeMap<>();
//		m3.put(null, null); //HashMap 不允許  null key and value
	}
}
