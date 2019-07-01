package ex1;

public class DemoConst {

	// 2. 현재 객체의 참조 자료형을 선언
	private static DemoConst dc;
	// 1. 외부에서 new 생성 못하게 한다.
	private DemoConst() {
		// TODO Auto-generated constructor stub
		System.out.println("생성자 호출!");
	}
	// 3. 싱글톤 메서드를 정의
	public static DemoConst getDc() {
		// null은 heap영역에 존재하는 키워드
		// 참조하지 않는 객체의 주소값, 선언은 했는데 생성이 되지 않은 상태
		// ex) Scanner sc; 선언 (null을 참조하고 있는 상태)
		// 실행 sc.nextLine(); // nullpointException 발생
		if (dc == null) {
			dc = new DemoConst();
		}
		return dc;
	}
	
}
