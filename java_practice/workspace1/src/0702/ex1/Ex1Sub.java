package ex1;
// extends�� Ű����� �θ� Ȯ�� ���� (���ϻ�Ӹ� ����)
public class Ex1Sub extends Ex1Super{

	public Ex1Sub() {
		// super(); ����
		System.out.println("�ڽ� Ŭ������ ������ ȣ��!");
	}

	public void subTest() {
		superTest(); // �θ��� �ڿ� ȣ�� ����
	}
	
	public static void main(String[] args) {
//		Ex1Sub e1 = new Ex1Sub();
//		e1.subTest(); // �ڽ� �޼��� ȣ��
//		e1.mytest(); // �θ� �޼��� ȣ��
		
		// �θ� ������ ���� ������ �ڽ� ��ü�� �ڿ��� ���� �� �� ����.
		Ex1Super e1 = new Ex1Sub();
		
	}
}
