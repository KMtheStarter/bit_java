package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex3_ArrayList {

	private ArrayList<String> list;
	private ArrayList<Integer> nList;
	public Ex3_ArrayList() {
		list = new ArrayList<>();
		list.add("Test1");
		list.add("10");
		list.add("3.14");
		nList = new ArrayList<>();
		nList.add(1000);
		nList.add(2000);
		
		for (String str: list) {
			System.out.println(str);
		}
		for (Integer num: nList) {
			System.out.println(num);
		}
		
		Iterator<String> itr1 = list.iterator();
		while(itr1.hasNext()) {
			Object s = itr1.next();
			System.out.println(s);
		}
		Iterator<Integer> itr2 = nList.iterator();
		while(itr2.hasNext()) {
			Object s = itr2.next();
			System.out.println(s);
		}
		
	}
	
	public static void main(String[] args) {
		new Ex3_ArrayList();
	}
}
