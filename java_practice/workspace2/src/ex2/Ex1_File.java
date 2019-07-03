package ex2;

import java.io.File;
import java.io.IOException;

public class Ex1_File {

	public static void main(String[] args) {
		
		File f2 = new File("D:\\javabook\\demo\\aa2.txt");
		if (!f2.exists()) { // 파일이 존재하지 않을 때 0바이트 짜리 빈 파일 생성
			try {
				f2.createNewFile();
			} catch (IOException e) { // IOException은 입출력 예외.
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("이미존재함");
		}
		
		File f3 = new File("D:\\javabook\\demo\\hello\\ff");
		if (!f3.exists()) {
			f3.mkdirs();
			System.out.println("Path: " + f3.getPath());
		} else {
			System.out.println("이미 존재함." + f3.getAbsolutePath());
		}
	}
}
