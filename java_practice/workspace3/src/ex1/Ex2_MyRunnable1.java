package ex1;

public class Ex2_MyRunnable1 implements Runnable{

	// Thread를 구현한 클래스이기 때문에 추상메서드인 run()만 가지고있다.
	// 따라서 getName()을 사용하려면 현재 스래드의 주소를 가져와 아래처럼 사용한다.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("@---@" + Thread.currentThread().getName());
	}

	
}
