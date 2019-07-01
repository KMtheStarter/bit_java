package ex1;

import java.util.Scanner;

public class Ex2_Input {
// 키보드 입력 Scanner 객체를 생성해서 사용해보기 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 :");
		String name = sc.nextLine();
		System.out.println("입력한 당신의 이름은 :"+name);
		
	}
}
