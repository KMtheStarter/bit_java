<%@page import="conn.ConnDriver"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	
	<form method="post" action="search">
		<fieldset>
			<legend>�˻�</legend>
			�̸�:<br><input type="text" name="name"><br>
			<br><br> <input type="submit" value="�˻�">
		</fieldset>
	</form>
</body>
</html>