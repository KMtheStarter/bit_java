package ex2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex3_FileCopy2 {

	// 2�� ��Ʈ���� Ȱ���Ͽ� �ӵ� ����.
	public static void main(String[] args) throws IOException, IOException {
        long start = System.currentTimeMillis();
        String path1 = "D:\\javabook\\demo\\netbeans.exe";
        String path2 = "D:\\javabook\\demo\\netbeans2.exe";
        // 2�� ��Ʈ���� ����: ���� ����� ���� 2�� ��Ʈ��!
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
        	// 1�� ��Ʈ���� �ּҸ� ���ڷ� ����!
        	bis = new BufferedInputStream(new FileInputStream(path1));
        	bos = new BufferedOutputStream(new FileOutputStream(path2));
            int readV = 0;
            // bis�� ���� ���ۿ� ��� �о� ���̸鼭
            // bos�� �о�� ��η� ���� ������ �����Ѵ�.
            while((readV = bis.read()) != -1){
            	// �о� ���� ������ �纻 ���Ͽ� ����.
                bos.write(readV);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } finally{ // �ڿ��� ����.
           if(bis != null) bis.close();
           if(bos != null) bos.close();
        }
        long end = System.currentTimeMillis();
        System.out.println("������ �ð� :"+(end - start));
    }
}
