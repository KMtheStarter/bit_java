package ex1;

import java.util.Scanner;

public class Ex12_Switch {
	public static void main(String[] args) {
		// jdk 7부터 String 문자열 비교 지원!
		String s = "B";
		boolean b = true; // 불가
		char ch = 'A';
		float f = 3.14F; // 불가
		byte bb = 10;
		double bn = 10.1; // 불가
		long ll = 10L; // 불가
		
		switch (s) {
		case "A":
			System.out.println("문자열 A");
			break;
		case "B":
			System.out.println("문자열 B");
			break;
		default:
			System.out.println("없는 문자열!");
			break;
		}
		
		ext: for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if (j == 3) {
					break ext;
				}
				System.out.println(j + ", " + i);
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		ext2: while(true) {
			System.out.println("1, 2, 3: ");
			int n = Integer.parseInt(sc.nextLine());
			switch (n) {
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 3:
				System.out.println("exit");
				break ext2;
			default:
				System.out.println("choose in 1, 2, 3");
				break;
			}
		}
	}
}
