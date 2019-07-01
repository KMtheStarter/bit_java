package ex1;

import java.util.Scanner;

public class Ex4_WrapperClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = Integer.parseInt(sc.nextLine());
		if (age > 19) {
			System.out.println("성년: " + age);
		} else {
			System.out.println("미성년: " + age);
		}
	}
}
