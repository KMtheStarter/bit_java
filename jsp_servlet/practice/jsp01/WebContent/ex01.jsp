<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex01.jsp</title>
</head>
<body>
<%-- jsp 주석. 브라우저에서 해석 안됨. 웹 어플리케이션 단에서 확인 가능. --%>
<!-- html 주석. 브라우저에서 해석 되는 주석 -->
<%
	// 서블릿의 service 메서드 영역: 로컬 영역
%>
<%!
	// 선언문: 메서드, 멤버변수 ... 서블릿의 멤버영역
	String msg = "hello";
%>
<%-- Servlet 안에 out.println("브라우저에서 해석될 내용") --%>
<%=msg%>
</body>
</html>