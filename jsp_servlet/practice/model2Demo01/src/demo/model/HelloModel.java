package demo.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloModel implements ModelInter{
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String str = "hello";
		// view�� ǥ���� ���� requestScope�� ����.
		req.setAttribute("str", str);
		// view ����
		return "hello.jsp";
	}
}
