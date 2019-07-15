package model;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import dao.GogekDAO;
import vo.SawonVO;

public class SawonPhoneModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		List<SawonVO> list = GogekDAO.getDao().getSawonPhoneList();
		req.setAttribute("splist", list);
		return new ActionForward("sawonphoneList.jsp", false);
	}

	
}
