package ex1;

public class Ex3_JoinMain {

	private static long startTime = 0;
	public static void main(String[] args) {
		Ex3_JoinThread1 th1 = new Ex3_JoinThread1();
		Ex3_JoinThread2 th2 = new Ex3_JoinThread2();
		startTime = System.currentTimeMillis();
		
		try { // join�� �ش� ���μ����� ���� �� �� ���� �ٸ� ���μ�������
			// ������¿��� ����ϵ��� �����ϴ� �޼���.
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
