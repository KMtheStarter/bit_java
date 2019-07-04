package ex1;

public class Ex2_Main {

	// 실행시켜보면 결과 계속 바뀜. 스레드는 순서가 없다.
	public static void main(String[] args) {
		Ex2_MyThread1 em = new Ex2_MyThread1();
		em.start();
		Thread t1 = new Thread(new Ex2_MyRunnable1());
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println(i + "\t");
		}
	}
}
