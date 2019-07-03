package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {
		String path = "D:\\javabook\\demo\\message.txt";
		FileOutputStream fos = null;
		
		try {
			// ������ �������� ������ ����.
			// �� ��° ���ڿ� ������ append�� ���ϸ� true.
			// �̴� �̹����� ������ ���� ���Ͽ��� ������� �ʰ�,
			// �ؽ�Ʈ ������ ������� ����Ѵ�. ����Ʈ�����ϱ�.
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
