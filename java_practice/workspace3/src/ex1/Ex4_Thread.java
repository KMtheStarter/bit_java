package ex1;

public class Ex4_Thread implements Runnable{

	private int value;

	@Override
	public /*synchronized*/ void run() {
		// TODO Auto-generated method stub
		int i = 0;
		String name = Thread.currentThread().getName();
		
//		synchronized (this) { // 동기화 블록
//			while(i < 3) {
//				System.out.println(name + ", 지역변수 i값: " + (++i));
//				System.out.println(name + ", 멤버필드 value값: " + (++value));
//				// activeCount는 활성화 되어있는 스레드의 수를 나타냄.
//				System.out.println("Thread Active Cnt: " + Thread.activeCount());
//			}
//		}
		
		while(i < 3) {
			System.out.println(name + ", 지역변수 i값: " + (++i));
			System.out.println(name + ", 멤버필드 value값: " + (++value));
			// activeCount는 활성화 되어있는 스레드의 수를 나타냄.
			System.out.println("Thread Active Cnt: " + Thread.activeCount());
		}
		
	}
	
	// 동기화를 해주지 않으면 멤버변수의 값이 순서가 엉망으로 나올 때가 있음.
	public static void main(String[] args) {
		// Runnable을 구현한 클래스의 주소를 Thread의 생성자로 전달해 start()를 호출 가능.
		Ex4_Thread th = new Ex4_Thread();
		new Thread(th).start();
		new Thread(th).start();
	}
	
}
