package ex2;

public class Ex2_DefaultImple implements Ex2_Jdk8{

	@Override
	public void num1() {
		// TODO Auto-generated method stub
	
		System.out.println("본사의 비법을 써봅시다.");
		System.out.println("-----------");
		System.out.println(test2());
		System.out.println("-----------");
		
		Ex2_Jdk8.test(); // static 메서드 호출
	}
	
	

	public static void main(String[] args) {
		Ex2_Jdk8 ref = new Ex2_DefaultImple();
		ref.num1();
	}
	
}
