<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mailistdemo</title>
</head>
<body>
<!-- �̸�, ����, �̸��� -->
<div>
	<form id="mailF" action="mailprocess.jsp", method="post">
	<p>�̸�: <input type="text" name="name" id="name"></p>
	<p>����: <input type="number" name="age" id="age" min="19"></p>
	<p>�̸���: <input type="email" name="email" id="email" placeholder="�̸��� �Է�" required="required"></p>
	<p><input type="submit" value="����"></p>
	</form>
</div>
</body>
</html>