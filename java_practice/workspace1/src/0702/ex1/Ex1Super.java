package ex1;

public class Ex1Super {

	// 부모클래스를 container, base적인 개념으로 설계.
	// 자식들의 공통점을 추상적으로 설계 - 추상클래스
	public Ex1Super() {
		System.out.println("부모 클래스의 생성자 호출!");
	}
	
	public void superTest() {
		System.out.println("부모 클래스의 메서드 호출!");
	}
	
	public void mytest() {
		System.out.println("재정의 될 메서드!");
	}
}
