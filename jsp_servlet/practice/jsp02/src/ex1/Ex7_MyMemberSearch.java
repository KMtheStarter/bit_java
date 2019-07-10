package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import conn.ConnDriver;
import dao.MemberDAO;
import dao.MemberInter;
import dto.MyMemberDTO;

@WebServlet("/search")
public class Ex7_MyMemberSearch extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("euc-kr");

		PrintWriter pw = new PrintWriter(resp.getWriter());
		List<MyMemberDTO> list = new ArrayList<MyMemberDTO>();
		MemberInter dao = MemberDAO.getDao();
		try {
			list = dao.getListMember(req.getParameter("name").trim());
			StringBuffer sb = new StringBuffer();
			for (MyMemberDTO rs: list) {
				sb.append(rs.getId()).append("  ").append(rs.getName()).append("  ").append(rs.getEdate()).append("\n");
			}
			pw.println(sb.toString());
		} catch (SQLException e) {
			pw.println("<script>alert('fail')</script>");
			e.printStackTrace();
		}

		

	}

}
