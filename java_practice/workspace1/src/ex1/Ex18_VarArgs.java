package ex1;
// 다른 패키지에서 클래스 끌어옴
import exam.BoardVO;
public class Ex18_VarArgs {
	// VarArgs: 가변 길이 인자 전달 방식 (배열 *)
	// 장점: 메서드 오버로딩을 한 번에 해결
	// 단점: 같은 자료형만 해당
	// jdk 5.0부터 가능
	// 인자값 ...
	public void test(BoardVO ... str) {
		for(BoardVO e: str) {
			System.out.println(e.getNumber());
			System.out.println(e.getWriter());
		}
	}
	
	public static void main(String[] args) {
		Ex18_VarArgs ref = new Ex18_VarArgs();
		BoardVO v1 = new BoardVO();
		v1.setWriter("김길동");
		v1.setNumber(1);
		BoardVO v2 = new BoardVO();
		v2.setWriter("김수아");
		v2.setNumber(2);
		
		ref.test(v1, v2);
	}
}
