package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/indexServlet")
public class Ex5_IndexServlet extends HttpServlet {
	// xml, json -> ���������� �ؼ���
	// session -> linux���� temp�� session�� ����Ǵµ�, �����Ͽ� read ����.
	// ���� ��й�ȣ�� �̰��� �����ϸ� �ȵ�.

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=euc-kr");
		PrintWriter out = resp.getWriter();
		// ���ο� Session�� �����ϴ��� ���� üũ false : ��������
		HttpSession session = req.getSession(false);
		if (session != null) {
			String sessionId = session.getId();
			System.out.println("���Ǿ��̵�:" + sessionId);
			String uid = (String) session.getAttribute("uid");
			out.println(uid + "�� �ݰ����ϴ�.");
			out.println("<a href='logout'>�α׾ƿ�</a>");
		} else {
			out.println("<a href=''>ȸ������</a> | ");
			out.println("<a href='loginForm.html'>�α���</a>  ");
		}

	}
}
