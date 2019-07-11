<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="dto" class="dto.MemberDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>
<%
	try{
		MemberDAO.getDao().addMember(dto);
		response.sendRedirect("success.jsp");
	} catch (Exception ex){
		response.sendRedirect("fail.jsp");
		ex.printStackTrace();
	}
%>