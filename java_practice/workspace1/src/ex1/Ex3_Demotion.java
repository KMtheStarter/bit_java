package ex1;

public class Ex3_Demotion {
	public static void main(String[] args) {
		// 4byte ������ ������ JVM�� ����� �ڵ����� 4byte�� �°ݽ��Ѽ� �����Ѵ�.
		// demotion: ū �ڷ����� ���� ���� �ڷ�������. ����� �ݵ�� ĳ������ ��������� �ؾ� �Ѵ�.
		// promotion: ���� �ڷ����� ���� ū �ڷ�������. ĳ������ ���������� �Ͼ��.
		byte n1 = 10;
		byte n2 = 20;
		// byte n3 = n1 + n2 �� ������ ����.
		byte n3 = (byte) (n1 + n2);
		
		int res = n1 + n2;
		// short�ε� �غ���
		short sh1 = 100;
		short sh2 = 200;
		short sh3 = (short) (sh1 + sh2);
		System.out.println("sh3 :" + sh3);
		
		int resOper = (100 * 2 / 3 % 5);
		System.out.println(resOper);
		
		long l = 10l;
		long l2 = 10L; // �ش� �޸𸮿� ������ ��.
		long l3 = 10; // ���θ�� �Ͼ.
		// float f = 10.00; ���� �Ͼ.
		
		char ch1 = 'A';
		System.out.println("ch1: " + ch1);
		// ����� ���� 65��� 66�� �ڽ� ��
		// ��� ���� �˰��� ���
		// A - �θ��, B - ���
		char ch2 = 65; // �����ڵ�� A
		System.out.println("ch2: " + ch2);
		
		// ������� ��ü ��������� �ƴ� ������ ��ü ������ ��쿡��
		// ���ڿ��� ���� ��� ���Ǯ�� ���� ������ �ּҸ� �Բ� �����ϱ� ������
		// �� ��ü�� �ּҰ��� �����ȴ�.
		String str1 = "Test";
		String str2 = "Test";

		if (str1 == str2) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
		
		if (str1.equals(str2)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ���");
		}
	}
}
