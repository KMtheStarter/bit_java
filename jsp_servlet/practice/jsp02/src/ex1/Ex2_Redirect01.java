package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation 없이
public class Ex2_Redirect01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("첫 번째 페이지!");
		String msg = "hello";
		// RequestScope에 값을 저장 해본다.
		request.setAttribute("msg", msg);
		response.sendRedirect("second"); // 경로 앞에 / 를 붙이면 절대경로가 되어버림 ㅠ
		
//		PrintWriter out = response.getWriter();
//		out.println("first page");
//		out.println("<hr>");
//		out.close();
	}

}

//web.xml에 추가
//<servlet>
//<servlet-name>first</servlet-name>
//<servlet-class>ex1.Ex2_Redirect01</servlet-class>
//</servlet>
//<servlet-mapping>
//<servlet-name>first</servlet-name>
//<url-pattern>/first</url-pattern>
//</servlet-mapping>