package ex1;

public class Ex7_Operation {
	public static void main(String[] args) {
		// || �� �տ� TRUE�� ������ ���� ���� �������� �ʴ´�.
		// ����������, && �� �տ� FALSE�� ������ ���� ���� �������� �ʴ´�.
		int a = 10;
		int b = 20;
		
		boolean c = ((a += 12) > b) || (a == (b += 2));
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// ��ġ: �����ϰ� ����, ��ġ: �����ϰ� ����
		int x = 10;
		int y = 10;
		int z = 0;
		System.out.println("x: " + (++x));
		System.out.println("y: " + (y++));
		System.out.println("z: " + (z++));
		System.out.println("z: " + z);
		int e = 1;
		System.out.println(e++);
		System.out.println(++e);
		
		int bit1 = 12; // 0 0 0 0 1 1 0 0
		int bit2 = 2; // 0 0 0 0 0 0 1 0
		int bit3 = bit1 >> bit2; // bit1: ��Ʈ ������ ����, bit2: �󸶳� ����Ʈ �� ������
		System.out.println(bit3);
	}
}
