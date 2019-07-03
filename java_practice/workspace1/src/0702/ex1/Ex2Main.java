package ex1;

// 5개의 추상 메소드 중 첫 번째 메소드만 필요
public class Ex2Main extends Ex2WindowDemo{

	public static void main(String[] args) {
		// 1. 상속을 받아서 재정의 하는 방법
		Ex2Main ref = new Ex2Main();
		ref.exec1(); // 5개 다 뜬다.
		
		// 2. 추상 클래스를 직접 익명 내부 클래스로 재정의를 할 경우
		new Ex2WindowDemo() {
			@Override
			public void exec1() {
				// TODO Auto-generated method stub
				System.out.println("다른 방법");
			}
		}.exec1();
	}
}
