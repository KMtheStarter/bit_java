package ex1;

import java.util.Scanner;

public class Ex2_Input {
	// Ű���� �Է� Scanner ��ü�� �����ؼ� ����غ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է�: ");
		String name = sc.nextLine();
		System.out.println("�Է��� ����� �̸���: " + name);
	}
}