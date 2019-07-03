package ex2;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Ex4_DataInputStream {

	public static void main(String[] args) {
		String path = "D:\\javabook\\demo\\ex4_data.txt";
		try (DataInputStream dis
				= new DataInputStream(new FileInputStream(path))){
			System.out.println("Ãâ·Â: -------------------");
			System.out.println("int: " + dis.readInt());
			System.out.println("boolean: " + dis.readBoolean());
			System.out.println("char: " + dis.readChar());
			System.out.println("Float: " + dis.readFloat());
			System.out.println("String: " + dis.readUTF());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
