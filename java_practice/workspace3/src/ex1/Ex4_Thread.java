package ex1;

public class Ex4_Thread implements Runnable{

	private int value;

	@Override
	public /*synchronized*/ void run() {
		// TODO Auto-generated method stub
		int i = 0;
		String name = Thread.currentThread().getName();
		
//		synchronized (this) { // ����ȭ ���
//			while(i < 3) {
//				System.out.println(name + ", �������� i��: " + (++i));
//				System.out.println(name + ", ����ʵ� value��: " + (++value));
//				// activeCount�� Ȱ��ȭ �Ǿ��ִ� �������� ���� ��Ÿ��.
//				System.out.println("Thread Active Cnt: " + Thread.activeCount());
//			}
//		}
		
		while(i < 3) {
			System.out.println(name + ", �������� i��: " + (++i));
			System.out.println(name + ", ����ʵ� value��: " + (++value));
			// activeCount�� Ȱ��ȭ �Ǿ��ִ� �������� ���� ��Ÿ��.
			System.out.println("Thread Active Cnt: " + Thread.activeCount());
		}
		
	}
	
	// ����ȭ�� ������ ������ ��������� ���� ������ �������� ���� ���� ����.
	public static void main(String[] args) {
		// Runnable�� ������ Ŭ������ �ּҸ� Thread�� �����ڷ� ������ start()�� ȣ�� ����.
		Ex4_Thread th = new Ex4_Thread();
		new Thread(th).start();
		new Thread(th).start();
	}
	
}
