package ex2;

import java.io.BufferedInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Ex7_ScannerDemo {

	public static void main(String[] args) throws MalformedURLException {
		String path = "https://github.com/KMtheStarter";
		// 해당 URL :
		// http => 프로토콜
		// host => github.com(:8088 => port)
		// path => KMtheStarter
		// Query => ?key=value&key=value (파라미터이름=값)
		URL url = new URL(path);
		try(Scanner sc = new Scanner(
				new BufferedInputStream(url.openStream()), "euc-kr")){
			String rdv = null;
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
