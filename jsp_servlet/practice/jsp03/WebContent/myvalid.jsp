<%@ page import="dao.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- ajax�� ������ ��ũ��Ʈ --%>
<%-- �� ���� ������ ���� --%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	int cnt = MemberDAO.getDao().getIdCount(id);
	String msg ="";
	if(cnt == 0){
		msg = "��� ������ ID";
	} else{
		msg = "����� �� ���� ID";
	}
%>
<%= msg %>-<%= id %>