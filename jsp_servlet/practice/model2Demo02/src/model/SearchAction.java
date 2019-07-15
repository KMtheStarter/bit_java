package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import dao.GogekDAO;
import vo.GogekVO;
import vo.SearchVO;

public class SearchAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		// search문이 있으면 전체 list를 출력하는 것이 필요없다.
//		List<GogekVO> list1 = GogekDAO.getDao().getList(); 
		SearchVO svo = new SearchVO();
//		req.setAttribute("list1", list1);
		svo.setSearchType(req.getParameter("searchType"));
		svo.setSearchValue(req.getParameter("searchValue"));
		List<GogekVO> list2 = GogekDAO.getDao().searchList(svo);
		req.setAttribute("list2", list2);
		return new ActionForward("search.jsp", false);
	}
	
	

	
}
