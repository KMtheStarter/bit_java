<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>includeA.jsp</title>
</head>
<body>
	<div>
		<%-- 컴파일시에 하나의 서블릿으로 변환, 변수를 공유 --%>
		<%@include file="includeB.jsp"%>
		<%= num %>
	</div>
</body>
</html>