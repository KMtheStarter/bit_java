package ex3;

public class Ex2_LocalInner {

	private int a;
	public Ex2_LocalInner() { a = 100;}
	// ���� ���� Ŭ���� �ȿ��� �������� �̾߱�
	// jdk 7���ϱ����� final�̶�� ���
	// 8���� ���� ���ʹ� final�� ��� ���������� ��� ���
	public void insertTest(/*final*/int num) {
		/*final*/ int b = 200; // ���
		/*final*/ int c = num; // ���
		class Inner { // �޼ҵ� ���� �ȿ� ����
			public void getData() {
				System.out.println("����ʵ� ����: " + a);
				// �޼��� ���� ����� ������ �� ������
				// ���������� ���� �� ����.
//				System.out.println("�������� ����" + (b++)); //����� ����ȵ�
//				System.out.println("��������?" + (c+=num)); //����� ����ȵ�
//				System.out.println(b); // ���� b=30�� ������ ��� ����.
			}
		}
		new Inner().getData();
		b = 30;
		System.out.println("b: " + b);
	}
	
	public static void main(String[] args) {
		new Ex2_LocalInner().insertTest(200);
	}
}
