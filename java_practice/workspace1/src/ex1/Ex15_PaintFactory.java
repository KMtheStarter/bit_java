package ex1;

public class Ex15_PaintFactory {

	private Ex15_Home home; // new�� �����ϸ� �� ���̽��� �����ϴ� ��. ���⼭�� ���Ӱ��谡 �ƴ� �������� Ȱ��
	
	public void usesPaint(Ex15_Home home, String color) {
		this.home = home;
		this.home.setDoorColor(color);
	}
}
