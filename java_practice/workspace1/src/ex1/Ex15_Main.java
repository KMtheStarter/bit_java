package ex1;

import java.util.Scanner;

// ������Ʈ: �ڻ� - 10000000
// ����Ʈ ����: ����
// �� �谡 ������ �Ǵ� ��Ȳ�� ����ؼ� ���� ����
public class Ex15_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex15_Home h = new Ex15_Home();
		String color = null;
		Ex15_PaintFactory pf1 = new Ex15_PaintFactory();
		color = sc.nextLine();
		pf1.usesPaint(h, color);
		Ex15_PaintFactory pf2 = new Ex15_PaintFactory();
		color = sc.nextLine();
		pf2.usesPaint(h, color);
		
	}
}
