package ex3;

public class Ex5_Lambda {

	public static void main(String[] args) {
		// �͸� ���� Ŭ����
		Ex5_MyInter myInter = new Ex5_MyInter() {
			@Override
			public void myMethod() {
				// TODO Auto-generated method stub
				System.out.println("MyTest");
			}
		};
		
		myInter.myMethod();
		System.out.println("-------------------");
		// �Ű������� ���ϰ��� ���� void �� ��� ���ٽ�
		Ex5_MyInter myInter1 = () -> {
			System.out.println("MyTest1");
		};
		myInter1.myMethod();
	}
}
