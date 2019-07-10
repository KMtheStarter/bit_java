package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reqDemo")
public class Ex4_HttpServletRequestDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		myMethod(req, resp);
		System.out.println(req.getServletContext().getInitParameter("company"));
		System.out.println("hi");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		myMethod(req, resp);
	}

	private void myMethod(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=euc-kr"); // mime타입
		
		System.out.println("getRequestURL: " + req.getRequestURL());
		System.out.println("IP: " + req.getRemoteAddr());
		System.out.println("Path: " + req.getContextPath());
		System.out.println("contentType: " + req.getContentType()); // get 방식이라 null
		System.out.println("Method: " + req.getMethod());
		PrintWriter out = resp.getWriter();
		out.println("<img src='img/1.jpg' style='width:150px;'>");
		
	}
}
