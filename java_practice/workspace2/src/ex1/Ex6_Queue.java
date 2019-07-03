package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6_Queue {
	// Java의 Queue 인터페이스는 자료구조 큐를 제공.
	// Java의 Queue 인터페이스에서는 보관할 때 offer 메소드 사용.
	// 가장 먼저 보관한 자료를 꺼낼 때는 poll 메서드를 사용.
	// 가장 먼저 보관한 자료를 참조 할 때는 peek 메서드를 사용.
	// 메서드가 비었는지 판별하는 isEmpty

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("A"); // 순차보관
		q.offer("B");
		q.offer("C");
		
		System.out.println("size: " + q.size()); // 3
		System.out.println(q.poll()); // 가장 먼저 보관한 값 꺼내고 반환
		System.out.println("size: " + q.size()); // 2
		System.out.println("---------------");
		System.out.println(q.peek()); // 가장 먼저 보관한 값 단순 참조.
		System.out.println("size: " + q.size());
		System.out.println("---------------");
		System.out.println(q.poll());
		q.add("D");
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		Queue<String> q1 = new LinkedList<String>();
		q1.offer("이순일1");
		q1.offer("이순일2");
		q1.offer("이순일3");
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
	}
}
