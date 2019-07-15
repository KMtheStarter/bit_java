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
		f = new SimpleDateFormat("yyyy년 MM월 dd일");
	}
	
	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		BizClass v = new BizClass();
		v.setBizV("비즈니스 로직");
		req.setAttribute("v", v);
		req.setAttribute("todate", f.format(new Date()));
		return new ActionForward("today.jsp", false);
	}
}
