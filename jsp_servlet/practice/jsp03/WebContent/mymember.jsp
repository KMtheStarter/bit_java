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
			<legend>검색</legend>
			아이디:<br><input type="text" name="id" id="id">
			<input type="button" value="중복확인" id="btn1"><br>
			<div id="target"></div>
			비밀번호:<br><input type="password" name="pwd"><br>
			이름:<br><input type="text" name="name"><br>
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
				// 비동기식으로 보낼 서버의 주소와 값
				url: "myvalid.jsp?id="+$('#id').val(),
				// 응답이 성공했을 때 callback 함수로 데이터를 받는다.
				// data: 서버의 데이터
				success: function(data){
					console.log(data);
					$('#target').css("width", "300").css('background', 'yellow').html(data);
				}
			});
		});
	});
</script>
</html>