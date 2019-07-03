package ex1;

import java.util.ArrayList;
import java.util.List;

public class Ex2_List {

	private List list;
	public Ex2_List(){
		list = new ArrayList();
		list.add("StringAAA");
		list.add(new Integer(30));
		list.add(new Character('A'));
		list.add(new Float(3.14f));
		list.add("String");
		System.out.println("Size: " + list.size());
		
		// collection�� object type�� ���� ��õ���� ������
		// JDK5���� ���׸����� ����Ѵ�.
		
		for (Object e: list) {
			if (e instanceof String) { // ���� �ν��Ͻ����� �ƴ��� �Ǻ�.
				System.out.println("String" + e);
			} else if (e instanceof Integer) {
				System.out.println("Integer" + e);
			} else System.out.println(e);
			System.out.println("------------");
			String obj = e.getClass().getCanonicalName();
			System.out.print(obj.substring(obj.lastIndexOf(".") + 1) + ":");
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		new Ex2_List();
	}
}
