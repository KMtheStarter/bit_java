package ex1;

import java.util.Scanner;

// 업데이트: 자산 - 10000000
// 페인트 가격: 설정
// 두 배가 인출이 되는 상황을 고려해서 제작 가능
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
