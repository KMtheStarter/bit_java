package ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Ex8_PrintWriter {

	public static void main(String[] args) {
	
		String path = "D:\\javabook\\demo\\message.txt";
		// 두 번째 인자: autoFlush. 자동으로 버퍼를 비워준다.
		try(PrintWriter pw =
				new PrintWriter(new FileOutputStream(path), true);){
			pw.println("하이 방가");
			// pw.flush
			
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
