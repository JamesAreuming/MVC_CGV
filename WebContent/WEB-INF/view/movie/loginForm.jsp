<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	section{
		width: 100%;
		height: 600px;
		text-align: center;
 		position: relative;
	}
	fieldset {
		width: 400px;
		height: 100px;
 		position: absolute;
		left: 750px;
		top: 250px;
	}
	label {
		width: 100px;
		float: left;
	}
</style>
</head>
<body>
	<jsp:include page="../include/header.jsp" flush="false"/>
	<section>
		<form action="sessionloginResult.jsp" method="post">
			<fieldset>
				<legend>로그인</legend>
				<label>아이디</label>
				<input type="text" name="id"><br>
				<label>암호</label>
				<input type="password" name="pass"><br>	
				<input type="submit" value="로그인">	
			</fieldset>
			</form>
	</section>
	<jsp:include page="../include/footer.jsp" flush="false"/>	
</body>
</html>