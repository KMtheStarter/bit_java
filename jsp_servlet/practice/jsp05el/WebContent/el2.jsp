<%@page import="actionTag.Customer"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	ArrayList<String> singerList = new ArrayList<>();
	singerList.add("�ҳ�ô�");
	singerList.add("�����ɽ�");
	request.setAttribute("singerList", singerList);
	
	Customer[] customerList = new Customer[2];
	Customer cust1 = new Customer();
	cust1.setName("ȫ�浿");
	cust1.setEmail("hong.nate.com");
	cust1.setPhone("011-1234-5678");
	
	Customer cust2 = new Customer();
	cust2.setName("��浿");
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
		<li> �̸� : ${singerList[0]}</li>
		<li> �̸� : ${singerList[1]}</li>
	</ul>
	<ul>
		<li> �̸� : ${customerList[0].name}</li>
		<li> �̸��� : ${customerList[0].email}</li>
		<li> ��ȭ��ȣ : ${customerList[0].phone}</li>
	</ul>
	<ul>
		<li> �̸� : ${customerList[1].name}</li>
		<li> �̸��� : ${customerList[1].email}</li>
		<li> ��ȭ��ȣ : ${customerList[1].phone}</li>
	</ul>
</body>
</html>