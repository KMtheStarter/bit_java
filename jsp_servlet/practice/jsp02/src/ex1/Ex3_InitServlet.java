package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ex3_InitServlet extends HttpServlet {
	private String email, tel;
	private String company;
	
	@Override
	public void init() throws ServletException {
		email = getServletConfig().getInitParameter("email");
		tel = getServletConfig().getInitParameter("tel");	// 다른 서블릿에서는 사용 불가능한 값
		company = getServletContext().getInitParameter("company"); // 다른 서블릿에서도 사용 가능한 값
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter out = resp.getWriter();
		out.println("<p>Email: ");
		out.println(email);
		out.println("</p>");
		out.println("<p>tel: ");
		out.println(tel);
		out.println("</p>");
		out.println("<hr>");
		out.println("<p>company: ");
		out.println(company);
		out.println("</p>");
	}
	
	
	
}
