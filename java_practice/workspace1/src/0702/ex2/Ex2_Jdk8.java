package ex2;

public interface Ex2_Jdk8 {

	public int num2 = 20;
	public void num1();
	// jdk8부터 지원
	public static void test() {
		System.out.println("static Test");
	}
	public default String test2() {
		return "본사 비법으로 만들어진 조미료";
	}
}
