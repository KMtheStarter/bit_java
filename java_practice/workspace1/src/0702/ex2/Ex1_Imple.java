package ex2;

public class Ex1_Imple implements Ex1_Inter{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상수 값: " + num1);
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상수 값: " + num2);
		
	}
	
	public static void main(String[] args) {
		Ex1_Inter ref = new Ex1_Imple();
		ref.test();
		ref.test2();
	}

	
}
