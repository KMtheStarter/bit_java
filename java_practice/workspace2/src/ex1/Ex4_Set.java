package ex1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ex4_Set {

	public static void main(String[] args) {
		// Set 인터페이스 - 정렬이 보장되지 않는 중복값을 방지하는 컬렉션.
		// 중복을 제거하면서 반복자, 향상된 for문 등 지원.
		HashSet<String> h1 = new HashSet<String>();
		TreeSet<String> h2 = new TreeSet<String>(); // 오름차순
		LinkedHashSet<String> h3 = new LinkedHashSet<String>(); // 입력순
		
		h1.add("ZTest");
		h1.add("BTest");
		h1.add("ATest");
		h1.add("CTest");
		h1.add("BTest");
		
		h2.add("ZTest");
		h2.add("BTest");
		h2.add("ATest");
		h2.add("CTest");
		h2.add("BTest");
		
		h3.add("ZTest");
		h3.add("BTest");
		h3.add("ATest");
		h3.add("CTest");
		h3.add("BTest");
		
		System.out.println("크기: " + h1.size());
		System.out.println("크기: " + h2.size());
		System.out.println("크기: " + h3.size());
		
		for (String str: h1) {
			System.out.println(str);
		}
		for (String str: h2) {
			System.out.println(str);
		}
		for (String str: h3) {
			System.out.println(str);
		}
	}
}
