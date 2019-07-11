<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	int cnt = MemberDAO.getDao().getIdCount(id);
	String msg = "";
	
	if (cnt == 0){
		msg = "사용 가능한 ID입니다.";
	} else{
		msg = "사용할 수 없는 ID입니다.";
	}
%>
<%= id %>는&nbsp;<%= msg %>