package ex1;

import java.util.Scanner;

public class Ex12_Switch {
	public static void main(String[] args) {
		// jdk 7���� String ���ڿ� �� ����!
		String s = "B";
		boolean b = true; // �Ұ�
		char ch = 'A';
		float f = 3.14F; // �Ұ�
		byte bb = 10;
		double bn = 10.1; // �Ұ�
		long ll = 10L; // �Ұ�
		
		switch (s) {
		case "A":
			System.out.println("���ڿ� A");
			break;
		case "B":
			System.out.println("���ڿ� B");
			break;
		default:
			System.out.println("���� ���ڿ�!");
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
