package ex1;

public class Ex14_Main {

	public static void main(String[] args) {
		// Ex14_Member
		Ex14_Member m = new Ex14_Member();
		
		// 회원의 이름을 입력.
		m.setName("김길동");
		System.out.println(m.getName());
		
		m.setPay(100, "12");
		System.out.println(m.getPay());
	}
}
