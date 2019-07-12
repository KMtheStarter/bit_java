<%@page import="dao.BbsDao"%>
<%@page import="vo.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="vo" class="vo.BbsVO"/>
<jsp:setProperty name="vo" property="*"/>
<%
	request.setCharacterEncoding("euc-kr");
	vo.setReip(request.getRemoteAddr());
	try{
		BbsDao.getDao().addPost(vo);
		response.sendRedirect("success.jsp");
	} catch (Exception ex){
		response.sendRedirect("fail.jsp");
		ex.printStackTrace();
	}
%>