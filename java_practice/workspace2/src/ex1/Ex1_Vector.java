package ex1;

import java.util.Iterator;
import java.util.Vector;

public class Ex1_Vector {

	private Vector v;
	public Ex1_Vector() {
		v = new Vector();
		System.out.println("초기 용량: " + v.capacity());
		System.out.println("초기 사이즈: " + v.size());
		
		v.add("Test1");
		v.add("Test2");
		v.add("Test1"); // 힙 영역에 생성된 객체는 몇개인가? 3
		
		System.out.println("변경된 용량: " + v.capacity());
		System.out.println("변경된 사이즈: " + v.size());
		
		// 향상된 for문
		for (Object e: v) {
			System.out.println(e);
		}
		System.out.println("------------------");
		// 반복자
		Iterator it = v.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}
	}
	
	public static void main(String[] args) {
		new Ex1_Vector();
	}
}

