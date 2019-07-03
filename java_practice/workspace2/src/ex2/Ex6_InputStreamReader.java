package ex2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6_InputStreamReader {

	 public static void main(String[] args) {
	        BufferedReader br = null;
	        try {
	            String path = "D:\\javabook\\demo\\message.txt";
	            // InputStreamReader : 바이트를 문자열로 연결해주는 스트림
	            // 브릿지 스트림이라고도 함. 요즘 잘 안씀.
	            br = new BufferedReader(
	                    new InputStreamReader(new FileInputStream(path))
	            );
	            String str = null;
	            while ((str = br.readLine()) != null) {                
	                System.out.println(str);
	            }
	        } catch (FileNotFoundException ex) {
	            ex.printStackTrace();
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        } finally {
	            try {
	                br.close();
	            } catch (IOException ex) {
	            }
	        }
	    }
}
