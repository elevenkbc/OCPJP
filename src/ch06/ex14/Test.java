package ch06.ex14;

import java.util.*;


public class Test {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(15, "z");
		map.put(2, "b");
		map.put(6, "d");
		map.put(8, "e");
		map.put(55, "j");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>(
				//anonymous Class (只產生一次，且只能在main方法中調用) 用 Comparator interface 來 new
				new Comparator<Integer>() {
					@Override
					public int compare(Integer o1, Integer o2) {
						return o2.compareTo(o1);
					}
				}
			);
		treeMap.putAll(map);
		for(Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}

		
	}
}
