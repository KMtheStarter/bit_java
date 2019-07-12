package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import dto.MemberDTO;
import service.FactoryService;

public class MemberDAO implements MemberInter{

	private static MemberDAO dao;
	private MemberDAO() {}
	public synchronized static MemberDAO getDao() {
		if (dao == null) dao = new MemberDAO();
		return dao;
	}
	@Override
	public void addMember(MemberDTO dto) {

		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("member.add", dto);
		ss.commit();
		ss.close();
	}

	@Override
	public int getIdCount(String id) {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("member.idcnt", id);
		ss.close();
		return cnt;
	}

	@Override
	public List<MemberDTO> listMember() {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<MemberDTO> list = ss.selectList("member.list");
		ss.close();
		return list;
	}

	@Override
	public MemberDTO searchMember(String name) {
		SqlSession ss = FactoryService.getFactory().openSession();
		MemberDTO dto = ss.selectOne("member.search", name);
		ss.close();
		return dto;
	}

}
