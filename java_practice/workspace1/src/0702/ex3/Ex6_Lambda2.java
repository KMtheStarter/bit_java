package ex3;

public class Ex6_Lambda2 {

	public static void main(String[] args) {
		new Ex6_MyInter2() {	
			@Override
			public void myMethod(int argN) {
				// TODO Auto-generated method stub
				int res = argN * 2;
				System.out.println("Result1: " + res);
			}
		}.myMethod(100);
		
		Ex6_MyInter2 inter2 = (argN) -> {
			int res = argN * 3;
			System.out.println("Result2: " + res);
		};
		
		inter2.myMethod(100);
		
		// 매개변수가 하나일 경우는 {} 생략 가능.
		Ex6_MyInter2 inter3 = argN ->
			System.out.println("Result3: " + argN * 4);
		inter3.myMethod(100);
	}
}
