<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	int cnt = MemberDAO.getDao().getIdCount(id);
	String msg = "";
	
	if (cnt == 0){
		msg = "��� ������ ID�Դϴ�.";
	} else{
		msg = "����� �� ���� ID�Դϴ�.";
	}
%>
<%= id %>��&nbsp;<%= msg %>