package ex1;

public class Ex7_Operation {
	public static void main(String[] args) {
		// || 는 앞에 TRUE가 나오면 뒤의 것은 실행하지 않는다.
		// 마찬가지로, && 는 앞에 FALSE가 나오면 뒤의 것은 실행하지 않는다.
		int a = 10;
		int b = 20;
		
		boolean c = ((a += 12) > b) || (a == (b += 2));
		System.out.println("c: " + c);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// 전치: 증가하고 실행, 후치: 실행하고 증가
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
		int bit3 = bit1 >> bit2; // bit1: 비트 연산할 변수, bit2: 얼마나 쉬프트 할 것인지
		System.out.println(bit3);
	}
}
