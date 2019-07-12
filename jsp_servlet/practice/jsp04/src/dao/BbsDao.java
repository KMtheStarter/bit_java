package dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.BbsVO;

public class BbsDao {

	private static BbsDao dao;
	private BbsDao() {}
	public synchronized static BbsDao getDao() {
		if (dao == null) dao = new BbsDao();
		return dao;
	}
	
	public void addPost(BbsVO vo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		ss.insert("bbs.addpost", vo);
		ss.commit();
		ss.close();
	}
	
	public List<BbsVO> listPost(Map<String, Integer> map) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<BbsVO> list = ss.selectList("bbs.listpost", map);
		ss.close();
		return list;
	}
	
	public int getCnt() {
		SqlSession ss = FactoryService.getFactory().openSession();
		int cnt = ss.selectOne("bbs.cnt");
		ss.close();
		return cnt;
	}
}
