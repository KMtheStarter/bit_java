package ex1;

public class Ex16_Main {

	public static void main(String[] args) {
		Ex16_Static ref1 = new Ex16_Static();
		Ex16_Static ref2 = new Ex16_Static();
		
		ref1.startTest();
		ref2.startTest();
	
		System.out.println("static num1: " + ref1.getNum1());
		System.out.println("non static num2: " + ref1.getNum2());
		System.out.println("----------------------------------");
		System.out.println("static num1: " + ref2.getNum1());
		System.out.println("non static num2: " + ref2.getNum2());
	}
}
