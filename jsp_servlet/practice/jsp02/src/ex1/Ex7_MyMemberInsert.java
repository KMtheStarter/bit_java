package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDAO;
import dao.MemberInter;
import dto.MyMemberDTO;

@WebServlet("/signup")
public class Ex7_MyMemberInsert extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("euc-kr");
		
		PrintWriter pw = new PrintWriter(resp.getWriter());
		MemberInter dao = MemberDAO.getDao();
		MyMemberDTO dto = new MyMemberDTO();

		dto.setId(req.getParameter("id"));
		dto.setPwd(req.getParameter("pwd"));
		dto.setName(req.getParameter("name"));
		
		try {
			dao.addMember(dto);
			pw.println("<script>alert('success')</script>");
		} catch (SQLException e) {
			pw.println("<script>alert('fail')</script>");
			e.printStackTrace();
		}
		
	}

	
}
