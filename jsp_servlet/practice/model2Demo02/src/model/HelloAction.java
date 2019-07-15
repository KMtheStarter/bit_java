package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import action.Action;
import action.ActionForward;

public class HelloAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp) {
		req.setAttribute("m", "hello"); // request scope를 사용했다 -> forwarding 하겠다.
		return new ActionForward("hello.jsp", false);
	}

}
