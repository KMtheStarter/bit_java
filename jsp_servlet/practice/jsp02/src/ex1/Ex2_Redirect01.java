package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// annotation ����
public class Ex2_Redirect01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("ù ��° ������!");
		String msg = "hello";
		// RequestScope�� ���� ���� �غ���.
		request.setAttribute("msg", msg);
		response.sendRedirect("second"); // ��� �տ� / �� ���̸� �����ΰ� �Ǿ���� ��
		
//		PrintWriter out = response.getWriter();
//		out.println("first page");
//		out.println("<hr>");
//		out.close();
	}

}

//web.xml�� �߰�
//<servlet>
//<servlet-name>first</servlet-name>
//<servlet-class>ex1.Ex2_Redirect01</servlet-class>
//</servlet>
//<servlet-mapping>
//<servlet-name>first</servlet-name>
//<url-pattern>/first</url-pattern>
//</servlet-mapping>