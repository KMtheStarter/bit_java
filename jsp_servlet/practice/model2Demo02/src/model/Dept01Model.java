package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import dao.GogekDAO;
import vo.DeptVO;

public class Dept01Model implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		List<DeptVO> list = GogekDAO.getDao().getDeptList();
		req.setAttribute("dlist", list);
		return new ActionForward("deptList.jsp", false);
	}

}
