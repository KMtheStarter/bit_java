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
	        // byte stream 선언
	        FileInputStream fis = null;
	        FileOutputStream fos = null;
	        try {
	            fis = new FileInputStream(path1);
	            fos = new FileOutputStream(path2);
	            // fis.read(): 1바이트씩 읽어들이는 메서드.
	            // 마지막 -1을 반환한다.
	            int readV = 0;
	            while((readV = fis.read()) != -1){
	            	// 읽어 들인 내용을 사본 파일에 저장.
	                fos.write(readV);
	            }
	        } catch (FileNotFoundException ex) {
	        } catch (IOException ex) {
	        } finally{ // 자원을 해제.
	           if(fis != null) fis.close();
	           if(fos != null) fos.close();
	        }
	        long end = System.currentTimeMillis();
	        System.out.println("복사한 시간 :"+(end - start));
	    }
}
