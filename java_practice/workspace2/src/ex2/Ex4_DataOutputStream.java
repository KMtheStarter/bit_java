package ex2;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

// �������� �ڷ������� �Բ� ����.
// ����� ������� InputStream�� �о� �鿩�� �Ѵ�.
public class Ex4_DataOutputStream {

	private String path;
	public Ex4_DataOutputStream() {
		path = "D:\\javabook\\demo\\ex4_data.txt";
	}
	
	// dataType�� �Բ� �Է��� ó���ϴ� �޼���
	public void dataWrite() {
		//�ڵ����� close �����Ѵ�. jdk 7�������� ����.
		try(DataOutputStream dos =
				new DataOutputStream(new FileOutputStream(path))){
			// �Է� ������ �ſ� �߿���.
			// �ڷ������� ���ֱ� ������ �ؽ�Ʈ�� ��������.
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
