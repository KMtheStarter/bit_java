<%@page import="dao.MemberDAO"%>
<%@page import="dto.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	MemberDTO dto = MemberDAO.getDao().searchMember("%" + request.getParameter("name") + "%");
	StringBuffer sb = new StringBuffer();
	// id, name, zipcode, address
	sb.append(dto.getId()).append("&nbsp&nbsp");
	sb.append(dto.getName()).append("&nbsp&nbsp");
	sb.append(dto.getZipcode()).append("&nbsp&nbsp");
	sb.append(dto.getAddress());
%>
<%= sb.toString() %>