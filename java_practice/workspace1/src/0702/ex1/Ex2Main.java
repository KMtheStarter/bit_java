package ex1;

// 5���� �߻� �޼ҵ� �� ù ��° �޼ҵ常 �ʿ�
public class Ex2Main extends Ex2WindowDemo{

	public static void main(String[] args) {
		// 1. ����� �޾Ƽ� ������ �ϴ� ���
		Ex2Main ref = new Ex2Main();
		ref.exec1(); // 5�� �� ���.
		
		// 2. �߻� Ŭ������ ���� �͸� ���� Ŭ������ �����Ǹ� �� ���
		new Ex2WindowDemo() {
			@Override
			public void exec1() {
				// TODO Auto-generated method stub
				System.out.println("�ٸ� ���");
			}
		}.exec1();
	}
}
