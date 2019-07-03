package ex1;

public abstract class Ex1Draw {
	private String msg;
	public abstract void drawSomething();
	
	
	public Ex1Draw() {
		msg = "부모의 자원";
	}


	public String getMsg() {
		return msg;
	}
	
}
