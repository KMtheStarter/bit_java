<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>today.jsp</title>
</head>
<body>
	<ul>
		<li>Today: ${todate }</li>
		<li>������: ${v.getBizView() }</li>
		<li>BizClass 1: ${v.insertBiz('hello^^') }</li>
		<%-- setter ȣ�� --%>
		<li>BizClass 2: ${v.setBizV('what') }</li>
		<%-- get property ȣ�� --%>
		<li>BizClass 3: ${v.getBizView() }</li>
	</ul>
</body>
</html>