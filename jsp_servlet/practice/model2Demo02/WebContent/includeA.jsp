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
		<%-- �����Ͻÿ� �ϳ��� �������� ��ȯ, ������ ���� --%>
		<%@include file="includeB.jsp"%>
		<%= num %>
	</div>
</body>
</html>