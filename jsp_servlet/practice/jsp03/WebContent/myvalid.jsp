<%@ page import="dao.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- ajax용 서버측 스크립트 --%>
<%-- 웹 상의 공백을 제거 --%>
<%@ page trimDirectiveWhitespaces="true" %>
<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	int cnt = MemberDAO.getDao().getIdCount(id);
	String msg ="";
	if(cnt == 0){
		msg = "사용 가능한 ID";
	} else{
		msg = "사용할 수 없는 ID";
	}
%>
<%= msg %>-<%= id %>