<%@page import="actionTag.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	ArrayList<String> singerList = new ArrayList<>();
	singerList.add("소녀시대");
	singerList.add("원더걸스");
	request.setAttribute("singerList", singerList);
	
	Customer[] customerList = new Customer[2];
	Customer cust1 = new Customer();
	cust1.setName("홍길동");
	cust1.setEmail("hong.nate.com");
	cust1.setPhone("011-1234-5678");
	
	Customer cust2 = new Customer();
	cust2.setName("김길동");
	cust2.setEmail("kim.nate.com");
	cust2.setPhone("011-4567-8910");
	
	customerList[0] = cust1;
	customerList[1] = cust2;
	
	request.setAttribute("customerList", customerList);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li> 이름 : ${singerList[0]}</li>
		<li> 이름 : ${singerList[1]}</li>
	</ul>
	<ul>
		<li> 이름 : ${customerList[0].name}</li>
		<li> 이메일 : ${customerList[0].email}</li>
		<li> 전화번호 : ${customerList[0].phone}</li>
	</ul>
	<ul>
		<li> 이름 : ${customerList[1].name}</li>
		<li> 이메일 : ${customerList[1].email}</li>
		<li> 전화번호 : ${customerList[1].phone}</li>
	</ul>
</body>
</html>