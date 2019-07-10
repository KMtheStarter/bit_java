package ex1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firstForward")
public class Ex3_Forward01 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ù ��° ������!");
		
		String msg = "hello";
		// RequestScope�� ���� ���� �غ���.
		req.setAttribute("msg", msg);
		// ���� ������ req, res�� �Բ� �����ϸ鼭 second�� ������ �Ѵ�.
		// url ���� ����. requestScope���� ����
		RequestDispatcher rd = req.getRequestDispatcher("second");
		rd.forward(req, resp);
	}

	
}
