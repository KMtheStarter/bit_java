package ex6;

import java.util.Scanner;

public class DemoMain {
public static void main(String[] args) {
	// Scanner
	//DemoConst dc = new DemoConst();
	// static 정의된 메서드의 반환형 DemoConst
	DemoConst dc1 = DemoConst.getDc();
	DemoConst dc2 = DemoConst.getDc();
	System.out.println(dc1 == dc2);
}
}
