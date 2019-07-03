package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex7_Map {

	public static void main(String[] args) {
		String[] msg = {"AA", "BB", "CC", "AA", "DD", "EE", "FF"};
		HashMap<Integer, String> map = new HashMap<>();
		int cnt = 0;
		
		for(String e: msg) {
			map.put(cnt + 1, e);
			cnt++;
		}
		System.out.println("Map: " + map.size());
		
		Set<Integer> s = map.keySet();
		
		for (Integer e: s) {
			System.out.println(s);
		}
	
		// 축약형
		// Map.Entry<Integer, String>: key와 value를 받아오기 위한 인터페이스.
		// entrySet(): key, value를 추출한 후 Map.Entry<Integer, String>을 저장하여 반환.
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println("key: " + e.getKey());
			System.out.println("value: " + e.getValue());
		}
	}
}
