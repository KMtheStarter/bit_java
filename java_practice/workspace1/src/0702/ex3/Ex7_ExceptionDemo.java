package ex3;

import java.util.Scanner;

public class Ex7_ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���: ");
		
		try {
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("�Է°�: " + num);	
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���...");
		}
		
	}
}
