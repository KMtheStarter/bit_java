package model;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;
import obj.BizClass;

public class TodayAction implements Action {

	private SimpleDateFormat f;
	public TodayAction() {
		f = new SimpleDateFormat("yyyy�� MM�� dd��");
	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		BizClass v = new BizClass();
		v.setBizV("����Ͻ� ����");
		req.setAttribute("v", v);
		req.setAttribute("todate", f.format(new Date()));
		return new ActionForward("today.jsp", false);
	}
}
