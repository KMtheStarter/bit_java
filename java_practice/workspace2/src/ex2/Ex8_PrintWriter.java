package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex8_PrintWriter {

	public static void main(String[] args) {
	
		String path = "D:\\javabook\\demo\\message.txt";
		// �� ��° ����: autoFlush. �ڵ����� ���۸� ����ش�.
		try(PrintWriter pw =
				new PrintWriter(new FileOutputStream(path), true);){
			pw.println("���� �氡");
			// pw.flush
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
