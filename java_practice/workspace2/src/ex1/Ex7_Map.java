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
	
		// �����
		// Map.Entry<Integer, String>: key�� value�� �޾ƿ��� ���� �������̽�.
		// entrySet(): key, value�� ������ �� Map.Entry<Integer, String>�� �����Ͽ� ��ȯ.
		for(Map.Entry<Integer, String> e: map.entrySet()) {
			System.out.println("key: " + e.getKey());
			System.out.println("value: " + e.getValue());
		}
	}
}
