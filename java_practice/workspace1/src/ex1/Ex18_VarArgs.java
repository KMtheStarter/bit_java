package ex1;
// �ٸ� ��Ű������ Ŭ���� �����
import exam.BoardVO;
public class Ex18_VarArgs {
	// VarArgs: ���� ���� ���� ���� ��� (�迭 *)
	// ����: �޼��� �����ε��� �� ���� �ذ�
	// ����: ���� �ڷ����� �ش�
	// jdk 5.0���� ����
	// ���ڰ� ...
	public void test(BoardVO ... str) {
		for(BoardVO e: str) {
			System.out.println(e.getNumber());
			System.out.println(e.getWriter());
		}
	}
	
	public static void main(String[] args) {
		Ex18_VarArgs ref = new Ex18_VarArgs();
		BoardVO v1 = new BoardVO();
		v1.setWriter("��浿");
		v1.setNumber(1);
		BoardVO v2 = new BoardVO();
		v2.setWriter("�����");
		v2.setNumber(2);
		
		ref.test(v1, v2);
	}
}
