package first;

import java.io.File;

public class FileNameReader {

	public static void main(String[] args) {
		
		String path = "C:\\Users\\bit\\Documents\\km\\java_servlet";
		File f = new File(path);
		File[] fList;
		fList = f.listFiles();
		for(File e: fList) {
			if (e.isDirectory()) {
				System.out.println("[Directory]=>:" + e.getAbsolutePath());
			} else {
				System.out.println("[File]=>:" + e.getAbsolutePath());
			}
		}
	}
}
