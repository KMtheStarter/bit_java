package ex1;

import java.util.Scanner;

public class Ex5_Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1~10 까지의 숫자 중 하나 입력: ");
		int userNum = Integer.parseInt(sc.nextLine());
		int cpuNum = (int) (Math.random()*10 + 1);
		System.out.println("CPU: " + cpuNum + " / 입력한 값: " + userNum + " /");
	}
}
