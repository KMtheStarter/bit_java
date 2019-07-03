package ex3;

import java.util.Scanner;

public class Ex7_ExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자만 입력하세요: ");
		
		try {
			int num = Integer.parseInt(sc.nextLine());
			System.out.println("입력값: " + num);	
		} catch (Exception e) {
			System.out.println("숫자만 입력하세요...");
		}
		
	}
}
