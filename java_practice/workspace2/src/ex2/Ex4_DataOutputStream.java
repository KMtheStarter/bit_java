package ex2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// 데이터의 자료형까지 함께 저장.
// 저장된 순서대로 InputStream에 읽어 들여야 한다.
public class Ex4_DataOutputStream {

	private String path;
	public Ex4_DataOutputStream() {
		path = "D:\\javabook\\demo\\ex4_data.txt";
	}
	
	// dataType과 함께 입력을 처리하는 메서드
	public void dataWrite() {
		//자동으로 close 수행한다. jdk 7버전부터 지원.
		try(DataOutputStream dos =
				new DataOutputStream(new FileOutputStream(path))){
			// 입력 순서가 매우 중요함.
			// 자료형까지 들어가있기 때문에 텍스트가 깨져보임.
			dos.writeInt(10);
			dos.writeBoolean(true);
			dos.writeChar('A');
			dos.writeFloat(10.5f);
			dos.writeUTF("MyTest");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Ex4_DataOutputStream().dataWrite();
	}
}
