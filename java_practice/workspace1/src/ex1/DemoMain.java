package ex1;

public class DemoMain {

	public static void main(String[] args) {
		// DemoConst dc = new DemoConst();
		// static ���ǵ� �޼����� ��ȯ��
		DemoConst dc1 = DemoConst.getDc();
		DemoConst dc2 = DemoConst.getDc();
		System.out.println(dc1 == dc2);
	}
}
