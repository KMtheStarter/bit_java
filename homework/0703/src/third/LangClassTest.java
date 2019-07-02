package third;

public class LangClassTest {

	public static void main(String[] args) {
		Integer i = new Integer(10);
		Character c = new Character('4');
		Double d = new Double(3.1234566);
		
		System.out.println(Character.toLowerCase('A'));
		if (Character.isDigit(c)) {
			System.out.println(Character.getNumericValue(c));
		}
		
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10", 16));
		System.out.println(Integer.toBinaryString(28)); // 2진수로 표현된 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 2진수에서 1의 개수
		System.out.println(Integer.toHexString(28)); // 16진수 문자열로 변환
		System.out.println(i.doubleValue()); // 정수를 double형으로 변환
		System.out.println(d.toString()); // double을 문자열로 변환
		System.out.println(Double.parseDouble("44.13e-16")); // 문자열을 double로 변환
	}
}
