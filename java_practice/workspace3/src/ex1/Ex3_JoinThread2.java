package ex1;

public class Ex3_JoinThread2 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
