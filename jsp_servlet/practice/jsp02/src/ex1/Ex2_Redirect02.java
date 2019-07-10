package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/second")
public class Ex2_Redirect02 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("�� ��° ������!");
		// requestScope�� ����� ���� ���� �غ���.
		String msg = (String) request.getAttribute("msg");
		System.out.println("msg: " + msg); // �ʱ�ȭ�Ǽ� ��Ÿ���� ����.
		
		PrintWriter out = response.getWriter();
		out.println("<p style='color:red'>");
		out.println("second page");
		out.println("</p><hr>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
