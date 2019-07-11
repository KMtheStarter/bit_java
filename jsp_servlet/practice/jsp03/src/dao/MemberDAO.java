package dao;

import org.apache.ibatis.session.SqlSession;

import dto.MyMemberDTO;
import service.FactoryService;

public class MemberDAO {

	private static MemberDAO dao;
	private MemberDAO() {}
	public synchronized static MemberDAO getDao() {
		if (dao == null) dao = new MemberDAO();
		return dao;
	}
	
	// ȸ������
	public void addMember(MyMemberDTO dto) {
		// mybatis ȯ�漳�����κ��� ���ۿ� ������ �� �ִ� Session ��ü�� ����
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("mymember.add", dto);
		ss.commit();
		ss.close();
	}

	// ���̵� �ߺ�Ȯ�ο�
	public int getIdCount(String id) {
		// select���� ����� ������
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("mymember.idcheck", id);
		ss.close();
		return cnt;
	}
	
}
