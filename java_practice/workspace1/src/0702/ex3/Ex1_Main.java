package ex3;

public class Ex1_Main {

	public static void main(String[] args) {
		// 1. 외부 클래스 생성
		Ex1_MemberInner outer = new Ex1_MemberInner();
		// 2. 외부 클래스의 주소값을 저장한 참조 변수 outer를 통해 내부 클래스를 생성
		outer.SuperA();
		// 내부 클래스의 참조 자료형
		Ex1_MemberInner.Inner inner;
		inner = outer.new Inner();
		inner.PrintData();
		inner.SuperB();
		System.out.println("-------------------------");
		
		// 연습문제
		// 외부 클래스 생성 후 내부 클래스를 생성하고자 할 때
		// 한 줄로 생성하고 바로 printData()
		new Ex1_MemberInner().new Inner().PrintData();
		new Ex1_MemberInner().new Inner().SuperB();
	}
}
