package ex1;

public class Ex3_Demotion {
	public static void main(String[] args) {
		// 4byte 이하의 연산은 JVM이 연산시 자동으로 4byte로 승격시켜서 연산한다.
		// demotion: 큰 자료형의 값을 작은 자료형으로. 연산시 반드시 캐스팅을 명시적으로 해야 한다.
		// promotion: 작은 자료형의 값을 큰 자료형으로. 캐스팅은 묵시적으로 일어난다.
		byte n1 = 10;
		byte n2 = 20;
		// byte n3 = n1 + n2 는 컴파일 오류.
		byte n3 = (byte) (n1 + n2);
		
		int res = n1 + n2;
		// short로도 해보기
		short sh1 = 100;
		short sh2 = 200;
		short sh3 = (short) (sh1 + sh2);
		System.out.println("sh3 :" + sh3);
		
		int resOper = (100 * 2 / 3 % 5);
		System.out.println(resOper);
		
		long l = 10l;
		long l2 = 10L; // 해당 메모리에 데이터 들어감.
		long l3 = 10; // 프로모션 일어남.
		// float f = 10.00; 디모션 일어남.
		
		char ch1 = 'A';
		System.out.println("ch1: " + ch1);
		// 저장된 값이 65라면 66이 자식 글
		// 댓글 연산 알고리즘에 사용
		// A - 부모글, B - 댓글
		char ch2 = 65; // 유니코드로 A
		System.out.println("ch2: " + ch2);
		
		// 명시적인 객체 생성방법이 아닌 묵시적 객체 생성일 경우에는
		// 문자열이 같을 경우 상수풀에 값을 저장한 주소를 함께 공유하기 때문에
		// 두 객체의 주소값은 공유된다.
		String str1 = "Test";
		String str2 = "Test";

		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str1.equals(str2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
	}
}
