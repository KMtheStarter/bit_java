package second;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		Integer i2 = new Integer("10");
		Double d = new Double("3.14");
		Boolean b2 = new Boolean("false");
	}
}
