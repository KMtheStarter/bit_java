package ex2;

import java.io.File;
import java.io.IOException;

public class Ex1_File {

	public static void main(String[] args) {
		
		File f2 = new File("D:\\javabook\\demo\\aa2.txt");
		if (!f2.exists()) { // ������ �������� ���� �� 0����Ʈ ¥�� �� ���� ����
			try {
				f2.createNewFile();
			} catch (IOException e) { // IOException�� ����� ����.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("�̹�������");
		}
		
		File f3 = new File("D:\\javabook\\demo\\hello\\ff");
		if (!f3.exists()) {
			f3.mkdirs();
			System.out.println("Path: " + f3.getPath());
		} else {
			System.out.println("�̹� ������." + f3.getAbsolutePath());
		}
	}
}
