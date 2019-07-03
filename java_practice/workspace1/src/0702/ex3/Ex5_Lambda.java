package ex3;

public class Ex5_Lambda {

	public static void main(String[] args) {
		// 익명 내부 클래스
		Ex5_MyInter myInter = new Ex5_MyInter() {
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("MyTest");
			}
		};
		
		myInter.myMethod();
		System.out.println("-------------------");
		// 매개변수와 리턴값이 없는 void 일 경우 람다식
		Ex5_MyInter myInter1 = () -> {
			System.out.println("MyTest1");
		};
		myInter1.myMethod();
	}
}
