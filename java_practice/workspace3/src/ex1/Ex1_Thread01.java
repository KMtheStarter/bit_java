package ex1;

public class Ex1_Thread01 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
	
	public static void main(String[] args) {
		Ex1_Thread01 t1 = new Ex1_Thread01();
		t1.start();
		t1 = new Ex1_Thread01();
		t1.start();
	}

	
}
