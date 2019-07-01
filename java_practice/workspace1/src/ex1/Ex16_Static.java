package ex1;

public class Ex16_Static {

	private static int num1;
	private int num2;
	public void startTest() {
		num1++;
		num2++;
	}
	public static int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	
}
