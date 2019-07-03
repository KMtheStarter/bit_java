package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_FileCopy2 {

	// 2차 스트림을 활용하여 속도 증대.
	public static void main(String[] args) throws IOException, IOException {
        long start = System.currentTimeMillis();
        String path1 = "D:\\javabook\\demo\\netbeans.exe";
        String path2 = "D:\\javabook\\demo\\netbeans2.exe";
        // 2차 스트림을 선언: 버퍼 기능을 갖춘 2차 스트림!
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
        	// 1차 스트림의 주소를 인자로 전달!
        	bis = new BufferedInputStream(new FileInputStream(path1));
        	bos = new BufferedOutputStream(new FileOutputStream(path2));
            int readV = 0;
            // bis로 부터 버퍼에 담아 읽어 들이면서
            // bos로 읽어온 경로로 버퍼 단위로 저장한다.
            while((readV = bis.read()) != -1){
            	// 읽어 들인 내용을 사본 파일에 저장.
                bos.write(readV);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally{ // 자원을 해제.
           if(bis != null) bis.close();
           if(bos != null) bos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("복사한 시간 :"+(end - start));
    }
}
