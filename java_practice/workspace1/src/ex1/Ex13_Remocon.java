package ex1;

// Ŭ������ ����: ���� ����, �����ϱ� ���ؼ� Heap ������ �����Ͽ� ���������� ����, ����Ѵ�.
// this�� �ڱ� �ڽ��� Ŭ������ �ּҸ� ����.
public class Ex13_Remocon {

	// �Ӽ�
	boolean power; // true: on / false: off
	int chNum; // ä���� ����: 1~100
	
	// setPower�� ȣ�� �� �� ���� ������ boolean ���� �޾Ƽ�
	// ��� �ʵ� power�� �����ϰ� �� ���� �Ǻ��� �� ������ ����� ���.
	public void setPower(boolean power) {
		// ��������� ����
		this.power = power;
		if (power == true) { // ���α׷����� ����!
			System.out.println("������ �������ϴ�.");
		} else {
			System.out.println("������ �������ϴ�.");
		}
	}
	
	// ��� �ʵ� chNum ����
	public void setChNum(int chNum) {
		this.chNum = chNum;
	}
	public String viewControl() {
		return "���� ä����: " + chNum + "�Դϴ�.";
	}
}
