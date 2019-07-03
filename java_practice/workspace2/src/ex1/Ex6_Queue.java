package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class Ex6_Queue {
	// Java�� Queue �������̽��� �ڷᱸ�� ť�� ����.
	// Java�� Queue �������̽������� ������ �� offer �޼ҵ� ���.
	// ���� ���� ������ �ڷḦ ���� ���� poll �޼��带 ���.
	// ���� ���� ������ �ڷḦ ���� �� ���� peek �޼��带 ���.
	// �޼��尡 ������� �Ǻ��ϴ� isEmpty

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		q.offer("A"); // ��������
		q.offer("B");
		q.offer("C");
		
		System.out.println("size: " + q.size()); // 3
		System.out.println(q.poll()); // ���� ���� ������ �� ������ ��ȯ
		System.out.println("size: " + q.size()); // 2
		System.out.println("---------------");
		System.out.println(q.peek()); // ���� ���� ������ �� �ܼ� ����.
		System.out.println("size: " + q.size());
		System.out.println("---------------");
		System.out.println(q.poll());
		q.add("D");
		System.out.println(q.poll());
		System.out.println(q.poll());
		
		Queue<String> q1 = new LinkedList<String>();
		q1.offer("�̼���1");
		q1.offer("�̼���2");
		q1.offer("�̼���3");
		while(!q1.isEmpty()) {
			System.out.println(q1.poll());
		}
	}
}
