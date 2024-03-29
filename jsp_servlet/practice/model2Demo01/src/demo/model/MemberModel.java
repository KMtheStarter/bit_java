package demo.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.vo.MemberVO;

public class MemberModel implements ModelInter{
	// model2의 구조에서 모델의 원리를 파악하기 위한 예제
	public String execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		// 핵심 비즈니스 로직을 수행
		List<MemberVO> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			MemberVO v = new MemberVO();
			v.setId("bit" + i);
			v.setName("비트인" + i);
			v.setPwd("bit" + i);
			list.add(v);
		}
		// view에 표시할 값이 있다면, requestScope에 저장.
		req.setAttribute("list", list);
		// view를 선정
		return "jstldemo.jsp";
	}
}
