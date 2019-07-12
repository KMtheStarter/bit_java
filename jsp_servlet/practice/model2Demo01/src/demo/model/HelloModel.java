package demo.model;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloModel implements ModelInter{
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String str = "hello";
		// view에 표시할 값을 requestScope에 저장.
		req.setAttribute("str", str);
		// view 선정
		return "hello.jsp";
	}
}
