package ex1;

public class Ex13_Main {
	public static void main(String[] args) {
		Ex13_Remocon ref = new Ex13_Remocon();
		ref.setPower(true);
		ref.setChNum(5);
		String chMsg = ref.viewControl();
		System.out.println("Msg: " + chMsg);
	}
}
