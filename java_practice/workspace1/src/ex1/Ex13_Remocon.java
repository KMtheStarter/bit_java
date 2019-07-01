package ex1;

// 클래스를 정의: 설계 도면, 재사용하기 위해서 Heap 영역에 생성하여 참조변수로 참조, 사용한다.
// this는 자기 자신의 클래스의 주소를 참조.
public class Ex13_Remocon {

	// 속성
	boolean power; // true: on / false: off
	int chNum; // 채널의 범위: 1~100
	
	// setPower가 호출 될 때 인자 값으로 boolean 값을 받아서
	// 멤버 필드 power에 저장하고 그 값을 판별한 후 적절한 출력을 담당.
	public void setPower(boolean power) {
		// 멤버변수에 저장
		this.power = power;
		if (power == true) { // 프로그램으로 실행!
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}
	
	// 멤버 필드 chNum 세팅
	public void setChNum(int chNum) {
		this.chNum = chNum;
	}
	public String viewControl() {
		return "지금 채널은: " + chNum + "입니다.";
	}
}
