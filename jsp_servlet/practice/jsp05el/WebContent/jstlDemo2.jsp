<%@page import="java.util.ArrayList"%>
<%@page import="actionTag.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	List<Customer> clist = new ArrayList<>();
	Customer cust1 = new Customer();
	Customer cust2 = new Customer();
	Customer cust3 = new Customer();
	Customer cust4 = new Customer();
	Customer cust5 = new Customer();
	cust1.setEmail("a@a.com");
	cust1.setName("홍길동");
	cust1.setPhone("010-1111-2222");
	cust2.setEmail("b@b.com");
	cust2.setName("김길동");
	cust2.setPhone("010-2222-3333");
	cust3.setEmail("c@c.com");
	cust3.setName("이길동");
	cust3.setPhone("010-3333-4444");
	cust4.setEmail("d@d.com");
	cust4.setName("박길동");
	cust4.setPhone("010-4444-5555");
	cust5.setEmail("e@e.com");
	cust5.setName("최길동");
	cust5.setPhone("010-5555-6666");
	clist.add(cust1);
	clist.add(cust2);
	clist.add(cust3);
	clist.add(cust4);
	clist.add(cust5);
	request.setAttribute("customer", clist);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table style="border: 1px solid;">
	<thead><b>customers</b></thead>
	<c:forEach var="e" items="${customer}">
	<tr><td>${e.email}</td></tr>
	<tr><td>${e.name}</td></tr>
	<tr><td>${e.phone}</td></tr>
	</c:forEach>
	</table>
</body>
</html>