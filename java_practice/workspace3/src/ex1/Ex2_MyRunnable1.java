package ex1;

public class Ex2_MyRunnable1 implements Runnable{

	// Thread�� ������ Ŭ�����̱� ������ �߻�޼����� run()�� �������ִ�.
	// ���� getName()�� ����Ϸ��� ���� �������� �ּҸ� ������ �Ʒ�ó�� ����Ѵ�.
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("@---@" + Thread.currentThread().getName());
	}

	
}
