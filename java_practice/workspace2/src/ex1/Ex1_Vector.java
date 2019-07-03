package ex1;

import java.util.Iterator;
import java.util.Vector;

public class Ex1_Vector {

	private Vector v;
	public Ex1_Vector() {
		v = new Vector();
		System.out.println("�ʱ� �뷮: " + v.capacity());
		System.out.println("�ʱ� ������: " + v.size());
		
		v.add("Test1");
		v.add("Test2");
		v.add("Test1"); // �� ������ ������ ��ü�� ��ΰ�? 3
		
		System.out.println("����� �뷮: " + v.capacity());
		System.out.println("����� ������: " + v.size());
		
		// ���� for��
		for (Object e: v) {
			System.out.println(e);
		}
		System.out.println("------------------");
		// �ݺ���
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

