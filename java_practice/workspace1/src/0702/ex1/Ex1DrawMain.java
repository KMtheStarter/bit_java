package ex1;

public class Ex1DrawMain {

	public static void main(String[] args) {
		Ex1Draw[] ref = new Ex1Draw[3];
		ref[0] = new Ex1Circle();
		ref[1] = new Ex1Rect();
		ref[2] = new Ex1Triangle();
		
		for (Ex1Draw i: ref) {
			i.drawSomething();
		}
	}
	
}
