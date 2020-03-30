<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../include/header.jsp" %>
<style>
	section{
		width: 100%;
		height: 569px;
		margin-top: 42px;
	}
	fieldset{
		width: 600px;
		height : 480px;
		margin: 0 auto;
		line-height: 55px;
		margin-top: 80px;
	}
	legend{
		margin-left: 15px;
		border: none;
	}
	fieldset p{
		padding-left: 20px;
	}
	label {
		width: 100px;
		float: left;
	}
</style>
	<section>
		<form action="regi.do" method="post" enctype="multipart/form-data">
			<fieldset>
				<legend>영화 정보</legend>
				<p>
					<label>제목 : </label>
					<input type="text" name="name" placeholder="영화 이름">
				</p>			
				<p>
					<label>상세설명 : </label>
					<textarea rows="10" cols="50" name="content" placeholder="영화 상세 이름"></textarea>
				</p>			
				<p>
					<label>파일 : </label>
					<input type="file" name="file"> <!-- 탐색기가 뜰수 있게 -->
				</p>
				<p>
					<label>상영 시간 : </label>
					<input type="text" name="showTime" placeholder="경로">
				</p>						
				<p>
					<input type="submit" value="전송">
				</p>			
			</fieldset>
		</form>
	</section>
<%@include file="../include/footer.jsp" %>