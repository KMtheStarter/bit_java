package ex1;

public class Ex1Circle extends Ex1Draw{

	private String resource;
	
	public Ex1Circle() {
		resource = "자식의 자원";
	}
	@Override
	public void drawSomething() {
		// TODO Auto-generated method stub
		System.out.println("circle draw");
	}
	
}
