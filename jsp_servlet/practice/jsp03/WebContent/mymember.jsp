<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>mymember</title>
</head>
<body>	
	<form method="post" action="myjoin.jsp">
		<fieldset>
			<legend>�˻�</legend>
			���̵�:<br><input type="text" name="id" id="id">
			<input type="button" value="�ߺ�Ȯ��" id="btn1"><br>
			<div id="target"></div>
			��й�ȣ:<br><input type="password" name="pwd"><br>
			�̸�:<br><input type="text" name="name"><br>
			<br><br><input type="submit" value="submit">
		</fieldset>
	</form>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	$(function(){
		$('#btn1').click(function(){
			//console.log("Test");
			$.ajax({
				// �񵿱������ ���� ������ �ּҿ� ��
				url: "myvalid.jsp?id="+$('#id').val(),
				// ������ �������� �� callback �Լ��� �����͸� �޴´�.
				// data: ������ ������
				success: function(data){
					console.log(data);
					$('#target').css("width", "300").css('background', 'yellow').html(data);
				}
			});
		});
	});
</script>
</html>