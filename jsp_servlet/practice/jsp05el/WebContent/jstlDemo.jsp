<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	List<String> arlist = new ArrayList<>();
	arlist.add("��浿1");
	arlist.add("��浿2");
	arlist.add("��浿3");
	arlist.add("��浿4");
	arlist.add("��浿5");
	arlist.add("��浿7");
	arlist.add("��浿8");
	arlist.add("��浿9");
	arlist.add("��浿10");
	arlist.add("��浿11");
	request.setAttribute("list", arlist);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h3>${list}</h3>
		<table style="border:1px solid;">
			<tr><td>�̸�</td></tr>
			<%--
				for(String e: list)
			 --%>
			 <c:forEach var="e" items="${list}">
			<tr><td>${e}</td></tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>