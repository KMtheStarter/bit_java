<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>jstldemo</title>
</head>
<body>
	<c:forEach var="e" items="${list}">
	<p>${e.id}, ${e.pwd}, ${e.name}</p>
	</c:forEach>
</body>
</html>