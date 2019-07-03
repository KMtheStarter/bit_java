package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_FileCopy {

	 public static void main(String[] args) throws IOException, IOException {
	        long start = System.currentTimeMillis();
	        String path1 = "D:\\javabook\\demo\\netbeans.exe";
	        String path2 = "D:\\javabook\\demo\\netbeans2.exe";
	        // byte stream ����
	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        try {
	            fis = new FileInputStream(path1);
	            fos = new FileOutputStream(path2);
	            // fis.read(): 1����Ʈ�� �о���̴� �޼���.
	            // ������ -1�� ��ȯ�Ѵ�.
	            int readV = 0;
	            while((readV = fis.read()) != -1){
	            	// �о� ���� ������ �纻 ���Ͽ� ����.
	                fos.write(readV);
	            }
	        } catch (FileNotFoundException ex) {
	        } catch (IOException ex) {
	        } finally{ // �ڿ��� ����.
	           if(fis != null) fis.close();
	           if(fos != null) fos.close();
	        }
	        long end = System.currentTimeMillis();
	        System.out.println("������ �ð� :"+(end - start));
	    }
}
