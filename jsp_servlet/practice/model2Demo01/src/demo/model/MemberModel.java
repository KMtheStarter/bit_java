package demo.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.vo.MemberVO;

public class MemberModel implements ModelInter{
	// model2�� �������� ���� ������ �ľ��ϱ� ���� ����
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// �ٽ� ����Ͻ� ������ ����
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			MemberVO v = new MemberVO();
			v.setId("bit" + i);
			v.setName("��Ʈ��" + i);
			v.setPwd("bit" + i);
			list.add(v);
		}
		// view�� ǥ���� ���� �ִٸ�, requestScope�� ����.
		req.setAttribute("list", list);
		// view�� ����
		return "jstldemo.jsp";
	}
}
