package ex3;

public class Ex1_Main {

	public static void main(String[] args) {
		// 1. �ܺ� Ŭ���� ����
		Ex1_MemberInner outer = new Ex1_MemberInner();
		// 2. �ܺ� Ŭ������ �ּҰ��� ������ ���� ���� outer�� ���� ���� Ŭ������ ����
		outer.SuperA();
		// ���� Ŭ������ ���� �ڷ���
		Ex1_MemberInner.Inner inner;
		inner = outer.new Inner();
		inner.PrintData();
		inner.SuperB();
		System.out.println("-------------------------");
		
		// ��������
		// �ܺ� Ŭ���� ���� �� ���� Ŭ������ �����ϰ��� �� ��
		// �� �ٷ� �����ϰ� �ٷ� printData()
		new Ex1_MemberInner().new Inner().PrintData();
		new Ex1_MemberInner().new Inner().SuperB();
	}
}
