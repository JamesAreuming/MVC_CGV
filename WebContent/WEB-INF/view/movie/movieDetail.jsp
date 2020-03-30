<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="cgv.deagu.model.Movie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <jsp:useBean id="movieMgr" class="cgv.deagu.model.MovieManager" scope="application"/>
<%
	String sIndex = request.getParameter("index");
	int index = Integer.parseInt(sIndex);
	ArrayList<Movie> list = movieMgr.getList();
	Movie movie = list.get(index);
	pageContext.setAttribute("movie", movie);
%> --%>
<%@include file="../include/header.jsp" %>
<style>
	section{
		width: 100%;
	}
	table {
		width: 770px;
		margin: 0 auto;
	}
</style>
	<section>
		<table>
			<td><img src="${pageContext.request.contextPath}/movieIMG/${detail.file}"></td>
			<td>
				<h2>${detail.name }</h2>
				<h4> < 줄거리 > </h4>
				${detail.content}
		 	</td>
		</table>
	</section>
<%@include file="../include/footer.jsp" %>