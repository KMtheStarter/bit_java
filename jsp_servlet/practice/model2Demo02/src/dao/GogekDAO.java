package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import service.FactoryService;
import vo.DeptVO;
import vo.GogekVO;
import vo.SawonVO;
import vo.SearchVO;

public class GogekDAO {

	private static GogekDAO dao;
	private GogekDAO() {}
	public static synchronized GogekDAO getDao() {
		if (dao == null) dao = new GogekDAO();
		return dao;
	}
	
	public List<GogekVO> getList() {
		// �б� ó���� �� ���� searchList�� �־ ��ǻ� �ʿ䰡 ����.
		SqlSession ss = FactoryService.getFactory().openSession();
		List<GogekVO> list = ss.selectList("gogek.list");
		ss.close();
		return list;
	}
	
	public List<GogekVO> searchList(SearchVO svo) {
		SqlSession ss = FactoryService.getFactory().openSession();
		List<GogekVO> list = ss.selectList("gogek.search", svo);
		ss.close();
		return list;
	}
	
	// ������ʹ� resultMap ����
	public List<DeptVO> getDeptList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<DeptVO> list = ss.selectList("sawon.showDept");
		ss.close();
		return list;
	}
	
	public List<SawonVO> getSawonPhoneList(){
		SqlSession ss = FactoryService.getFactory().openSession();
		List<SawonVO> list = ss.selectList("sawon.sawonList2");
		ss.close();
		return list;
	}
}
