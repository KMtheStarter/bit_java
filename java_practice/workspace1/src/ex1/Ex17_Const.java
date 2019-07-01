package ex1;

public class Ex17_Const {

	private String msg;
	public Ex17_Const(String msg) {
		// TODO Auto-generated constructor stub
		this.msg = msg;
	}
	
	public void print() {
		System.out.println(msg);
	}
	public void print(String str) {
		msg = str;
		System.out.println(msg);
	}
	
	public static void main(String[] args) {
		Ex17_Const ref = new Ex17_Const("hello");
		ref.print();
		ref.print("bye");
	}
}
