package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex1_Hello")
public class Ex1_Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Ex1_Hello() {
        System.out.println("������ ȣ��!");
    }

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init ȣ��!");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet �޼��� ȣ��!");
		// �������� ��Ʈ���� ����.
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html; charset=UTF-8");
		
		out.println("�Է� ���� ��: " + request.getParameter("msg"));
		out.close();
	}

	@Override
	public void destroy() {
		System.out.println("destroy ȣ��!");
	}
	
}
