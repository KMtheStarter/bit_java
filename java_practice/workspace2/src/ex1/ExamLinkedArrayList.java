package ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExamLinkedArrayList {

	// ArrayList가 빠를까 LinkedList가 빠를까?
	public void arrayList(ArrayList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e: ar) {
			String msg = e;
			if (e.equals("Kosta")) {
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start));
	}
	
	public void linkedList(LinkedList<String> ar) {
		long start = System.currentTimeMillis();
		for (String e: ar) {
			String msg = e;
			if (e.equals("Kosta")) {
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start));
	}
	
	public void allList(List<String> list) {
		long start = System.currentTimeMillis();
		for (String e: list) {
			String msg = e;
			if (e.equals("Kosta")) {
				
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("소요시간: " + (end - start));
	}
	
	public static void main(String[] args) {
		ExamLinkedArrayList ref = new ExamLinkedArrayList();
		ArrayList<String> ar = new ArrayList<String>();
		LinkedList<String> ar1 = new LinkedList<String>();
		
		for (int i = 0; i < 10000000; i++) {
			if (i % 5 == 0) {
				ar.add("Kosta");
				ar1.add("Kosta");
			} else {
				ar.add("Test1");
				ar1.add("Test1");
			}
		}
		
//		ref.arrayList(ar);
//		ref.linkedList(ar1);
		ref.allList(ar);
		ref.allList(ar1);
	}
}
