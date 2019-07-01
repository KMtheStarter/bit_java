package ex1;

public class Ex15_PaintFactory {

	private Ex15_Home home; // new로 생성하면 한 케이스만 지정하는 것. 여기서는 종속관계가 아닌 의존관계 활용
	
	public void usesPaint(Ex15_Home home, String color) {
		this.home = home;
		this.home.setDoorColor(color);
	}
}
