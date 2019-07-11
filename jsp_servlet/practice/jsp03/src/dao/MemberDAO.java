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
	
	// 회원가입
	public void addMember(MyMemberDTO dto) {
		// mybatis 환경설정으로부터 매퍼에 접속할 수 있는 Session 객체를 생성
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("mymember.add", dto);
		ss.commit();
		ss.close();
	}

	// 아이디 중복확인용
	public int getIdCount(String id) {
		// select문의 결과가 단일행
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("mymember.idcheck", id);
		ss.close();
		return cnt;
	}
	
}
