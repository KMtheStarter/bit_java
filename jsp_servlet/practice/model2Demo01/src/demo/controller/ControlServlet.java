package demo.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.model.HelloModel;
import demo.model.MemberModel;
import demo.model.ModelInter;
// 모든 요청을 담당
@WebServlet("*.bit")
public class ControlServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	protected void doProcess (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("euc-kr");
		// 요청을 분석: http://localhost/model2Demo01/index.bit?cmd=memlist
		String cmd = req.getParameter("cmd");
		// 다형성을 적용한 컨트롤러 작업 완료, 결합도 저하.
		ModelInter model = null;
		if (cmd.equals("hello")) {
			model = new HelloModel();
		} else if (cmd.equals("member")) {
			model = new MemberModel();
		}
		String view = model.execute(req, resp);
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}

	
}
