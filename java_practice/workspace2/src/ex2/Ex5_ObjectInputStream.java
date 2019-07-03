package ex2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex5_ObjectInputStream {

	public static void main(String[] args) {
		String path = "D:\\javabook\\demo\\ex5_data.txt";
		try(ObjectInputStream ois
				= new ObjectInputStream(new FileInputStream(path))){
			// 역직렬화 (객체 조립)
			Ex5_Member v = (Ex5_Member) ois.readObject();
			System.out.println("id: " + v.getId());
			System.out.println("name: " + v.getName());
			System.out.println("PWD: " + v.getPwd());
			System.out.println("age: " + v.getAge());
			System.out.println("pay: " + v.getPay());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
