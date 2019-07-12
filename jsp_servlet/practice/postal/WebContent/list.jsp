<%@page import="dao.MemberDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.MemberDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	List<MemberDTO> list = new ArrayList<>();
	list = MemberDAO.getDao().listMember();
	StringBuffer sb = new StringBuffer();
	
	for(MemberDTO e: list){
		// id, name, zipcode, address
		sb.append(e.getId()).append("&nbsp&nbsp");
		sb.append(e.getName()).append("&nbsp&nbsp");
		sb.append(e.getZipcode()).append("&nbsp&nbsp");
		sb.append(e.getAddress()).append("<br>");
	}
%>
<%= sb.toString() %>	