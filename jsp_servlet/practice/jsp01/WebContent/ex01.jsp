<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex01.jsp</title>
</head>
<body>
<%-- jsp �ּ�. ���������� �ؼ� �ȵ�. �� ���ø����̼� �ܿ��� Ȯ�� ����. --%>
<!-- html �ּ�. ���������� �ؼ� �Ǵ� �ּ� -->
<%
	// ������ service �޼��� ����: ���� ����
%>
<%!
	// ����: �޼���, ������� ... ������ �������
	String msg = "hello";
%>
<%-- Servlet �ȿ� out.println("���������� �ؼ��� ����") --%>
<%=msg%>
</body>
</html>