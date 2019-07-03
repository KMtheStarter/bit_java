package ex2;

public interface Ex1_Inter {

	public static final int num1 = 10; // 상수
	abstract public void test(); // 추상메서드
	
	// 축약형. 인터페이스에서는 static final과 abstract 모두 안붙여도 자동으로 처리됨.
	public int num2 = 20; // 상수
	public void test2(); // 추상메서드
}
