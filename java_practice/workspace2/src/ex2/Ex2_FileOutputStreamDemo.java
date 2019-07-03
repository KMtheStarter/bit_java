package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "D:\\javabook\\demo\\message.txt";
		FileOutputStream fos = null;
		
		try {
			// 파일이 존재하지 않으면 생성.
			// 두 번째 인자에 데이터 append를 원하면 true.
			// 이는 이미지나 동영상 등의 파일에는 사용하지 않고,
			// 텍스트 파일을 대상으로 사용한다. 바이트단위니까.
			fos = new FileOutputStream(path);
			fos.write(66);
			fos.write(65);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (fos != null) fos.close();
		}
	}
}
