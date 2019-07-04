package ex1;

public class Ex3_JoinMain {

	private static long startTime = 0;
	public static void main(String[] args) {
		Ex3_JoinThread1 th1 = new Ex3_JoinThread1();
		Ex3_JoinThread2 th2 = new Ex3_JoinThread2();
		startTime = System.currentTimeMillis();
		
		try { // join은 해당 프로세스가 종료 할 때 까지 다른 프로세스들을
			// 경쟁상태에서 대기하도록 지정하는 메서드.
			th1.start();
			th1.join();
			th2.start();
			th2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(System.currentTimeMillis() - startTime);
	}
}
