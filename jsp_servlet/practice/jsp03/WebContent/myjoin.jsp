<%@ page import="dao.MemberDAO" %>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR" %>
<%
	request.setCharacterEncoding("euc-kr");
%>
<%-- DTO Bean ���� --%>
<jsp:useBean id="vo" class="dto.MyMemberDTO" />
<%-- vo.set*(request.getParameter(*)) �� ���� ���� --%>
<jsp:setProperty property="*" name="vo" />
<%
	try{
		MemberDAO.getDao().addMember(vo);
		response.sendRedirect("success.jsp");
	} catch(Exception ex){
		ex.printStackTrace();
		response.sendRedirect("fail.jsp");
	}
	
	
%>