package ex1;

public class DemoConst {

	// 2. ���� ��ü�� ���� �ڷ����� ����
	private static DemoConst dc;
	// 1. �ܺο��� new ���� ���ϰ� �Ѵ�.
	private DemoConst() {
		// TODO Auto-generated constructor stub
		System.out.println("������ ȣ��!");
	}
	// 3. �̱��� �޼��带 ����
	public static DemoConst getDc() {
		// null�� heap������ �����ϴ� Ű����
		// �������� �ʴ� ��ü�� �ּҰ�, ������ �ߴµ� ������ ���� ���� ����
		// ex) Scanner sc; ���� (null�� �����ϰ� �ִ� ����)
		// ���� sc.nextLine(); // nullpointException �߻�
		if (dc == null) {
			dc = new DemoConst();
		}
		return dc;
	}
	
}
